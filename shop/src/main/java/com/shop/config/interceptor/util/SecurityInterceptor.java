package com.shop.config.interceptor.util;

import com.shop.common.TokenUtil;
import com.shop.entity.RoleDo;
import com.shop.common.UserInfoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class SecurityInterceptor   implements HandlerInterceptor {

    @Autowired
    private UserInfoUtil userInfoUtil;

    private boolean hasPermission(Object handler, HttpServletResponse response) throws Exception {
        log.warn("<==========开始验证权限==========>");
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Auth auths = handlerMethod.getMethod().getAnnotation(Auth.class);

            if (auths == null) {
                auths = handlerMethod.getMethod().getDeclaringClass().getAnnotation(Auth.class);
            }
            if (auths != null)
                log.warn("<==========需要的权限==========>:[{}]", auths.permissions());

            if (this.verificationAnth(TokenUtil.getUserId(),auths)){
                log.warn("<==========权限验证通过==========>");
                return true;
            }
        }
        log.warn("<==========请求权限验证不通过==========>:");
        return false;
    }

    private Boolean verificationAnth(Long id,Auth auths) throws Exception {
        List<RoleDo> roleDos = userInfoUtil.getUserRole(id);
        List<String> roles = roleDos.stream().map(RoleDo::getRoleDesc).collect(Collectors.toList());
        log.warn("<==========拥有的权限==========>: [{}]", roles.toString());
        if (auths != null) {
            String[] s = auths.permissions().split(",");
            for (String str : roles) {
                for (String o : s) {
                    if (o.equals(str)) {
                        log.warn("<==========权限验证通过==========>: [{}]", str);
                        return true;
                    }
                }
            }
        } else {
            log.warn("<==========请求不需要权限==========>:");
            return true;
        }
        return null;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return this.hasPermission(handler, response);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

package com.shop.interceptor.util;

import com.alibaba.fastjson.JSONArray;
import com.shop.common.TokenUtil;
import com.shop.result.Result;
import com.shop.result.util.ResultModel;
import com.shop.shopEnum.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        if (null == token) {
            log.error("=============   无效token的信息！=================");
            this.writer(response, Result.errorResultModel(ResultEnum.TOKEN_OVERDUE.code, ResultEnum.TOKEN_OVERDUE.message));
            return false;
        }

        String userId = TokenUtil.verify(token);
        if (userId == null) return false;
        request.setAttribute(TokenUtil.USER_ID, Long.valueOf(userId));
        log.error("=============   token验证通过！=================");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }


    private void writer(HttpServletResponse response, ResultModel resultModel) throws Exception {
        String json = JSONArray.toJSON(resultModel).toString();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }

}

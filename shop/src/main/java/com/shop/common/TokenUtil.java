package com.shop.common;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Data
@Slf4j
public class TokenUtil {

    private static final long EXPIRE_TIME = 30 * 60 * 1000;
    private static final String TOKEN_SECRET = "token456";
    public static final String USER_ID = "userId";

    public static Long getUserId() {
        Long userId = null;
        userId = (Long) ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getAttribute(USER_ID);
        return userId == null ? 0L : userId;
    }


    /**
     * 生成签名，15分钟过期
     *
     * @param **username**
     * @param **password**
     * @return
     */
    public static <T> String sign(Long t) {
        try {
            // 设置过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            // 私钥和加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            //生成token字符串
            String token = JWT.create()
                    .withHeader(header)
                    .withClaim(USER_ID, null == t ? null : t.toString())
                    .withExpiresAt(date)
                    .sign(algorithm);
            log.info("token =========== > "+ token);
            // 返回token字符串
            return token;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 检验token是否正确
     *
     * @param **token**
     * @return
     */
    public static String verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            Map<String, Claim> map = jwt.getClaims();
            return map.get(USER_ID).asString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

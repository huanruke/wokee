package com.kobe.utils;

import com.kobe.component.SpringContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis工具类
 */
public class RedisUtils {

    private static RedisTemplate redisTemplate = null;

    /**
     * 获取 RedisTemplate
     * @return RedisTemplate
     */
    public static RedisTemplate getRedisTemplate(){
        if (redisTemplate == null) {
            synchronized (RedisUtils.class) {
                if (redisTemplate == null) {
                    redisTemplate = SpringContextUtils.getApplicationContext().getBean(RedisTemplate.class);
                }
            }
        }
        return redisTemplate;
    }

}

package me.zhoudongyu.controller;

import me.zhoudongyu.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Steve
 * @date 2019/04/11
 */

@RestController
public class BasicController {

    @Autowired
    protected RedisOperator redis;

    protected static final String USER_REDIS_SESSION ="user-redis-session";
}
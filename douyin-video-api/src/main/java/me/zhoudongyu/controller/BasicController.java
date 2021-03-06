package me.zhoudongyu.controller;

import me.zhoudongyu.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基础Controller类
 *
 * @author Steve
 * @date 2019/04/11
 */

@RestController
public class BasicController {

    @Autowired
    protected RedisOperator redis;

    /**
     * 存放在redis中的用户token常量
     */
    protected static final String USER_REDIS_TOKEN = "user-redis-token";

    /**
     * ffmpeg所在目录
     */
    protected static final String FFPEG_EXE = "D:\\Program Files (x86)\\ffmpeg\\bin\\ffmpeg.exe";

    /**
     * 每页分页的记录数
     */
    protected static final Integer PAGE_SIZE = 5;


}

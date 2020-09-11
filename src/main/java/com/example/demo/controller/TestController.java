package com.example.demo.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.demo.service.ITestService;
import com.example.demo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * TODO
 *
 * @author by tianxiang.chi
 * @date 2020-05-07 11:14
 */
@RestController
@RequestMapping("test")
public class TestController {
//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private ITestService testService;

    @GetMapping("test")
    public String test() {
        redisUtil.set("aaa", "test1");
//        String url = ((DruidDataSource)dataSource).getUrl();
        return "=====4444.1====" + redisUtil.get("aaa") + "====" + testService.getCount();
    }

    @GetMapping("keepAlive")
    public String keepAlive() {
        return "success";
    }
}

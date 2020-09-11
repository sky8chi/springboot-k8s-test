package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author by tianxiang.chi
 * @date 2020/8/28 5:44 PM
 */
@Service
public class TestService implements ITestService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getCount(){
        return jdbcTemplate.queryForObject("select count(1) from category", String.class);
    }
}

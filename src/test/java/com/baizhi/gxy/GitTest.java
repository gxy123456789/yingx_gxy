package com.baizhi.gxy;

import com.baizhi.gxy.dao.AdminDao;
import com.baizhi.gxy.dao.UserMapper;
import com.baizhi.gxy.entity.User;
import com.baizhi.gxy.entity.UserExample;
import com.baizhi.gxy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitTest {

    @Autowired
    AdminDao adminDao;

    @Resource
    UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    public void contextLossads() {
        int a=10;

    }




}

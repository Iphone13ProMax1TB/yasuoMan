package com.yx;

import com.yx.sys.entity.User;
import com.yx.sys.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class XxAdminApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        final List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}

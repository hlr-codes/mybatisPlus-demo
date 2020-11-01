package com.hlr.mybatisplusdemo.samples;

import com.hlr.mybatisplusdemo.entity.User;
import com.hlr.mybatisplusdemo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: ${Description}
 * @Author: huanglr
 * @CreateTime: 2019-10-20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectMax(){
        System.out.println(userMapper.selectMaxAge());
    }


}
package com.hlr.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hlr.mybatisplusdemo.entity.User;
import com.hlr.mybatisplusdemo.mapper.UserMapper;
import com.hlr.mybatisplusdemo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}

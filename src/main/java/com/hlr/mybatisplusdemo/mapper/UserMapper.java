package com.hlr.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlr.mybatisplusdemo.entity.User;

/**
 * userMapper
 * @Author: huanglr
 * @CreateTime: 2019-10-20
 */
public interface UserMapper extends BaseMapper<User> {
    Integer selectMaxAge();
}

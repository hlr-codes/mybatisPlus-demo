package com.hlr.mybatisplusdemo.entity;

import lombok.Data;

/**
 * user实体
 * @Author: huanglr
 * @CreateTime: 2019-10-20
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
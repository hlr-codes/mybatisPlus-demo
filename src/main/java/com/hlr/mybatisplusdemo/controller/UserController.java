package com.hlr.mybatisplusdemo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hlr.mybatisplusdemo.entity.User;
import com.hlr.mybatisplusdemo.service.UserService;
import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public R<IPage<User>> list(@RequestParam Map<String, Object> flow, Query query) {
        IPage<User> pages = userService.page(Condition.getPage(query), Condition.getQueryWrapper(flow, User.class));


        return R.data(pages);
    }


}

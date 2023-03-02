package com.wms.controller;


import com.wms.entity.User;
import com.wms.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2023-03-03
 */
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    @GetMapping("/test")
    public String hello(){
        return "hello wns";
    }


    @GetMapping("/list")
    public List<User> list(){
        return  userService.list();

    }
}

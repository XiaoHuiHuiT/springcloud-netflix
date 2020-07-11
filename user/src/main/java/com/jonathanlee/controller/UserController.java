package com.jonathanlee.controller;

import com.jonathanlee.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    // 注入restTemplate
    private final RestTemplate restTemplate;

    public UserController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /*
    @RequestMapping("/getUser")
    public ResponseResult getUser() {
        return ResponseResult.success("My User Data");
    }
    */

    /*
    @RequestMapping("/getUser")
    public ResponseResult getUser() {
        return ResponseResult.success("调用成功！", restTemplate.getForObject("http://localhost:8000/getGoods", Object.class));
    }
    */

    @RequestMapping("/getUser")
    public ResponseResult getUser() {
        return ResponseResult.success("调用成功！", restTemplate.getForObject("http://localhost:80/getGoods", Object.class));
    }

}
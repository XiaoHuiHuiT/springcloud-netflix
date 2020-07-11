package com.jonathanlee.controller;

import com.jonathanlee.util.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: GoodsController
 * date: 2020-07-11 10:33
 * author: 30315
 * version: 1.0
 */
@RestController
public class Goods2Controller {

    @RequestMapping("/getGoods")
    public ResponseResult getUser() {
        return ResponseResult.success("My Goods2 Data");
    }

}

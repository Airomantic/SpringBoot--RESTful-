package com.panda.crossdomain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @program: cross-domain
 * @description:
 * @author: jiangzq
 * @create: 2019-10-31 10:11
 **/
@RestController
public class ApiController {
    @RequestMapping(value = "/get")
    public HashMap<String, Object> get(@RequestParam(value = "name", required = false, defaultValue = "张三") String name) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("title", "CORS Test");
        hashMap.put("name", name);
        return hashMap;
    }
}

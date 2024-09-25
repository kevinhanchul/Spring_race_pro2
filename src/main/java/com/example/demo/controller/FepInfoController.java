package com.example.demo.controller;

import com.example.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/userInfo")
public class FepInfoController {

    private final UserInfoService userInfoService;

    public FepInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/getUserInfo")
    public Map<String, Object> getUserInfo(@RequestParam Long id) {
        return userInfoService.getUserInfo(id);
    }    
}

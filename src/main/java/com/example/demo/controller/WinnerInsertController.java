package com.example.demo.controller;

import com.example.demo.service.UserInsertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userInsert")
public class WinnerInsertController {

    private final UserInsertService userInsertService;

    public WinnerInsertController(UserInsertService userInsertService) {
        this.userInsertService = userInsertService;
    }

    @GetMapping("/getUserInsert")
    public void getUserInsert(@RequestParam Long id) {
        userInsertService.getUserInsert(id);
    }    
}

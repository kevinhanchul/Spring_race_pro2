package com.example.demo.controller;

import com.example.demo.service.UserInsertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/winnerInsert")
public class WinnerInsertController {

    private final UserInsertService winnerInsertService;

    public WinnerInsertController(UserInsertService winnerInsertService) {
        this.winnerInsertService = winnerInsertService;
    }

    @GetMapping("/getUserInsert")
    public void getUserInsert(@RequestParam Long id) {
        winnerInsertService.getUserInsert(id);
    }    
}

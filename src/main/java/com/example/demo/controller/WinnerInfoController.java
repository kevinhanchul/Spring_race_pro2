package com.example.demo.controller;

import com.example.demo.service.WinnerInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/winnerInfo")
public class WinnerInfoController {

    private final WinnerInfoService winnerInfoService;

    public WinnerInfoController(WinnerInfoService winnerInfoService) {
        this.winnerInfoService = winnerInfoService;
    }

    @GetMapping("/getWinnerInfo")
    public Map<String, Object> getWinnerInfo(@RequestParam Long id) {
        return winnerInfoService.getWinnerInfo(id);
    }    
}

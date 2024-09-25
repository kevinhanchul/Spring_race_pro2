package com.example.demo.controller;

import com.example.demo.service.SellService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/selfLimit")
public class SelfLimitController {

    private final SellService selfLimitService;

    public SelfLimitController(SellService selfLimitService) {
        this.selfLimitService = selfLimitService;
    }

    @GetMapping("/getSell")
    public Map<String, Object> getSell(@RequestParam Long id) {
        return selfLimitService.getSell(id);
    }    
}

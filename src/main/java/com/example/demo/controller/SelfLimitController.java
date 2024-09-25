package com.example.demo.controller;

import com.example.demo.service.SelfLimitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/selfLimit")
public class SelfLimitController {

    private final SelfLimitService selfLimitService;

    public SelfLimitController(SelfLimitService selfLimitService) {
        this.selfLimitService = selfLimitService;
    }

    @GetMapping("/getSelfLimit")
    public Map<String, Object> getSelfLimit(@RequestParam Long id) {
        return selfLimitService.getSelfLimit(id);
    }    
}

package com.example.demo.controller;

import com.example.demo.service.FepInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/fepInfo")
public class FepInfoController {

    private final FepInfoService fepInfoService;

    public FepInfoController(FepInfoService fepInfoService) {
        this.fepInfoService = fepInfoService;
    }

    @GetMapping("/getFepInfo")
    public Map<String, Object> getFepInfo(@RequestParam Long id) {
        return fepInfoService.getFepInfo(id);
    }    
}

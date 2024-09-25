package com.example.demo.controller;

import com.example.demo.service.RaceInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/raceInfo")
public class SellInsertController {

    private final RaceInfoService raceInfoService;

    public SellInsertController(RaceInfoService raceInfoService) {
        this.raceInfoService = raceInfoService;
    }

    @GetMapping("/getRaceInfo")
    public Map<String, Object> getRaceInfo(@RequestParam Long id) {
        return raceInfoService.getRaceInfo(id);
    }    
}

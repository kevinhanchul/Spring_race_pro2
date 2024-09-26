package com.example.demo.controller;

import com.example.demo.service.SellInsertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/sellInsert")
public class SellInsertController {

    private final SellInsertService sellInsertService;

    public SellInsertController(SellInsertService sellInsertService) {
        this.sellInsertService = sellInsertService;
    }

    @GetMapping("/getSellInsert")
    public Map<String, Object> getSellInsert(@RequestParam Long id) {
        return sellInsertService.getSellInsert(id);
    }    
}

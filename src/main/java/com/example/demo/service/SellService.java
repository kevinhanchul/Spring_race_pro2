package com.example.demo.service;

import com.example.demo.mapper.SellMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SellService {

    private final SellMapper sellMapper;

    public SellService(SellMapper sellMapper) {
        this.sellMapper = sellMapper;
    }

    public Map<String, Object> getSell(Long id) {
    	Map<String, Object> sell_info = sellMapper.selSell(id);
        return sell_info;
    }
}

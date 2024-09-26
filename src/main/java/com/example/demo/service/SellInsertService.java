package com.example.demo.service;

import com.example.demo.mapper.SellInsertMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SellInsertService {

    private final SellInsertMapper sellInsertMapper;

    public SellInsertService(SellInsertMapper sellInsertMapper) {
        this.sellInsertMapper = sellInsertMapper;
    }

    public Map<String, Object> getSellInsert(Long id) {
        return sellInsertMapper.selSellInsert(id);
    }
}

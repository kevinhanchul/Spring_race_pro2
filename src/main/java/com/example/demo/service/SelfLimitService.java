package com.example.demo.service;

import com.example.demo.mapper.SellMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SelfLimitService {

    private final SellMapper selfLimitMapper;

    public SelfLimitService(SellMapper selfLimitMapper) {
        this.selfLimitMapper = selfLimitMapper;
    }

    public Map<String, Object> getSell(Long id) {
    	Map<String, Object> selfLimit_info = selfLimitMapper.selSell(id);
        return selfLimit_info;
    }
}

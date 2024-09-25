package com.example.demo.service;

import com.example.demo.mapper.SelfLimitMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SelfLimitService {

    private final SelfLimitMapper selfLimitMapper;

    public SelfLimitService(SelfLimitMapper selfLimitMapper) {
        this.selfLimitMapper = selfLimitMapper;
    }

    public Map<String, Object> getSelfLimit(Long id) {
    	//Map<String, Object> selfLimit_info = selfLimitMapper.selSelfLimit(id);
        return selfLimitMapper.selSelfLimit(id);
    }
}

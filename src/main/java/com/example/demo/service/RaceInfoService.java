package com.example.demo.service;

import com.example.demo.mapper.RaceInfoMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RaceInfoService {

    private final RaceInfoMapper raceInfoMapper;

    public RaceInfoService(RaceInfoMapper raceInfoMapper) {
        this.raceInfoMapper = raceInfoMapper;
    }

    public Map<String, Object> getRaceInfo(Long id) {
    	Map<String, Object> race_result = raceInfoMapper.selRaceInfo(id);
        //Map<String, Object> resultMap = new HashMap<>();
        //resultMap.put("race_result", race_result);
        return race_result;
    }
}

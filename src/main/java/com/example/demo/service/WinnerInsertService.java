package com.example.demo.service;

import com.example.demo.mapper.UserInsertMapper;
import org.springframework.stereotype.Service;

@Service
public class WinnerInsertService {

    private final UserInsertMapper winnerInsertMapper;

    public WinnerInsertService(UserInsertMapper winnerInsertMapper) {
        this.winnerInsertMapper = winnerInsertMapper;
    }

    public void getUserInsert(Long id) {
    	winnerInsertMapper.selUserInsert(id);
    }
}

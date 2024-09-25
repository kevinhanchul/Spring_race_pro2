package com.example.demo.service;

import com.example.demo.mapper.UserInsertMapper;
import org.springframework.stereotype.Service;

@Service
public class WinnerInsertService {

    private final UserInsertMapper userInsertMapper;

    public WinnerInsertService(UserInsertMapper userInsertMapper) {
        this.userInsertMapper = userInsertMapper;
    }

    public void getUserInsert(Long id) {
    	userInsertMapper.selUserInsert(id);
    }
}

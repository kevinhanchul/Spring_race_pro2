package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SelfLimitMapper {
	Map<String, Object> selSell(Long id);
}

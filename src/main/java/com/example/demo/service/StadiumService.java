package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.stadium.Stadium;
import com.example.demo.domain.stadium.StadiumDao;
import com.example.demo.web.dto.request.expulsion.SaveDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StadiumService {

	private final StadiumDao stadiumDao;

	public List<Stadium> 경기장목록보기() {
		List<Stadium> stadiumList = stadiumDao.findAll();
		return stadiumList;
	}
	
	public void 경기장등록하기(SaveDto saveDto) {
		Stadium stadium = saveDto.toEntity(saveDto.getName());
		stadiumDao.insert(stadium);
	}
	
}

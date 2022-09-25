package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.expulsion.Expulsion;
import com.example.demo.domain.expulsion.ExpulsionDao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ExpulsionService {
	private final ExpulsionDao expulsionDao;

	public List<Expulsion> 팀목록보기() {
		List<Expulsion> expulsionList = expulsionDao.findAll();
		return expulsionList;
	}
}

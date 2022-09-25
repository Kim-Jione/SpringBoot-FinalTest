package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.team.Team;
import com.example.demo.domain.team.TeamDao;
import com.example.demo.web.dto.request.team.SaveDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TeamService {
	
	private final TeamDao teamDao;
	
	public List<Team> 팀목록보기(){
		List<Team> teamList = teamDao.findAll();
		return teamList;
	}
	
	public void 팀등록하기(SaveDto saveDto){
		Team team = saveDto.toEntity(saveDto.getStadiumId(), saveDto.getName());
		teamDao.insert(team);
	}
}

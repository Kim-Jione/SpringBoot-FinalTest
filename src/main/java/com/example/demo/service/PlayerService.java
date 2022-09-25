package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.player.Player;
import com.example.demo.domain.player.PlayerDao;
import com.example.demo.web.dto.request.player.SaveDto;
import com.example.demo.web.dto.response.PlayerDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PlayerService {

	private final PlayerDao playerDao;

	public List<PlayerDto> 선수목록보기() {
		return playerDao.findAll();
	}

	public void 선수등록하기(SaveDto saveDto) {
		Player player = saveDto.toEntity(saveDto.getTeamId(), saveDto.getName(), saveDto.getPosition());
		playerDao.insert(player);
	}
}

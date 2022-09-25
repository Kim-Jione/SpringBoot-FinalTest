package com.example.demo.domain.player;

import java.util.List;

import com.example.demo.web.dto.response.PlayerDto;

public interface PlayerDao {
	public void insert(Player player);
	public List<PlayerDto> findAll();
	public Player findById(Integer id);
	public void deleteById(Integer id);
	
}

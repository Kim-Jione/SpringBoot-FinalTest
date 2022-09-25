package com.example.demo.web.dto.request.player;

import com.example.demo.domain.player.Player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveDto {
	private Integer teamId;
	private String name;
	private String position;
	
	public Player toEntity(Integer teamId, String name, String postion) {
		Player player = new Player(this.teamId, this.name, this.position);
		return player;
	}
}

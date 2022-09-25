package com.example.demo.domain.player;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	private Integer id;
	private String name;
	private Integer teamId;
	private String position;
	private boolean isExpulsion;
	private Timestamp createdAt;
	
	
	public Player(Integer teamId, String name, String position) {
		this.teamId = teamId;
		this.name = name;
		this.position = position;
	}
	
}

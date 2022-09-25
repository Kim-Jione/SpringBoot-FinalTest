package com.example.demo.web.dto.request.team;

import com.example.demo.domain.team.Team;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveDto {
	private Integer stadiumId;
	private String name;

	public Team toEntity(Integer stadiumId, String name) {
		Team team = new Team(this.stadiumId, this.name);
		return team;
	}
}

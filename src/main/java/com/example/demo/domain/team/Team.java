package com.example.demo.domain.team;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Team {
	public Team(Integer stadiumId, String name) {
		this.stadiumId = stadiumId;
		this.name = name;
	}
	private Integer id;
	private Integer stadiumId;
	private String name;
	private Timestamp createAt;
}

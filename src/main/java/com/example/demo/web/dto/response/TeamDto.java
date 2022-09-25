package com.example.demo.web.dto.response;

import java.sql.Timestamp;

import com.example.demo.domain.stadium.Stadium;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamDto {
	private Integer id;
	private String name;
	private Timestamp createAt;
	
	public Stadium toEntity(String name) {
		Stadium stadium = new Stadium(this.name);
		return stadium;
	}
}

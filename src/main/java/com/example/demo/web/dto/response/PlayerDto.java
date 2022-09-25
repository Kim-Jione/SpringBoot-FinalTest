package com.example.demo.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDto {
	private Integer id;
	private String teamName;
	private String position;
	private String name;
	private Timestamp createdAt;
}

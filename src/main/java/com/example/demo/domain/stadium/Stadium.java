package com.example.demo.domain.stadium;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Stadium {
	public Stadium(String name) {
		this.name = name;
	}
	private Integer id;
	private String name;
	private Timestamp createAt;
}

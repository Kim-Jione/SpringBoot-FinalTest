package com.example.demo.domain.expulsion;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Expulsion {
	private Integer id;
	private String reason;
	private Integer playerId;
	private Timestamp createAt;
}

package com.example.demo.web.dto.request.expulsion;

import com.example.demo.domain.stadium.Stadium;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveDto {
	private String name;
	
	public Stadium toEntity(String name) {
		Stadium stadium = new Stadium(this.name);
		return stadium;
	}
}

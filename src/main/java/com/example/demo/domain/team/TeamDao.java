package com.example.demo.domain.team;

import java.util.List;

import com.example.demo.domain.stadium.Stadium;

public interface TeamDao {
	public List<Team> findAll();
	public void insert(Team team);
	public Stadium findById(Integer id);
	public void deleteById(Integer id);
}

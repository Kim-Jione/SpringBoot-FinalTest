package com.example.demo.domain.expulsion;

import java.util.List;

import com.example.demo.domain.player.Player;

public interface ExpulsionDao {
	public void insert();

	public List<Expulsion> findAll();

	public Player findById(Integer id);

	public void deleteById(Integer id);
}

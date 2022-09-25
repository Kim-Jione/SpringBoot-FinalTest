package com.example.demo.domain.stadium;

import java.util.List;

public interface StadiumDao {
	public void insert(Stadium stadium);
	public List<Stadium> findAll();
	public Stadium findById(Integer id);
	public void deleteById(Integer id);
}

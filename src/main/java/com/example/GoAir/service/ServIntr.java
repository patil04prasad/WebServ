package com.example.GoAir.service;

import java.util.List;

import com.example.GoAir.model.GoAir;

public interface ServIntr 
{
	public void save(GoAir g);
	
	public List<GoAir> getAll();
	
	public GoAir getSingle(int id);
}

package com.example.GoAir.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.GoAir.model.GoAir;

public interface Repos extends CrudRepository<GoAir, Integer> 
{
	
}

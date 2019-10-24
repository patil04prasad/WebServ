package com.example.GoAir.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GoAir.model.GoAir;
import com.example.GoAir.repos.Repos;

@Service
public class ServiceImpl implements ServIntr
{

	@Autowired
	Repos r;
	
	@Override
	public void save(GoAir g) 
	{
			r.save(g);
	}

	@Override
	public List<GoAir> getAll()
	{
		List<GoAir>l=(List<GoAir>) r.findAll();
		return l;
	}

	@Override
	public GoAir getSingle(int id)
	{
		Optional<GoAir> o=	r.findById(id);
		return o.get();
	}

}

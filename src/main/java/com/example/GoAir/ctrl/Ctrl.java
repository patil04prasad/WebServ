package com.example.GoAir.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.GoAir.model.GoAir;
import com.example.GoAir.service.ServiceImpl;

@RestController
public class Ctrl 
{
	@Autowired
	ServiceImpl i;
	
	@RequestMapping(value="/GoAir",consumes="Application/json",method=RequestMethod.POST)
	public void save(@RequestBody GoAir g)
	{
		i.save(g);
	}
	
	@RequestMapping(value="/GoAir",produces="application/json",method=RequestMethod.GET)
	public List<GoAir> getAll()
	{
		return i.getAll();
	}
	
	@RequestMapping(value="/GoAir/get/{id}",consumes="Application/json",method=RequestMethod.GET)
	public GoAir getSingle(@RequestParam int id)
	{
		return i.getSingle(id);
	}
}

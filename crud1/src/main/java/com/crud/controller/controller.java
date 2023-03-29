package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.entity;
import com.crud.service.service;

@RestController
public class controller {
	@Autowired
	private service ss;
	@GetMapping("/h")
	public String getdata()
	{
		return "hello";
	}
	
	//fetching data from data base
	@GetMapping("/fetch")
	public List<entity> get()
	{
		return ss.getdata();
	}
	
	//fetching single data by id 
	@GetMapping("/one/{id}")
	public entity onedate(@PathVariable Long id)
	{
		return ss.getone(id);
	}

	//save data in data base
	@PostMapping("/save")
	public entity savedata(@RequestBody entity ew)
	{
		return ss.save(ew);
	}
	
		
	
	//delete data by id 
	@DeleteMapping("/delete/{id}")
	public void delte(@PathVariable Long id)
	{
		ss.delete(id);
	}
	
	//updating data in database
			@PutMapping("/update/{id}")
			public entity update(@PathVariable Long id,@RequestBody entity ew)
			{
				ew.setId(id);
				return ss.upadte(ew);
			}
	
}

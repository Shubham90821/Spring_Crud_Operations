package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.entity;
import com.crud.repository.repo;
@Service
public class serviceimpl implements service {
	
	@Autowired
	private repo r;
	
	@Override//for fetching
	public List<entity> getdata() {
		
		return r.findAll();
	}

	@Override//for saving 
	public entity save(entity ew) {
		
		return r.save(ew);
	}

	@Override// fetching single data by id 
	public entity getone(Long id) {
		Optional<entity> ew=r.findById(id);
		if(ew.isPresent())
		{
			return ew.get();
		}
		throw new RuntimeException("hello baby "+id);
		
	}

	@Override//deleting the data by id 
	public void delete(Long id) {
		r.deleteById(id);
	}

	@Override//updating data 
	public entity upadte(entity ew) {
		
		return r.save(ew);
	}

	
	
	
	
	

}

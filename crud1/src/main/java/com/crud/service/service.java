package com.crud.service;

import java.util.List;

import com.crud.entity.entity;

public interface service {
	
	//fetching data method
	List<entity> getdata();
	
	//saving data method 
	entity save (entity ew);
	
	// fetching single data by id 
	entity getone(Long id);
	
	//deleting data 
	void delete (Long id);
	
	//updating the data in database
	entity upadte(entity ew);
}

package com.crud.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.crudapi.bean.Marks;
import com.crud.crudapi.bean.Student;

@Repository
public interface MarksRepository extends JpaRepository<Marks, Integer>{

	
	
}

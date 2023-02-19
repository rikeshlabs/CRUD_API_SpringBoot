package com.crud.crudapi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crudapi.bean.Marks;
import com.crud.crudapi.bean.Student;
import com.crud.crudapi.repository.MarksRepository;
import com.crud.crudapi.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository studentRepo;
	
	@Autowired
	public MarksRepository marksRepo;
	
	public List<Student> getAllStudent(){
		List<Student> students = new ArrayList<Student>();
		studentRepo.findAll().forEach(students::add);
		return students;
	}
	
	public Map<String, String> add(Student[] s)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		int count=0;
		for(Student student : s)
			if(studentRepo.save(student) != null)
				count++;
		
		map.put("Message", count + " Number of row inserted");
		map.put("Code", "00");
		
		return map;
	}
	
	public Map<String, String> addMarks(Marks m)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		if(!studentRepo.findById(m.getId()).isEmpty())
			if(marksRepo.save(m)!=null)
				map.put("Message", "Inserted Successfully");
			else
				map.put("Message", "Id not Found");
		else
			map.put("Message", "Id not Found");
			
		map.put("Code", "00");
		
		return map;
	}
	
	public Map<String, Object> getDetails(int id)
	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("studentInfo", studentRepo.findById(id));
		map.put("studentMarks", marksRepo.findById(id));
		
		return map;
	}
	
}

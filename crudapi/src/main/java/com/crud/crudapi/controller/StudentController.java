package com.crud.crudapi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crudapi.bean.Marks;
import com.crud.crudapi.bean.Student;
import com.crud.crudapi.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService StudentSer;
	
	@RequestMapping(method=RequestMethod.GET, value="/student/details/")
	public List<Student> getAllStudent(){
		return StudentSer.getAllStudent();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/student/details/")
	public Map<String, String> addStudent(@RequestBody Student[] s)
	{
		return StudentSer.add(s);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/student/marks/detail")
	public Map<String, String> addMarks(@RequestBody Marks m)
	{
		return StudentSer.addMarks(m);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/student/details/{id}")
	public Map<String, Object> getDetails(@PathVariable int id)
	{
		return StudentSer.getDetails(id);
	}

}

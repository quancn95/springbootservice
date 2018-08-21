package com.fre18.qnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fre18.qnt.entity.Student;
import com.fre18.qnt.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/home", //
            method = RequestMethod.GET )
	public String home(){
		return "home";
	}
	
	@RequestMapping(value = "/students", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE/*, MediaType.APPLICATION_XML_VALUE*/ })
    @ResponseBody
    public List<Student> getEmployees() {
        List<Student> list = studentService.findAll();
        return list;
    }
	
	@RequestMapping(value = "/student", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE/*, MediaType.APPLICATION_XML_VALUE*/ })
    @ResponseBody
    public Student getStudent() {
        Student list = studentService.findById(2);
        return list;
    }
}

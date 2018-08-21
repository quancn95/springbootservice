package com.fre18.qnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.fre18.qnt.entity.Student;
import com.fre18.qnt.service.StudentService;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
@ComponentScan({ "com.fre18.qnt", "com.fre18.qnt.service" })
public class SpringbootserviceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootserviceApplication.class, args);
	}

	@Autowired
	StudentService studentService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Student> list = studentService.findAll();
		for (Student item : list) {
			System.out.print(item.getStudentName()+" ");
		}
		
	}
}

package com.example.employeeapp;

//Imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//An annotation which is used to denote a Spring Boot Application
@SpringBootApplication

//Employee Application class
//It is a class which is used to run our application
public class EmployeeAppApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(EmployeeAppApplication.class, args);
	}
}

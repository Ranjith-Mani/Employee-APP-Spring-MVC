package com.example.employeeapp;

//Imports
import org.springframework.data.mongodb.repository.MongoRepository;

//An interface that extends MongoRepository
public interface EmployeeRepository extends MongoRepository<Employee, String>
{
    Employee findByEmployeeId(String employeeId);
}

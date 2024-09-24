package com.example.employeeapp;

//Imports
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//An annotation which is used to describe the document which is in MONGODB
@Document(collection = "employees")

//Employee Model class
public class Employee
{
    //An annotation which is used to denote a primary key
    @Id

    private String id;
    private String employeeId;
    private String name;
    private String email;
    private String location;

    // Getters and Setters
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
}

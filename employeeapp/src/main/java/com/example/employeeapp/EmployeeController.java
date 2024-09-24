package com.example.employeeapp;

//Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//An annotation which is used to define an entrance point for a Spring web application
@Controller

//Employee Controller Class
//A class which is used to perform CRUD operations
public class EmployeeController
{
    //An annotation that indicate which constructor Spring should use for dependency injection
    @Autowired

    private EmployeeRepository employeeRepository;

    //An annotation which is used to provide response
    @GetMapping("/")

    public String index(Model model)
    {
        model.addAttribute("employee", new Employee());
        return "index";
    }

    //An annotation which is used to provide request
    @PostMapping("/save")

    public String saveEmployee(@ModelAttribute Employee employee)
    {
        employeeRepository.save(employee);
        return "redirect:/displayALL";
    }

    @GetMapping("/displayALL")
    public String displayAllEmployees(Model model)
    {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "displayAll";
    }

    @GetMapping("/display/{employeeId}")
    public String displayEmployee(@PathVariable String employeeId, Model model)
    {
        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        if (employee == null)
        {
            return "redirect:/displayALL"; // Redirect if not found
        }
        model.addAttribute("employee", employee);
        return "displayEmployee";
    }
}


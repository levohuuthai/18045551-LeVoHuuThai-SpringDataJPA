package com.example.springdatajpa;

import com.example.springdatajpa.entity.Employee;
import com.example.springdatajpa.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void saveRepo() {
        Employee employee = new Employee(1, "huu", "thai");
        employeeRepository.save(employee);
    }

    @Test
    void readRepo() {
        System.out.println(employeeRepository.findAll());
    }

    @Test
    void updateRepo() {
        Employee employee = employeeRepository.findAll().get(0);
        employee.setFirstName("thanh vinh dat duc");
        employeeRepository.save(employee);
    }

    @Test
    void deleteRepo() {
        employeeRepository.deleteAll();
    }


    @Test
    void contextLoads() {
    }


}

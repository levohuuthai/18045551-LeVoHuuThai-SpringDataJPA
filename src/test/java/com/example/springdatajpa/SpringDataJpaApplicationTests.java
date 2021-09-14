package com.example.springdatajpa;

import com.example.springdatajpa.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testSelect() {
        System.out.println(employeeRepository.selectEmployeeInJPQL());
    }
    @Test
    void contextLoads() {
    }

}

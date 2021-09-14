package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(
            value = "select * from employee",
            nativeQuery = true
    )
    List<Employee> selectNative();

    @Query(
            value = "delete * from employee",
            nativeQuery = true
    )
    boolean deleteNative();
}

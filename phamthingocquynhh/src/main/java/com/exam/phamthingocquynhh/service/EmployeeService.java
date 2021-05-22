package com.exam.phamthingocquynhh.service;

import com.exam.phamthingocquynhh.entity.EmployeeEntity;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> getAll();
    EmployeeEntity createEmployee(EmployeeEntity p);
    void deleteEmployee(int id);
    EmployeeEntity updateEmployee(EmployeeEntity p);
    List<EmployeeEntity> getEmployeeByName(String name);
    Optional<EmployeeEntity> findUserById(int id);
}
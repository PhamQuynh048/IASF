package com.exam.phamthingocquynhh.service;

import com.exam.phamthingocquynhh.entity.EmployeeEntity;
import com.exam.phamthingocquynhh.respository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<EmployeeEntity> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity p) {
        return employeeRepo.save(p);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity p) {
        return employeeRepo.save(p);
    }

    @Override
    public List<EmployeeEntity> getEmployeeByName(String name) {
        List<EmployeeEntity>list = employeeRepo.findUserByName(name);
        return list;
    }

    @Override
    public Optional<EmployeeEntity> findUserById(int id) {
        return employeeRepo.findById(id);
    }
}

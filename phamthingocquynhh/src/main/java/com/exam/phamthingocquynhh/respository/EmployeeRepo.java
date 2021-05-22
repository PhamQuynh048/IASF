package com.exam.phamthingocquynhh.respository;

import com.exam.phamthingocquynhh.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {
    @Query("select e from EmployeeEntity e where e.name like %:name%")
    List<EmployeeEntity> findUserByName(String name);
}

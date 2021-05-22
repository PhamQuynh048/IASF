package com.exam.phamthingocquynhh.Controller;

import com.exam.phamthingocquynhh.entity.EmployeeEntity;
import com.exam.phamthingocquynhh.model.BaseResponse;
import com.exam.phamthingocquynhh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity getProduct(@RequestParam(value = "name", required = false) String name) {
        BaseResponse res = new BaseResponse();
        if (name != null){
            res.data = employeeService.getEmployeeByName(name);
        }else {
            res.data = employeeService.getAll();
        }
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createProduct(@RequestBody EmployeeEntity p){
        EmployeeEntity data = employeeService.createEmployee(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @PutMapping
    public ResponseEntity updateProduct(@RequestBody EmployeeEntity p){
        EmployeeEntity data = employeeService.updateEmployee(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable("id") int id) {
        BaseResponse res = new BaseResponse();
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok(res);
    }
}

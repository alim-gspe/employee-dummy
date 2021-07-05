package com.gspe.employee.service;

import com.gspe.employee.dao.EmployeeRepository;
import com.gspe.employee.dto.EmployeeDto;
import com.gspe.employee.model.Employee;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeDto> findAll() {
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        val employeeList = employeeRepository.findAll();
        for (Employee employee : employeeList) {
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId(employee.getId());
            employeeDto.setName(employee.getName());
            employeeDto.setDivision(employee.getDivision());
            employeeDtos.add(employeeDto);
        }
        return employeeDtos;
    }
}

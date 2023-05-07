package com.softy.crudApi.DAO;

import com.softy.crudApi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    Employee findEmployee(int id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(int id);
}

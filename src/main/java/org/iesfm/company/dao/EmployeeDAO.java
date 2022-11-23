package org.iesfm.company.dao;

import org.iesfm.company.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getEmployees();

    List<Employee> getDepartmentEmployees(String departmentName);

    boolean addEmployee(Employee employee);

    boolean deleteEmployee(String nif);

    Employee getEmployee(String nif);
}

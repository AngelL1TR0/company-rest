package org.iesfm.company.dao.inmemory;

import org.iesfm.company.dao.EmployeeDAO;
import org.iesfm.company.entity.Employee;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryEmployeeDAO implements EmployeeDAO {
    private Map<String, Employee> employees = new HashMap<>();


    @Override
    public List<Employee> getEmployees() {
        return new LinkedList<>(employees.values());
    }

    @Override
    public List<Employee> getDepartmentEmployees(String departmentName) {
        return getEmployees()
                .stream()
                .filter(e -> e.getDepartmentName().equals(departmentName))
                .collect(Collectors.toList());
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employees.putIfAbsent(employee.getNif(), employee) == null;
    }

    @Override
    public boolean deleteEmployee(String nif) {
        return employees.remove(nif) != null;
    }

    @Override
    public Employee getEmployee(String nif) {
        return employees.get(nif);
    }
}

package org.iesfm.company.service;

import org.iesfm.company.dao.DepartmentDAO;
import org.iesfm.company.dao.EmployeeDAO;
import org.iesfm.company.entity.Department;
import org.iesfm.company.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Department> departmentList(){
        return departmentDAO.getDepartments();
    }

    public Department getDepartment(String name){
        return departmentDAO.getDepartment(name);
    }

    public boolean add(Department department){
        return departmentDAO.add(department);
    }

    public boolean delete( String name){
        return departmentDAO.delete(name);
    }

    public List <Employee> getEmployee(){
        return employeeDAO.getEmployees();
    }

    

}

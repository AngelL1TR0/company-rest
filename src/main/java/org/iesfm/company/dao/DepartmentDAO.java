package org.iesfm.company.dao;

import org.iesfm.company.entity.Department;

import java.util.List;

public interface DepartmentDAO {

    List<Department> getDepartments();

    boolean add(Department department);

    boolean delete(String departmentName);

    Department getDepartment(String departmentName);
}

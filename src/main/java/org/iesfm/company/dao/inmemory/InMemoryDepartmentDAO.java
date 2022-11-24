package org.iesfm.company.dao.inmemory;

import org.iesfm.company.dao.DepartmentDAO;
import org.iesfm.company.entity.Department;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class InMemoryDepartmentDAO implements DepartmentDAO {
    private HashMap<String, Department> departments = new HashMap<>();


    @Override
    public List<Department> getDepartments() {
        return new LinkedList<>(departments.values());
    }

    @Override
    public boolean add(Department department) {
        return departments.putIfAbsent(department.getName(), department) == null;
    }

    @Override
    public boolean delete(String departmentName) {
        return departments.remove(departmentName) != null;
    }

    @Override
    public Department getDepartment(String departmentName) {
        return departments.get(departmentName);
    }
}

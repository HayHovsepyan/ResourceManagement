package hhovsepyan.service;

import hhovsepyan.Department;
import hhovsepyan.DepartmentType;
import hhovsepyan.Employee;

public class DepartmentService {
    public Department create(final DepartmentType departmentType, final String departmentName, final Employee departmentHead, final Employee[] employees){
        Department department = new Department(departmentType,departmentName, departmentHead, employees)
                return department;
    }
}

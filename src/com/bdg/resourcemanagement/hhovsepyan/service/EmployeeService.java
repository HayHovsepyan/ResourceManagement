package hhovsepyan.service;

import hhovsepyan.Employee;
import hhovsepyan.Person;
import hhovsepyan.SalaryDetail;

public class EmployeeService {
    public Employee create(final Person person, final SalaryDetail salary ){
        Employee employee = new Employee(person, salary);
        return employee;
    }



}

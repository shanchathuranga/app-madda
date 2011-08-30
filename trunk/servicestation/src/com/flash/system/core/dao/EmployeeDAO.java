package com.flash.system.core.dao;

import com.flash.system.core.entity.Employee;
import java.util.List;

/**
 *
 * @author shan
 */
public interface EmployeeDAO {

    public void addEmployee(Employee customer) throws Exception;

    public void updateEmployee(Employee customer) throws Exception;

    public void deleteEmployee(Employee customer) throws Exception;

    public Employee findByPrimaryKey(Long id) throws Exception;

    public List<Employee> findAll() throws Exception;
}

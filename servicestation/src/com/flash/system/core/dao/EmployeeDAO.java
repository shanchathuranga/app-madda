package com.flash.system.core.dao;

import java.util.List;

/**
 *
 * @author shan
 */
public interface EmployeeDAO {

    public void addEmployee(Employee customer);
    public void updateEmployee(Employee customer);
    public void deleteEmployee(Employee customer);
    public Employee findByPrimaryKey(Long id);
    public List<Employee> findAll();

}

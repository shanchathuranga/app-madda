package com.flash.system.core.dao;

import com.flash.system.core.entity.EmployeeType;
import java.util.List;

/**
 *
 * @author shan
 */
public interface EmployeeTypeDAO {

    public void addEmployeeType(EmployeeType empType) throws Exception;

    public void updateEmployeeType(EmployeeType empType) throws Exception;

    public void deleteEmployeeType(EmployeeType empType) throws Exception;

    public EmployeeType findByPrimaryKey(int empCode) throws Exception;

    public List<EmployeeType> findAll() throws Exception;
}

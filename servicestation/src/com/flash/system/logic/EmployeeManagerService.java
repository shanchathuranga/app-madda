package com.flash.system.logic;

import com.flash.system.core.dao.EmployeeDAO;
import com.flash.system.core.dao.EmployeeTypeDAO;
import com.flash.system.core.entity.Employee;
import com.flash.system.core.entity.EmployeeType;
import com.flash.system.core.service.EmployeeDAOImpl;
import com.flash.system.core.service.EmployeeTypeDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shan
 */
public class EmployeeManagerService {

    private EmployeeDAO employeeDAO;
    private EmployeeTypeDAO employeeTypeDAO;

    public EmployeeManagerService() {
        employeeDAO = new EmployeeDAOImpl();
        employeeTypeDAO = new EmployeeTypeDAOImpl();
    }

    public String addEmployeeType(String jobName) {
        EmployeeType et = new EmployeeType();
        et.setJobName(jobName);
        try {
            employeeTypeDAO.addEmployeeType(et);
            return "Employee Type Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

    public List<EmployeeType> getAllEmployeeTypes() {
        try {
            return employeeTypeDAO.findAll();
        } catch (Exception e) {
        }
        return new ArrayList<EmployeeType>();
    }

    public boolean authenticateUser(Employee guestUser) {
        return false;
    }

}

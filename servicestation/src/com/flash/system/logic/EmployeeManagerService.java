package com.flash.system.logic;

import com.flash.system.core.dao.EmployeeDAO;
import com.flash.system.core.dao.EmployeeTypeDAO;
import com.flash.system.core.dao.SysUserDAO;
import com.flash.system.core.entity.Employee;
import com.flash.system.core.entity.EmployeeType;
import com.flash.system.core.entity.SysUser;
import com.flash.system.core.service.EmployeeDAOImpl;
import com.flash.system.core.service.EmployeeTypeDAOImpl;
import com.flash.system.core.service.SysUserDAOImpl;
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
    private SysUserDAO sysUserDAO;

    public EmployeeManagerService() {
        employeeDAO = new EmployeeDAOImpl();
        employeeTypeDAO = new EmployeeTypeDAOImpl();
        sysUserDAO = new SysUserDAOImpl();
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

    public String addSysUser(SysUser sysUser) {
        try {
            sysUserDAO.addSysUser(sysUser);
            return "SysUser Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

    public SysUser getSysUserByUnameAndPword(SysUser sysUser) {
        SysUser result = null;
        try {
            result = sysUserDAO.getSysUserByUnameAndPword(sysUser);
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return result;
    }

    public List<EmployeeType> getAllEmployeeTypes() {
        try {
            return employeeTypeDAO.findAll();
        } catch (Exception e) {
        }
        return new ArrayList<EmployeeType>();
    }

    public boolean authenticateUser(SysUser guestUser) {
        SysUser temp = null;
        try {
            temp = sysUserDAO.getSysUserByUnameAndPword(guestUser);
        } catch (Exception ex) {
            Logger.getLogger(EmployeeManagerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(temp != null)
            return true;
        return false;
    }
    
    public boolean hasMAXPermission(SysUser sysUser) {
        return true;
    }

    public boolean hasMANPermission(SysUser sysUser) {
        return true;
    }
    
    public boolean hasITHPermission(SysUser sysUser) {
        return true;
    }
    
    public boolean hasSTRPermission(SysUser sysUser) {
        return true;
    }
    
    public boolean hasACCPermission(SysUser sysUser) {
        return true;
    }
    
    public boolean hasLOWPermission(SysUser sysUser) {
        return true;
    }
    
    public boolean hasNONEPermission(SysUser sysUser) {
        return true;
    }

}

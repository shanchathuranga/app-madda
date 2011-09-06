package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.EmployeeDAO;
import com.flash.system.core.entity.Employee;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class EmployeeDAOImpl extends BaseDAO implements EmployeeDAO {

    public void addEmployee(Employee employee) throws Exception {
        try {
            begin();
            getSession().save(employee);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateEmployee(Employee employee) throws Exception {
        try {
            begin();
            getSession().update(employee);
            commit();
        } catch (HibernateException e) {
            begin();
            getSession().saveOrUpdate(employee);
            commit();
        }
    }

    public void deleteEmployee(Employee employee) throws Exception {
        try {
            begin();
            getSession().delete(employee);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Employee findByPrimaryKey(Long employeeId) throws Exception {
        Employee employee = null;
        try {
            begin();
            employee = (Employee) getSession().load(Employee.class, employeeId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return employee;
    }

    public List<Employee> findAll() throws Exception {
        List<Employee> employees = null;
        try {
            begin();
            Query query = getSession().createQuery("from Employee");
            employees = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return employees;
    }
}

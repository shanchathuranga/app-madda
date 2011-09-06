package com.flash.system.core.dao;

import com.flash.system.core.entity.Customer;
import java.util.List;

/**
 *
 * @author shan
 */
public interface CustomerDAO {

    public void addCustomer(Customer customer) throws Exception;

    public void updateCustomer(Customer customer) throws Exception;

    public void deleteCustomer(Customer customer) throws Exception;

    public Customer findByPrimaryKey(Long id) throws Exception;

    public List<Customer> findAll() throws Exception;

    public Customer findByEmail(String email) throws Exception;

    public List<Customer> findCustomersByEmail(String mockEmail) throws Exception;

    public List<Customer> findByFname(String fName) throws Exception;

    public List<Customer> findByLname(String lName) throws Exception;

    public List<Customer> findByNICNo(String NIC) throws Exception;

    public Customer findBytpMobile(String mobileNumber) throws Exception;
}

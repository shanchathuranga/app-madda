package com.flash.system.core.dao;

import com.flash.system.core.entity.Customer;
import java.util.List;

/**
 *
 * @author shan
 */
public interface CustomerDAO {

    public void addCustomer(Customer customer);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
    public Customer findByPrimaryKey(Long id);
    public List<Customer> findAll();

}

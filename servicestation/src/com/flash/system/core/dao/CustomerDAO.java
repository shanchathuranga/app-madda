package com.flash.system.core.dao;

import com.flash.system.core.entity.Customer;
import java.util.Collection;

/**
 *
 * @author shan
 */
public interface CustomerDAO {

    public void add(Customer customer);
    public void update(Customer customer);
    public void remove(Customer customer);
    public Customer findByPrimaryKey(Long id);
    public Collection findAll();

}

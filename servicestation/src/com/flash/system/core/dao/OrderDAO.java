package com.flash.system.core.dao;

import com.flash.system.core.entity.Order;
import java.util.List;

/**
 *
 * @author shan
 */
public interface OrderDAO {

    public void addOrder(Order customer);
    public void updateOrder(Order customer);
    public void deleteOrder(Order customer);
    public Order findByPrimaryKey(Long id);
    public List<Order> findAll();

}

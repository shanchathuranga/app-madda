package com.flash.system.core.dao;

import com.flash.system.core.entity.Order;
import java.util.List;

/**
 *
 * @author shan
 */
public interface OrderDAO {

    public void addOrder(Order order) throws Exception;

    public void updateOrder(Order order) throws Exception;

    public void deleteOrder(Order order) throws Exception;

    public Order findByPrimaryKey(Long id) throws Exception;

    public List<Order> findAll() throws Exception;
}

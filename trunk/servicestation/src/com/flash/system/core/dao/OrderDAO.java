package com.flash.system.core.dao;

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

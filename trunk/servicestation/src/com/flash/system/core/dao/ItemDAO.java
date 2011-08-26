package com.flash.system.core.dao;

import java.util.List;

/**
 *
 * @author shan
 */
public interface ItemDAO {

    public void addItem(Item customer);
    public void updateItem(Item customer);
    public void deleteItem(Item customer);
    public Item findByPrimaryKey(Long id);
    public List<Item> findAll();

}

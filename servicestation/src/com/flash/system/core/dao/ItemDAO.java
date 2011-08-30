package com.flash.system.core.dao;

import com.flash.system.core.entity.Item;
import java.util.List;

/**
 *
 * @author shan
 */
public interface ItemDAO {

    public void addItem(Item customer) throws Exception;

    public void updateItem(Item customer) throws Exception;

    public void deleteItem(Item customer) throws Exception;

    public Item findByPrimaryKey(Long id) throws Exception;

    public List<Item> findAll() throws Exception;
}

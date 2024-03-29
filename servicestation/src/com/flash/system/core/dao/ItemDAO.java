package com.flash.system.core.dao;

import com.flash.system.core.entity.Item;
import java.util.List;

/**
 *
 * @author shan
 */
public interface ItemDAO {

    public void addItem(Item item) throws Exception;

    public void updateItem(Item item) throws Exception;

    public void deleteItem(Item item) throws Exception;

    public Item findByPrimaryKey(Long id) throws Exception;

    public List<Item> findAll() throws Exception;
}

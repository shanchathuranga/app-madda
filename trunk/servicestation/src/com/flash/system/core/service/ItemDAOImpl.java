package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.ItemDAO;
import com.flash.system.core.entity.Item;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class ItemDAOImpl extends BaseDAO implements ItemDAO {

    public void addItem(Item item) throws Exception {
        try {
            begin();
            getSession().save(item);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateItem(Item item) throws Exception {
        try{
            begin();
            getSession().update(item);
            commit();

        }catch(HibernateException e){
            begin();
            getSession();
            commit();
        }
    }

    public void deleteItem(Item item) throws Exception {
        try {
            begin();
            getSession().delete(item);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Item findByPrimaryKey(Long itemId) throws Exception {
        Item item = null;
        try {
            begin();
            item = (Item) getSession().load(Item.class, itemId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return item;
    }

    public List<Item> findAll() throws Exception {
        List<Item> items = null;
        try {
            begin();
            Query query = getSession().createQuery("from Item");
            items = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return items;
    }
}

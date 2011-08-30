package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.PreOrderDAO;
import com.flash.system.core.entity.PreOrder;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class PreOrderDAOImpl extends BaseDAO implements PreOrderDAO{

public void addPreOrder(PreOrder preOrder) throws Exception {
        try {
            begin();
            getSession().save(preOrder);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updatePreOrder(PreOrder preOrder) throws Exception{
    }

    public void deletePreOrder(PreOrder preOrder) throws Exception {
        try {
            begin();
            getSession().delete(preOrder);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public PreOrder findByPrimaryKey(Long preOrderId) throws Exception{
        PreOrder preOrder = null;
        try {
            begin();
            preOrder = (PreOrder)getSession().load(PreOrder.class, preOrderId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return preOrder;
    }

    public List<PreOrder> findAll() throws Exception {
        List<PreOrder> preOrders = null;
        try {
            begin();
            Query query = getSession().createQuery("from PreOrder");
            preOrders = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return preOrders;
    }

}

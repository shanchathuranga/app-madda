package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.PreOrderFormDAO;
import com.flash.system.core.entity.PreOrderForm;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class PreOrderFormDAOImpl extends BaseDAO implements PreOrderFormDAO{

public void addPreOrder(PreOrderForm preOrder) throws Exception {
        try {
            begin();
            getSession().save(preOrder);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updatePreOrder(PreOrderForm preOrder) throws Exception{
    }

    public void deletePreOrder(PreOrderForm preOrder) throws Exception {
        try {
            begin();
            getSession().delete(preOrder);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public PreOrderForm findByPrimaryKey(Long preOrderId) throws Exception{
        PreOrderForm preOrder = null;
        try {
            begin();
            preOrder = (PreOrderForm)getSession().load(PreOrderForm.class, preOrderId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return preOrder;
    }

    public List<PreOrderForm> findAll() throws Exception {
        List<PreOrderForm> preOrders = null;
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

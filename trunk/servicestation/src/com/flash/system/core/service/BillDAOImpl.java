package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.BillDAO;
import com.flash.system.core.entity.Bill;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class BillDAOImpl extends BaseDAO implements BillDAO {

    public void addBill(Bill bill) throws Exception {
        try {
            begin();
            getSession().save(bill);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateBill(Bill bill) throws Exception {
    }

    public void deleteBill(Bill bill) throws Exception {
        try {
            begin();
            getSession().delete(bill);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Bill findByPrimaryKey(Long billId) throws Exception {
        Bill bill = null;
        try {
            begin();
            bill = (Bill) getSession().load(Bill.class, billId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return bill;
    }

    public List<Bill> findAll() throws Exception {
        List<Bill> bills = null;
        try {
            begin();
            Query query = getSession().createQuery("from Bill");
            bills = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return bills;
    }
}

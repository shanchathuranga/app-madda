package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.RepairDAO;
import com.flash.system.core.entity.Repair;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class RepairDAOImpl extends BaseDAO implements RepairDAO{

public void addRepair(Repair repair) throws Exception {
        try {
            begin();
            getSession().save(repair);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateRepair(Repair repair) throws Exception{
    }

    public void deleteRepair(Repair repair) throws Exception {
        try {
            begin();
            getSession().delete(repair);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Repair findByPrimaryKey(Long repairId) throws Exception{
        Repair repair = null;
        try {
            begin();
            repair = (Repair)getSession().load(Repair.class, repairId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return repair;
    }

    public List<Repair> findAll() throws Exception {
        List<Repair> repairs = null;
        try {
            begin();
            Query query = getSession().createQuery("from Repair");
            repairs = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return repairs;
    }

}

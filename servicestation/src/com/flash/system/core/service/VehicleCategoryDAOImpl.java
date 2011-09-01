/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.VehicleCategoryDAO;
import com.flash.system.core.entity.VehicleCategory;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class VehicleCategoryDAOImpl extends BaseDAO implements VehicleCategoryDAO{

    public void addVehicleCategory(VehicleCategory vehicleCategory) throws Exception {
        try {
            begin();
            getSession().save(vehicleCategory);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateVehicleCategory(VehicleCategory customer) throws Exception {

    }

    public void deleteVehicleCategory(VehicleCategory vehicleCategory) throws Exception {
        try {
            begin();
            getSession().delete(vehicleCategory);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public VehicleCategory findByPrimaryKey(Long vehicleCategoryId) throws Exception {
        VehicleCategory vehicleCategory = null;
        try {
            begin();
            vehicleCategory = (VehicleCategory) getSession().load(VehicleCategory.class, vehicleCategoryId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return vehicleCategory;
    }

    public List<VehicleCategory> findAll() throws Exception {
        List<VehicleCategory> vehicleCategorys = null;
        try {
            begin();
            Query query = getSession().createQuery("from Vehicle");
            vehicleCategorys = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return vehicleCategorys;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.VehicleTypeDAO;
import com.flash.system.core.entity.VehicleType;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class VehicleTypeDAOImpl extends BaseDAO implements VehicleTypeDAO {

    public void addVehicleType(VehicleType vehicleType) throws Exception {
        try {
            begin();
            getSession().save(vehicleType);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateVehicleType(VehicleType vehicleType) throws Exception {
        try {
            begin();
            getSession().update(vehicleType);
            commit();
        } catch (HibernateException e) {
            begin();
            getSession();
            commit();
        }
    }

    public void deleteVehicleType(VehicleType vehicleType) throws Exception {
        try {
            begin();
            getSession().delete(vehicleType);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public VehicleType findByPrimaryKey(Long vehicleTypeId) throws Exception {
        VehicleType vehicleType = null;
        try {
            begin();
            vehicleType = (VehicleType) getSession().load(VehicleType.class, vehicleTypeId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return vehicleType;
    }

    public List<VehicleType> findAll() throws Exception {
        List<VehicleType> vehicleTypes = null;
        try {
            begin();
            Query query = getSession().createQuery("from Vehicle");
            vehicleTypes = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return vehicleTypes;
    }
}

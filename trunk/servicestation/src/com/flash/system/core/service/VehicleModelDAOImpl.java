/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.VehicleModelDAO;
import com.flash.system.core.entity.VehicleModel;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class VehicleModelDAOImpl extends BaseDAO implements VehicleModelDAO {

    public void addVehicleModel(VehicleModel vehicleModel) throws Exception {
        try {
            begin();
            getSession().save(vehicleModel);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateVehicleModel(VehicleModel vehicleModel) throws Exception {
    try{
        begin();
        getSession().update(vehicleModel);
        commit();
    }catch(HibernateException e){
        begin();
        getSession().saveOrUpdate(vehicleModel);
        commit();
    }

    }

    public void deleteVehicleModel(VehicleModel vehicleModel) throws Exception {
        try {
            begin();
            getSession().delete(vehicleModel);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public VehicleModel findByPrimaryKey(Long vehicleModelId) throws Exception {
        VehicleModel vehicleModel = null;
        try {
            begin();
            vehicleModel = (VehicleModel) getSession().load(VehicleModel.class, vehicleModelId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return vehicleModel;
    }

    public List<VehicleModel> findAll() throws Exception {
        List<VehicleModel> vehicleModels = null;
        try {
            begin();
            Query query = getSession().createQuery("from VehicleModel");
            vehicleModels = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return vehicleModels;
    }
}

package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.VehicleDAO;
import com.flash.system.core.entity.Vehicle;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class VehicleDAOImpl extends BaseDAO implements VehicleDAO {

    public void addVehicle(Vehicle vehicle) throws Exception {
        try {
            begin();
            getSession().save(vehicle);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateVehicle(Vehicle vehicle) throws Exception {
        try {
            begin();
            getSession().update(vehicle);
            commit();
        } catch (HibernateException e) {
            begin();
            getSession().saveOrUpdate(vehicle);
            commit();
        }
    }

    public void deleteVehicle(Vehicle vehicle) throws Exception {
        try {
            begin();
            getSession().delete(vehicle);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Vehicle findByPrimaryKey(Long vehicleId) throws Exception {
        Vehicle vehicle = null;
        try {
            begin();
            vehicle = (Vehicle) getSession().load(Vehicle.class, vehicleId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return vehicle;
    }

    public List<Vehicle> findAll() throws Exception {
        List<Vehicle> vehicles = null;
        try {
            begin();
            Query query = getSession().createQuery("from Vehicle");
            vehicles = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return vehicles;
    }
}

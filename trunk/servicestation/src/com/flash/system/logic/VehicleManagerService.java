/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flash.system.logic;

import com.flash.system.core.dao.VehicleCategoryDAO;
import com.flash.system.core.dao.VehicleDAO;
import com.flash.system.core.dao.VehicleModelDAO;
import com.flash.system.core.dao.VehicleTypeDAO;
import com.flash.system.core.entity.Vehicle;
import com.flash.system.core.entity.VehicleCategory;
import com.flash.system.core.entity.VehicleModel;
import com.flash.system.core.entity.VehicleType;
import com.flash.system.core.service.VehicleCategoryDAOImpl;
import com.flash.system.core.service.VehicleDAOImpl;
import com.flash.system.core.service.VehicleModelDAOImpl;
import com.flash.system.core.service.VehicleTypeDAOImpl;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shan
 */
public class VehicleManagerService {

    private VehicleDAO vehicleDAO;
    private VehicleCategoryDAO vehicleCategoryDAO;
    private VehicleModelDAO vehicleModelDAO;
    private VehicleTypeDAO vehicleTypeDAO;

    public VehicleManagerService() {
        vehicleDAO = new VehicleDAOImpl();
        vehicleCategoryDAO = new VehicleCategoryDAOImpl();
        vehicleModelDAO = new VehicleModelDAOImpl();
        vehicleTypeDAO = new VehicleTypeDAOImpl();
    }

    public String addNewVehicle() {
        Vehicle vehicle = new Vehicle();
        
        // populate

        try {
            vehicleDAO.addVehicle(vehicle);
            return "Vehicle Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

    public String addNewVehicleCategory() {
        VehicleCategory vehicleCategory = new VehicleCategory();

        // populate

        try {
            vehicleCategoryDAO.addVehicleCategory(vehicleCategory);
            return "Vehicle Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

    public String addNewVehicleModel() {
        VehicleModel vehicleModel = new VehicleModel();

        // populate

        try {
            vehicleModelDAO.addVehicleModel(vehicleModel);
            return "Vehicle Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

    public String addNewVehicleType() {
        VehicleType vehicleType = new VehicleType();

        // populate

        try {
            vehicleTypeDAO.addVehicleType(vehicleType);
            return "Vehicle Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

}

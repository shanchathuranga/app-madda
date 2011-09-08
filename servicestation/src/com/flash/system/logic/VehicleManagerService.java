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
import java.util.List;
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

    public String addNewVehicleCategory(String vehicleCategoryName) {

        VehicleCategory vehicleCategory = new VehicleCategory();
        vehicleCategory.setCategoryName(vehicleCategoryName);

        try {
            vehicleCategoryDAO.addVehicleCategory(vehicleCategory);
            return "Vehicle Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

    public String addNewVehicleModel(String vehicleModelName) {

        VehicleModel vehicleModel = new VehicleModel();
        vehicleModel.setModelName(vehicleModelName);

        try {
            vehicleModelDAO.addVehicleModel(vehicleModel);
            return "Vehicle Model Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

    public String addNewVehicleType(String vehicleTypeName) {

        VehicleType vehicleType = new VehicleType();
        vehicleType.setModelName(vehicleTypeName);

        try {
            vehicleTypeDAO.addVehicleType(vehicleType);
            return "Vehicle Type Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

    public Vehicle getByPrimaryKey(Long vehicleId) {
        Vehicle vehicle = null;
        try {
            vehicle = vehicleDAO.findByPrimaryKey(vehicleId);
        } catch (Exception ex) {
            Logger.getLogger(VehicleManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return vehicle;
    }

    public Vehicle getByVehicleRegNumber(String vehicleRegNumber) {
        Vehicle vehicle = null;
        try {
            vehicle = vehicleDAO.findByRegNumber(vehicleRegNumber);
        } catch (Exception ex) {
            Logger.getLogger(VehicleManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return vehicle;
    }

    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = null;
        try {
            vehicles = vehicleDAO.findAll();
        } catch (Exception ex) {
            Logger.getLogger(VehicleManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return vehicles;
    }

    public List<VehicleCategory> getAllVehicleCategories() {
        List<VehicleCategory> vehicleCategorys = null;
        try {
            vehicleCategorys = vehicleCategoryDAO.findAll();
        } catch (Exception ex) {
            Logger.getLogger(VehicleManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return vehicleCategorys;
    }

    public List<VehicleModel> getAllVehicleModels() {
        List<VehicleModel> vehicleModels = null;
        try {
            vehicleModels = vehicleModelDAO.findAll();
        } catch (Exception ex) {
            Logger.getLogger(VehicleManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return vehicleModels;
    }

    public List<VehicleType> getAllVehicleTypes() {
        List<VehicleType> vehicleTypes = null;
        try {
            vehicleTypes = vehicleTypeDAO.findAll();
        } catch (Exception ex) {
            Logger.getLogger(VehicleManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return vehicleTypes;
    }

}

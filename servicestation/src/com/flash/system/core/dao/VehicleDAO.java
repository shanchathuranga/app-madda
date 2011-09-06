package com.flash.system.core.dao;

import com.flash.system.core.entity.Vehicle;
import java.util.List;

/**
 *
 * @author shan
 */
public interface VehicleDAO {

    public void addVehicle(Vehicle vehicle) throws Exception;

    public void updateVehicle(Vehicle vehicle) throws Exception;

    public void deleteVehicle(Vehicle vehicle) throws Exception;

    public Vehicle findByPrimaryKey(Long id) throws Exception;

    public List<Vehicle> findAll() throws Exception;

    public Vehicle findByRegNumber(String vehicleRegNumber) throws Exception;
}

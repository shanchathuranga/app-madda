package com.flash.system.core.dao;

import com.flash.system.core.entity.Vehicle;
import java.util.List;

/**
 *
 * @author shan
 */
public interface VehicleDAO {

    public void addVehicle(Vehicle customer);
    public void updateVehicle(Vehicle customer);
    public void deleteVehicle(Vehicle customer);
    public Vehicle findByPrimaryKey(Long id);
    public List<Vehicle> findAll();

}

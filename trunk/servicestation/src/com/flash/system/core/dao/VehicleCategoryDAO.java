package com.flash.system.core.dao;

import com.flash.system.core.entity.VehicleCategory;
import java.util.List;

/**
 *
 * @author shan
 */
public interface VehicleCategoryDAO {

    public void addVehicleCategory(VehicleCategory vehicleCategory) throws Exception;

    public void updateVehicleCategory(VehicleCategory vehicleCategory) throws Exception;

    public void deleteVehicleCategory(VehicleCategory vehicleCategory) throws Exception;

    public VehicleCategory findByPrimaryKey(Long id) throws Exception;

    public List<VehicleCategory> findAll() throws Exception;
    
}

package com.flash.system.core.dao;

import com.flash.system.core.entity.VehicleCategory;
import java.util.List;

/**
 *
 * @author shan
 */
public interface VehicleCategoryDAO {

    public void addVehicleCategory(VehicleCategory customer) throws Exception;

    public void updateVehicleCategory(VehicleCategory customer) throws Exception;

    public void deleteVehicleCategory(VehicleCategory customer) throws Exception;

    public VehicleCategory findByPrimaryKey(Long id) throws Exception;

    public List<VehicleCategory> findAll() throws Exception;
    
}

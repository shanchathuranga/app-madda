package com.flash.system.core.dao;

import com.flash.system.core.entity.VehicleModel;
import java.util.List;

/**
 *
 * @author shan
 */
public interface VehicleModelDAO {

    public void addVehicleModel(VehicleModel vehicleModel) throws Exception;

    public void updateVehicleModel(VehicleModel vehicleModel) throws Exception;

    public void deleteVehicleModel(VehicleModel vehicleModel) throws Exception;

    public VehicleModel findByPrimaryKey(Long id) throws Exception;

    public List<VehicleModel> findAll() throws Exception;

}

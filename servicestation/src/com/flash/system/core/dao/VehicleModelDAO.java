package com.flash.system.core.dao;

import com.flash.system.core.entity.VehicleModel;
import java.util.List;

/**
 *
 * @author shan
 */
public interface VehicleModelDAO {

    public void addVehicleModel(VehicleModel customer) throws Exception;

    public void updateVehicleModel(VehicleModel customer) throws Exception;

    public void deleteVehicleModel(VehicleModel customer) throws Exception;

    public VehicleModel findByPrimaryKey(Long id) throws Exception;

    public List<VehicleModel> findAll() throws Exception;

}

package com.flash.system.core.dao;

import com.flash.system.core.entity.VehicleType;
import java.util.List;

/**
 *
 * @author shan
 */
public interface VehicleTypeDAO {

    public void addVehicleType(VehicleType customer) throws Exception;

    public void updateVehicleType(VehicleType customer) throws Exception;

    public void deleteVehicleType(VehicleType customer) throws Exception;

    public VehicleType findByPrimaryKey(Long id) throws Exception;

    public List<VehicleType> findAll() throws Exception;

}

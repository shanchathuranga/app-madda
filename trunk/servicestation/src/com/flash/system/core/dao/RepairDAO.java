package com.flash.system.core.dao;

import com.flash.system.core.entity.Repair;
import java.util.List;

/**
 *
 * @author shan
 */
public interface RepairDAO {

    public void addRepair(Repair customer);
    public void updateRepair(Repair customer);
    public void deleteRepair(Repair customer);
    public Repair findByPrimaryKey(Long id);
    public List<Repair> findAll();

}

package com.flash.system.core.dao;

import com.flash.system.core.entity.Repair;
import java.util.List;

/**
 *
 * @author shan
 */
public interface RepairDAO {

    public void addRepair(Repair customer) throws Exception;

    public void updateRepair(Repair customer) throws Exception;

    public void deleteRepair(Repair customer) throws Exception;

    public Repair findByPrimaryKey(Long id) throws Exception;

    public List<Repair> findAll() throws Exception;
}

package com.flash.system.core.dao;

import com.flash.system.core.entity.Supplier;
import java.util.List;

/**
 *
 * @author shan
 */
public interface SupplierDAO {

    public void addSupplier(Supplier customer) throws Exception;

    public void updateSupplier(Supplier customer) throws Exception;

    public void deleteSupplier(Supplier customer) throws Exception;

    public Supplier findByPrimaryKey(Long id) throws Exception;

    public List<Supplier> findAll() throws Exception;
}

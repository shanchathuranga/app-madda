package com.flash.system.core.dao;

import java.util.List;

/**
 *
 * @author shan
 */
public interface SupplierDAO {

    public void addSupplier(Supplier customer);
    public void updateSupplier(Supplier customer);
    public void deleteSupplier(Supplier customer);
    public Supplier findByPrimaryKey(Long id);
    public List<Supplier> findAll();

}

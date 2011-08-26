package com.flash.system.core.dao;

import com.flash.system.core.entity.Bill;
import java.util.List;

/**
 *
 * @author shan
 */
public interface BillDAO {

    public void addBill(Bill customer);
    public void updateBill(Bill customer);
    public void deleteBill(Bill customer);
    public Bill findByPrimaryKey(Long id);
    public List<Bill> findAll();

}
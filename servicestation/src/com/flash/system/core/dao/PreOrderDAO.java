package com.flash.system.core.dao;

import java.util.List;

/**
 *
 * @author shan
 */
public interface PreOrderDAO {

    public void addPreOrder(PreOrder customer);
    public void updatePreOrder(PreOrder customer);
    public void deletePreOrder(PreOrder customer);
    public PreOrder findByPrimaryKey(Long id);
    public List<PreOrder> findAll();

}

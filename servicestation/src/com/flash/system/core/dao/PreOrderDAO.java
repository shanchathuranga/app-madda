package com.flash.system.core.dao;

import com.flash.system.core.entity.PreOrder;
import java.util.List;

/**
 *
 * @author shan
 */
public interface PreOrderDAO {

    public void addPreOrder(PreOrder customer) throws Exception;

    public void updatePreOrder(PreOrder customer) throws Exception;

    public void deletePreOrder(PreOrder customer) throws Exception;

    public PreOrder findByPrimaryKey(Long id) throws Exception;

    public List<PreOrder> findAll() throws Exception;
}

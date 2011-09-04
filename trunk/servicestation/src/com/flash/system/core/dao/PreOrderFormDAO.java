package com.flash.system.core.dao;

import com.flash.system.core.entity.PreOrderForm;
import java.util.List;

/**
 *
 * @author shan
 */
public interface PreOrderFormDAO {

    public void addPreOrder(PreOrderForm customer) throws Exception;

    public void updatePreOrder(PreOrderForm customer) throws Exception;

    public void deletePreOrder(PreOrderForm customer) throws Exception;

    public PreOrderForm findByPrimaryKey(Long id) throws Exception;

    public List<PreOrderForm> findAll() throws Exception;
}

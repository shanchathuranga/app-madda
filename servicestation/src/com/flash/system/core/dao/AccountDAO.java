package com.flash.system.core.dao;

import com.flash.system.core.entity.Account;
import java.util.List;

/**
 *
 * @author shan
 */
public interface AccountDAO {

    public void addAccount(Account customer) throws Exception;

    public void updateAccount(Account customer) throws Exception;

    public void deleteAccount(Account customer) throws Exception;

    public Account findByPrimaryKey(Long id) throws Exception;

    public List<Account> findAll() throws Exception;
}

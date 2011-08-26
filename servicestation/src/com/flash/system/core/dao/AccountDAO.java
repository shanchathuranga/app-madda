package com.flash.system.core.dao;

import com.flash.system.core.entity.Account;
import java.util.List;

/**
 *
 * @author shan
 */
public interface AccountDAO {

    public void addAccount(Account customer);
    public void updateAccount(Account customer);
    public void deleteAccount(Account customer);
    public Account findByPrimaryKey(Long id);
    public List<Account> findAll();

}

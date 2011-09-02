package com.flash.system.core.service;

import com.flash.system.core.dao.AccountDAO;
import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.entity.Account;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class AccountDOAImpl extends BaseDAO implements AccountDAO {

    public void addAccount(Account account) throws Exception {
        try {
            begin();
            getSession().save(account);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateAccount(Account account) throws Exception {
        try {
            begin();
            getSession().update(account);
            commit();
        } catch (HibernateException e) {
            begin();
            getSession().saveOrUpdate(account);
            commit();
        }
    }

    public void deleteAccount(Account account) throws Exception {
        try {
            begin();
            getSession().delete(account);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Account findByPrimaryKey(Long customerId) throws Exception {
        Account account = null;
        try {
            begin();
            account = (Account) getSession().load(Account.class, customerId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return account;
    }

    public List<Account> findAll() throws Exception {
        List<Account> accounts = null;
        try {
            begin();
            Query query = getSession().createQuery("from Account");
            accounts = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return accounts;
    }
}

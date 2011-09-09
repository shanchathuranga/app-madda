package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.SysUserDAO;
import com.flash.system.core.entity.SysUser;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class SysUserDAOImpl extends BaseDAO implements SysUserDAO {

    public void addSysUser(SysUser sysUser) throws Exception {
        try {
            begin();
            getSession().save(sysUser);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public SysUser getSysUserByUnameAndPword(SysUser sysUser) throws Exception {
        SysUser temp = null;
        try {
            begin();
            Query query = getSession()
                    .createQuery("from SysUser where username=? and password=?")
                    .setParameter(0, sysUser.getUsername())
                    .setParameter(1, sysUser.getPassword());
            temp = (SysUser) query.uniqueResult();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return temp;
    }

    public void updateSysUser(SysUser sysUser) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteSysUser(SysUser sysUser) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<SysUser> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

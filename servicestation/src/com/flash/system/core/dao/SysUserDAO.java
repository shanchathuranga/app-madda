package com.flash.system.core.dao;

import com.flash.system.core.entity.SysUser;
import java.util.List;

/**
 *
 * @author shan
 */
public interface SysUserDAO {

    public void addSysUser(SysUser sysUser) throws Exception;

    public SysUser getSysUserByUnameAndPword(SysUser sysUser) throws Exception;

    public void updateSysUser(SysUser sysUser) throws Exception;

    public void deleteSysUser(SysUser sysUser) throws Exception;

    public List<SysUser> findAll() throws Exception;

}

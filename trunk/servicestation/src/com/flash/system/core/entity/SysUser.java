package com.flash.system.core.entity;

import com.flash.system.core.entity.Permission.Perm;

/**
 *
 * @author shan
 */
public class SysUser extends Employee{

    private String username;
    private char[] password;
    private Permission.Perm permission;

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public Perm getPermission() {
        return permission;
    }

    public void setPermission(Perm permission) {
        this.permission = permission;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

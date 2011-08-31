package com.flash.system.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author shan
 */
@Entity
public class Permission {

    private int permCode;
    private String permName;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getPermCode() {
        return permCode;
    }

    public void setPermCode(int permCode) {
        this.permCode = permCode;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

}

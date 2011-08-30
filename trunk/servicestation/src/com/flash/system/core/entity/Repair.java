/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class Repair {

    private long RepairId;
    private String RepairType;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long getRepairId() {
        return RepairId;
    }

    public void setRepairId(long RepairId) {
        this.RepairId = RepairId;
    }

    public String getRepairType() {
        return RepairType;
    }

    public void setRepairType(String RepairType) {
        this.RepairType = RepairType;
    }

}

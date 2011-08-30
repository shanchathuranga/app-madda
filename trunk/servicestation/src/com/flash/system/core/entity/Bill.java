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
public class Bill {

    private long billId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }



}

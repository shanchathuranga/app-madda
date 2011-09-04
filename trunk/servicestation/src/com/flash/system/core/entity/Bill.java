/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flash.system.core.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author shan
 */
@Entity
public class Bill implements Serializable {

    private long billId;
    private String customerName;
    private Date billDate;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }



}

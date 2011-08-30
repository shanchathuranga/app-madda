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
public class Order {

    private Long orderId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }




}

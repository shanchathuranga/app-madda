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
public class PreOrder {

    private int preOrderId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getPreOrderId() {
        return preOrderId;
    }

    public void setPreOrderId(int preOrderId) {
        this.preOrderId = preOrderId;
    }


}

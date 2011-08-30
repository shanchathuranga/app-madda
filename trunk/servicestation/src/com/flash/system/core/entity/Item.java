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
public class Item {

    private long itemId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }



}

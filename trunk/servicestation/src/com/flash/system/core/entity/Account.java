/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flash.system.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author shan
 */
@Entity
public class Account {

   private long accoutId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long getAccoutId() {
        return accoutId;
    }

    public void setAccoutId(long accoutId) {
        this.accoutId = accoutId;
    }
   
}
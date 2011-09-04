package com.flash.system.core.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author shan
 */
@Entity
public class PreOrderForm implements Serializable {

    private int preOrderFormId;
    private Customer owner;
    private Vehicle vehicle;
    private boolean isPaid;

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getPreOrderFormId() {
        return preOrderFormId;
    }

    public void setPreOrderFormId(int preOrderFormId) {
        this.preOrderFormId = preOrderFormId;
    }

    @ManyToOne
    @JoinColumn(name="ownerID")
    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @ManyToOne
    @JoinColumn(name="vehicleID")
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}

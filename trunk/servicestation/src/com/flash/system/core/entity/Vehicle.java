package com.flash.system.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author shan
 */
@Entity
public class Vehicle implements Serializable {

    private long vehicleId;
    private String vehicleRegNo;
    private String chasseyNo;
    private String engineNo;
    private String cylinderCapacity;
    private int fuelType;
    private String vehicleColor;
    private String meterODO;
    private VehicleCategory vehicleCategory;
    private VehicleModel vehicleModel;
    private VehicleType vehicleType;
    private Customer owner;
    private List<PreOrderForm> preOrders;

    @OneToMany(targetEntity=PreOrderForm.class, mappedBy="vehicle", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    public List<PreOrderForm> getPreOrders() {
        return preOrders;
    }

    public void setPreOrders(List<PreOrderForm> preOrders) {
        this.preOrders = preOrders;
    }

    @ManyToOne
    @JoinColumn(name="ownerID")
    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getChasseyNo() {
        return chasseyNo;
    }

    public void setChasseyNo(String chasseyNo) {
        this.chasseyNo = chasseyNo;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public int getFuelType() {
        return fuelType;
    }

    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }

    public String getMeterODO() {
        return meterODO;
    }

    public void setMeterODO(String meterODO) {
        this.meterODO = meterODO;
    }

    @ManyToOne
    @JoinColumn(name="categoryID")
    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    @ManyToOne
    @JoinColumn(name="modelID")
    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    @ManyToOne
    @JoinColumn(name="typeID")
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    
}

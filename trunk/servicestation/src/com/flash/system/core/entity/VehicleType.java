package com.flash.system.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author shan
 */
@Entity
public class VehicleType implements Serializable {

    private int modelCode;
    private String modelName;
    private List<Vehicle> vehicles;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getModelCode() {
        return modelCode;
    }

    public void setModelCode(int modelCode) {
        this.modelCode = modelCode;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @OneToMany(targetEntity=Vehicle.class, mappedBy="vehicleModel",
        cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}

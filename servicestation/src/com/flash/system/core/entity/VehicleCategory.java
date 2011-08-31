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
public class VehicleCategory implements Serializable {

    private int categoryCode;
    private String categoryName;
    private List<Vehicle> vehicles;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

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
 * @author tharindu
 */
@Entity
public class Customer implements Serializable {

    private Long customerId;        /* Unique ID for custormer   */
    private String vehicleRegNo;    /* vehical registration No   */
    private String customerFName;   /* Customer First Name       */
    private String customerLName;   /* Customer Last Name        */
    private String customerNICNo;   /* National ID No            */
    private String customerDLNo;    /* Driving Licen No          */
    private String addressHome;
    private String addressOffice;
    private String addressOther;
    private String tpMobile;        /* Mobile phone No           */
    private String tpHome;
    private String tpOffice;
    private String fax;
    private String email;
    private String website;
    private int customerState;      /* enum State                */
    private int customerType;       /* enum CustomerType         */
    private List<Vehicle> vehicles;
    private List<PreOrderForm> preOrders;

    public enum State {

        ACTIVE,
        INACTIVE,
        DELETED
    }

    public enum CustomerType {

        PERSONAL,
        ORGANIZATION
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @OneToMany(targetEntity=PreOrderForm.class, mappedBy="owner", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    public List<PreOrderForm> getPreOrders() {
        return preOrders;
    }

    public void setPreOrders(List<PreOrderForm> preOrders) {
        this.preOrders = preOrders;
    }

    @OneToMany(targetEntity=Vehicle.class, mappedBy="owner", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getAddressHome() {
        return addressHome;
    }

    public void setAddressHome(String addressHome) {
        this.addressHome = addressHome;
    }

    public String getAddressOffice() {
        return addressOffice;
    }

    public void setAddressOffice(String addressOffice) {
        this.addressOffice = addressOffice;
    }

    public String getAddressOther() {
        return addressOther;
    }

    public void setAddressOther(String addressOther) {
        this.addressOther = addressOther;
    }

    public String getCustomerDLNo() {
        return customerDLNo;
    }

    public void setCustomerDLNo(String customerDLNo) {
        this.customerDLNo = customerDLNo;
    }

    public String getCustomerFName() {
        return customerFName;
    }

    public void setCustomerFName(String customerFName) {
        this.customerFName = customerFName;
    }

    public String getCustomerLName() {
        return customerLName;
    }

    public void setCustomerLName(String customerLName) {
        this.customerLName = customerLName;
    }

    public String getCustomerNICNo() {
        return customerNICNo;
    }

    public void setCustomerNICNo(String customerNICNo) {
        this.customerNICNo = customerNICNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTpHome() {
        return tpHome;
    }

    public void setTpHome(String tpHome) {
        this.tpHome = tpHome;
    }

    public String getTpMobile() {
        return tpMobile;
    }

    public void setTpMobile(String tpMobile) {
        this.tpMobile = tpMobile;
    }

    public String getTpOffice() {
        return tpOffice;
    }

    public void setTpOffice(String tpOffice) {
        this.tpOffice = tpOffice;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public int getCustomerState() {
        return customerState;
    }

    public void setCustomerState(int customerState) {
        this.customerState = customerState;
    }
}

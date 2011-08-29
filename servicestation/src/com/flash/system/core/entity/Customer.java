package com.flash.system.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author tharindu
 */
@Entity
public class Customer {

    private Long customerId;    /* Unique ID for custormer   */
    private String vehRegNo;    /* vehical registration No   */
    private String cusName;     /* Customer Name             */
    private String cusNICNo;    /* National ID No            */
    private String cusDriLicNo; /* Driving Licen No          */
    private String address1;
    private String address2;
    private String address3;
    private String tpMobile;    /* Mobile phone No           */
    private String tpHome;
    private String tpOffice;
    private String fax;
    private String email;
    private String weburl;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCusId(Long cusId) {
        this.customerId = customerId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCusDriLicNo() {
        return cusDriLicNo;
    }

    public void setCusDriLicNo(String cusDriLicNo) {
        this.cusDriLicNo = cusDriLicNo;
    }

    public String getCusNICNo() {
        return cusNICNo;
    }

    public void setCusNICNo(String cusNICNo) {
        this.cusNICNo = cusNICNo;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
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

    public String getVehRegNo() {
        return vehRegNo;
    }

    public void setVehRegNo(String vehRegNo) {
        this.vehRegNo = vehRegNo;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

}

package com.flash.system.core.entity;

/**
 *
 * @author tharindu
 */
public class Customer {

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

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String Address1) {
        this.address1 = Address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String Address2) {
        this.address2 = Address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String Address3) {
        this.address3 = Address3;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String CusName) {
        this.cusName = CusName;
    }

    public String getDriLicNo() {
        return cusDriLicNo;
    }

    public void setDriLicNo(String DriLicNo) {
        this.cusDriLicNo = DriLicNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String Fax) {
        this.fax = Fax;
    }

    public String getNicNo() {
        return cusNICNo;
    }

    public void setNicNo(String NicNo) {
        this.cusNICNo = NicNo;
    }

    public String getTelHome() {
        return tpHome;
    }

    public void setTelHome(String TelHome) {
        this.tpHome = TelHome;
    }

    public String getTelMobile() {
        return tpMobile;
    }

    public void setTelMobile(String TelMobile) {
        this.tpMobile = TelMobile;
    }

    public String getTelOffice() {
        return tpOffice;
    }

    public void setTelOffice(String TelOffice) {
        this.tpOffice = TelOffice;
    }
   
    public String getVehRegNo() {
        return vehRegNo;
    }

    public void setVehRegNo(String VehRegNo) {
        this.vehRegNo = VehRegNo;
    }

    public String getWebSite() {
        return weburl;
    }

    public void setWebSite(String WebSite) {
        this.weburl = WebSite;
    }

}

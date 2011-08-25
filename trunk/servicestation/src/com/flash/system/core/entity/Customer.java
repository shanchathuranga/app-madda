package com.flash.system.core.entity;



/**
 *
 * @author tharindu
 */


public class Customer {

    private String VehRegNo;   /* vehical registration No */
    private String CusName;    /* Customer Name */
    private String NicNo;      /* National ID No */
    private String DriLicNo;   /* Driving Licen No */
    private String Address1;
    private String Address2;
    private String Address3;
    private String TelMobile;  /* Mobile phone No */
    private String TelHome;
    private String TelOffice;
    private String Fax;
    private String Email;
    private String WebSite;

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public String getAddress3() {
        return Address3;
    }

    public void setAddress3(String Address3) {
        this.Address3 = Address3;
    }

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String CusName) {
        this.CusName = CusName;
    }

    public String getDriLicNo() {
        return DriLicNo;
    }

    public void setDriLicNo(String DriLicNo) {
        this.DriLicNo = DriLicNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getNicNo() {
        return NicNo;
    }

    public void setNicNo(String NicNo) {
        this.NicNo = NicNo;
    }

    public String getTelHome() {
        return TelHome;
    }

    public void setTelHome(String TelHome) {
        this.TelHome = TelHome;
    }

    public String getTelMobile() {
        return TelMobile;
    }

    public void setTelMobile(String TelMobile) {
        this.TelMobile = TelMobile;
    }

    public String getTelOffice() {
        return TelOffice;
    }

    public void setTelOffice(String TelOffice) {
        this.TelOffice = TelOffice;
    }
   
    public String getVehRegNo() {
        return VehRegNo;
    }

    public void setVehRegNo(String VehRegNo) {
        this.VehRegNo = VehRegNo;
    }

    public String getWebSite() {
        return WebSite;
    }

    public void setWebSite(String WebSite) {
        this.WebSite = WebSite;
    }



}

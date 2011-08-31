package com.flash.system.logic;

import com.flash.system.core.dao.CustomerDAO;
import com.flash.system.core.entity.Customer;
import com.flash.system.core.service.CustomerDAOImpl;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sampath
 */
public class CustomerMgtService {

    public String addNewCustomer (
            String vehicleRegNo,
            String customerFName,
            String customerLName,
            String customerNICNo,
            String customerDLNo,
            String addressHome,
            String addressOffice,
            String addressOther,
            String tpMobile,
            String tpHome,
            String tpOffice,
            String fax,
            String email,
            String website,
            int customerState,
            int customerType
            ) {

        Customer customer = new Customer();
        customer.setVehicleRegNo(vehicleRegNo);
        customer.setCustomerFName(customerFName);
        customer.setCustomerLName(customerLName);
        customer.setCustomerNICNo(customerNICNo);
        customer.setCustomerDLNo(customerDLNo);
        customer.setAddressHome(addressHome);
        customer.setAddressOffice(addressOffice);
        customer.setAddressOther(addressOther);
        customer.setTpMobile(tpMobile);
        customer.setTpHome(tpHome);
        customer.setTpOffice(tpOffice);
        customer.setFax(fax);
        customer.setEmail(email);
        customer.setWebsite(website);
        customer.setCustomerState(customerState);
        customer.setCustomerType(customerType);

        CustomerDAO customerDAO = new CustomerDAOImpl();
        try {
            customerDAO.addCustomer(customer);
            return "Customer Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerMgtService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }
}

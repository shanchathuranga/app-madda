package com.flash.system.logic;

import com.flash.system.core.dao.CustomerDAO;
import com.flash.system.core.entity.Customer;
import com.flash.system.core.service.CustomerDAOImpl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sampath
 */
public class CustomerManagerService {

    private CustomerDAO customerDAO;

    public CustomerManagerService() {
        customerDAO = new CustomerDAOImpl();
    }

    public String addNewCustomer(String vehicleRegNo, String customerFName, String customerLName,
            String customerNICNo, String customerDLNo, String addressHome, String addressOffice,
            String addressOther, String tpMobile, String tpHome, String tpOffice, String fax,
            String email, String website, int customerState, int customerType) {

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

        try {
            customerDAO.addCustomer(customer);
            return "Customer Added";
        } catch (Exception ex) {
            Logger.getLogger(CustomerManagerService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error occured : " + ex);
        }
        return "Error";
    }

    public String deleteCustomer(Customer customer) throws Exception {
        customerDAO.deleteCustomer(customer);
        return customer.getCustomerFName() + " Deleted Successfuly";
    }

    public String updateCustomer(Customer customer) throws Exception {
        customerDAO.updateCustomer(customer);
        return customer.getCustomerFName() + " Updated Successfuly";
    }

    public Customer getById(Long customerId) throws Exception {
        Customer customer = new Customer();
        customer = customerDAO.findByPrimaryKey(customerId);
        return customer;

    }
    public List<Customer> getAll() throws Exception {
        List<Customer> all = customerDAO.findAll();
        return all;
    }

    public List<Customer> gebyFname(String fName) throws Exception {
        List<Customer> customers = customerDAO.findByFname(fName);
        return customers;
    }

    public List<Customer> gebyLname(String lName) throws Exception {
        List<Customer> customers = customerDAO.findByLname(lName);
        return customers;
    }

    public List<Customer> gebyNIC(String NIC) throws Exception {
        List<Customer> customers = customerDAO.findByNICNo(NIC);
        return customers;
    }

    public Customer getByMobileNumber(String mobileNumber) throws Exception {
        Customer customer = customerDAO.findBytpMobile(mobileNumber);
        return customer;
    }

    public Customer getByEmail(String email) throws Exception {
        Customer customer = customerDAO.findByEmail(email);
        return customer;
    }

    public List<Customer> getCustomersByEmail(String mockEmail) throws Exception {
        List<Customer> customers = customerDAO.findCustomersByEmail(mockEmail);
        return customers;
    }
}


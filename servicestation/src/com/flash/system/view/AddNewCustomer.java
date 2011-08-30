package com.flash.system.view;

import com.flash.system.core.dao.CustomerDAO;
import com.flash.system.core.entity.Customer;
import com.flash.system.core.service.CustomerDAOImpl;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shan
 */
public class AddNewCustomer extends JPanel implements ActionListener{

    private CommonWindowUtilities comUtil;
    private JPanel base;
    private JLabel lCustomerName;
    private JTextField tCustomerName;
    private JButton bAddCustomer;

    AddNewCustomer(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;

        base = new JPanel();
        base.setPreferredSize(new Dimension(400, 200));

        lCustomerName = new JLabel("Customer Name : ");
        lCustomerName.setPreferredSize(new Dimension(150, 30));
        base.add(lCustomerName);
        tCustomerName = new JTextField();
        tCustomerName.setPreferredSize(new Dimension(160, 30));
        base.add(tCustomerName);
        bAddCustomer = new JButton("Add Customer");
        bAddCustomer.setPreferredSize(new Dimension(120, 30));
        base.add(bAddCustomer);

        bAddCustomer.addActionListener(this);

        add(base);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == bAddCustomer) {
                CustomerDAO customerDAO = new CustomerDAOImpl();
                Customer c = new Customer();
                c.setCusName(tCustomerName.getText());
                try {
                    customerDAO.addCustomer(c);
                } catch (Exception ex) {
                }
                comUtil.clearMainBody();
            }
    }

}

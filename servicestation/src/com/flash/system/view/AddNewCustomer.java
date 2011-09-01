package com.flash.system.view;

import com.flash.system.core.entity.Customer;
import com.flash.system.logic.CustomerManagerService;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author shan
 */
public class AddNewCustomer extends JPanel implements ActionListener {

    private CommonWindowUtilities comUtil;
    private JPanel base;
    private JPanel areaPanel;
    private JLabel lCaption;
    private JLabel lVehicleRegNo;
    private JLabel lCustomerFName;
    private JLabel lCustomerLName;
    private JLabel lCustomerNIC;
    private JLabel lCustomerDL;
    private JLabel lAddrHome;
    private JLabel lAddrOffice;
    private JLabel lAddrOther;
    private JLabel lMobileTP;
    private JLabel lHomeTP;
    private JLabel lOfficeTP;
    private JLabel lFax;
    private JLabel lEmail;
    private JLabel lWebsite;
    private JLabel lNote;
    private JLabel lState;
    private JLabel lType;
    private JTextField tVehicleRegNo;
    private JTextField tCustomerFName;
    private JTextField tCustomerLName;
    private JTextField tCustomerNIC;
    private JTextField tCustomerDL;
    private JTextField tAddrHome;
    private JTextField tAddrOffice;
    private JTextField tAddrOther;
    private JTextField tMobileTP;
    private JTextField tHomeTP;
    private JTextField tOfficeTP;
    private JTextField tFax;
    private JTextField tEmail;
    private JTextField tWebsite;
    private JTextArea tNote;
    private JScrollPane scrollPane;
    private JComboBox cState;
    private JComboBox cType;
    private JButton bAddCustomer;
    private JButton bSaveCustomer;
    private JButton bClearCustomer;

    AddNewCustomer(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;

        base = new JPanel();
        base.setLayout(new MigLayout());

        lCaption = new JLabel("Customer Registration");
        lCaption.setFont(new Font("Monospaced 12", Font.BOLD, 16));
        lCaption.setHorizontalAlignment(SwingUtilities.CENTER);
        lCaption.setPreferredSize(new Dimension(870, 30));
        lVehicleRegNo = new JLabel("Vehicle Reg No : ");
        lVehicleRegNo.setHorizontalAlignment(SwingUtilities.RIGHT);
        lVehicleRegNo.setPreferredSize(new Dimension(150, 30));
        lCustomerFName = new JLabel("First Name : ");
        lCustomerFName.setHorizontalAlignment(SwingUtilities.RIGHT);
        lCustomerFName.setPreferredSize(new Dimension(150, 30));
        lCustomerLName = new JLabel("Last Name : ");
        lCustomerLName.setHorizontalAlignment(SwingUtilities.RIGHT);
        lCustomerLName.setPreferredSize(new Dimension(150, 30));
        lCustomerNIC = new JLabel("NIC No : ");
        lCustomerNIC.setHorizontalAlignment(SwingUtilities.RIGHT);
        lCustomerNIC.setPreferredSize(new Dimension(150, 30));
        lCustomerDL = new JLabel("DL No : ");
        lCustomerDL.setHorizontalAlignment(SwingUtilities.RIGHT);
        lCustomerDL.setPreferredSize(new Dimension(150, 30));
        lAddrHome = new JLabel("Address (Home) : ");
        lAddrHome.setHorizontalAlignment(SwingUtilities.RIGHT);
        lAddrHome.setPreferredSize(new Dimension(150, 30));
        lAddrOffice = new JLabel("Address (Office) : ");
        lAddrOffice.setHorizontalAlignment(SwingUtilities.RIGHT);
        lAddrOffice.setPreferredSize(new Dimension(150, 30));
        lAddrOther = new JLabel("Address (Other) : ");
        lAddrOther.setHorizontalAlignment(SwingUtilities.RIGHT);
        lAddrOther.setPreferredSize(new Dimension(150, 30));
        lMobileTP = new JLabel("TP (Mobile) : ");
        lMobileTP.setHorizontalAlignment(SwingUtilities.RIGHT);
        lMobileTP.setPreferredSize(new Dimension(150, 30));
        lHomeTP = new JLabel("TP (Home) : ");
        lHomeTP.setHorizontalAlignment(SwingUtilities.RIGHT);
        lHomeTP.setPreferredSize(new Dimension(150, 30));
        lOfficeTP = new JLabel("TP (Office) : ");
        lOfficeTP.setHorizontalAlignment(SwingUtilities.RIGHT);
        lOfficeTP.setPreferredSize(new Dimension(150, 30));
        lFax = new JLabel("Fax : ");
        lFax.setHorizontalAlignment(SwingUtilities.RIGHT);
        lFax.setPreferredSize(new Dimension(150, 30));
        lEmail = new JLabel("E-mail : ");
        lEmail.setHorizontalAlignment(SwingUtilities.RIGHT);
        lEmail.setPreferredSize(new Dimension(150, 30));
        lWebsite = new JLabel("Website : ");
        lWebsite.setHorizontalAlignment(SwingUtilities.RIGHT);
        lWebsite.setPreferredSize(new Dimension(150, 30));
        lNote = new JLabel("Note : ");
        lNote.setHorizontalAlignment(SwingUtilities.RIGHT);
        lNote.setPreferredSize(new Dimension(100, 30));
        lState = new JLabel("State : ");
        lState.setHorizontalAlignment(SwingUtilities.RIGHT);
        lState.setPreferredSize(new Dimension(100, 30));
        lType = new JLabel("Type : ");
        lType.setHorizontalAlignment(SwingUtilities.RIGHT);
        lType.setPreferredSize(new Dimension(100, 30));

        tVehicleRegNo = new JTextField();
        tVehicleRegNo.setPreferredSize(new Dimension(300, 30));
        tCustomerFName = new JTextField();
        tCustomerFName.setPreferredSize(new Dimension(300, 30));
        tCustomerLName = new JTextField();
        tCustomerLName.setPreferredSize(new Dimension(300, 30));
        tCustomerNIC = new JTextField();
        tCustomerNIC.setPreferredSize(new Dimension(300, 30));
        tCustomerDL = new JTextField();
        tCustomerDL.setPreferredSize(new Dimension(300, 30));
        tAddrHome = new JTextField();
        tAddrHome.setPreferredSize(new Dimension(300, 30));
        tAddrOffice = new JTextField();
        tAddrOffice.setPreferredSize(new Dimension(300, 30));
        tAddrOther = new JTextField();
        tAddrOther.setPreferredSize(new Dimension(300, 30));
        tMobileTP = new JTextField();
        tMobileTP.setPreferredSize(new Dimension(300, 30));
        tHomeTP = new JTextField();
        tHomeTP.setPreferredSize(new Dimension(300, 30));
        tOfficeTP = new JTextField();
        tOfficeTP.setPreferredSize(new Dimension(300, 30));
        tFax = new JTextField();
        tFax.setPreferredSize(new Dimension(300, 30));
        tEmail = new JTextField();
        tEmail.setPreferredSize(new Dimension(300, 30));
        tWebsite = new JTextField();
        tWebsite.setPreferredSize(new Dimension(300, 30));
        tNote = new JTextArea();
        scrollPane = new JScrollPane();
        areaPanel = new JPanel(new BorderLayout());

        tNote.setLineWrap(true);
        tNote.setWrapStyleWord(true);
        tNote.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        scrollPane.getViewport().add(tNote);
        scrollPane.setVerticalScrollBar(new JScrollBar());
        
        areaPanel.add(scrollPane);
        areaPanel.setPreferredSize(new Dimension(300, 90));

        cState = new JComboBox();
        cState.addItem(Customer.State.ACTIVE);
        cState.addItem(Customer.State.INACTIVE);
        cState.addItem(Customer.State.DELETED);
        cType = new JComboBox();
        cType.addItem(Customer.CustomerType.PERSONAL);
        cType.addItem(Customer.CustomerType.ORGANIZATION);

        bAddCustomer = new JButton(" Add ");
        bAddCustomer.setPreferredSize(new Dimension(96, 40));
        bAddCustomer.addActionListener(this);
        bSaveCustomer = new JButton(" Save ");
        bSaveCustomer.setPreferredSize(new Dimension(96, 40));
        bSaveCustomer.addActionListener(this);
        bClearCustomer = new JButton(" Clear ");
        bClearCustomer.setPreferredSize(new Dimension(96, 40));
        bClearCustomer.addActionListener(this);

        base.add(lCaption, "cell 0 0 4 1");
        base.add(lVehicleRegNo, "cell 0 1");
        base.add(lCustomerFName, "cell 0 2");
        base.add(lCustomerLName, "cell 0 3");
        base.add(lCustomerNIC, "cell 0 4");
        base.add(lCustomerDL, "cell 0 5");
        base.add(lAddrHome, "cell 0 6");
        base.add(lAddrOffice, "cell 0 7");
        base.add(lAddrOther, "cell 0 8");
        base.add(lMobileTP, "cell 0 9");
        base.add(lHomeTP, "cell 0 10");
        base.add(lOfficeTP, "cell 0 11");
        base.add(lFax, "cell 0 12");
        base.add(lEmail, "cell 0 13");
        base.add(lWebsite, "cell 0 14");
        base.add(lNote, "cell 2 2");
        base.add(lState, "cell 2 4");
        base.add(lType, "cell 2 5");

        base.add(tVehicleRegNo, "cell 1 1");
        base.add(tCustomerFName, "cell 1 2");
        base.add(tCustomerLName, "cell 1 3");
        base.add(tCustomerNIC, "cell 1 4");
        base.add(tCustomerDL, "cell 1 5");
        base.add(tAddrHome, "cell 1 6");
        base.add(tAddrOffice, "cell 1 7");
        base.add(tAddrOther, "cell 1 8");
        base.add(tMobileTP, "cell 1 9");
        base.add(tHomeTP, "cell 1 10");
        base.add(tOfficeTP, "cell 1 11");
        base.add(tFax, "cell 1 12");
        base.add(tEmail, "cell 1 13");
        base.add(tWebsite, "cell 1 14");
        base.add(areaPanel, "cell 3 1, span 1 3");

        base.add(cState, "cell 3 4");
        base.add(cType, "cell 3 5");

        base.add(bAddCustomer, "cell 3 6, span 1 2, split 3");
        base.add(bSaveCustomer);
        base.add(bClearCustomer);

        add(base);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bAddCustomer) {
            CustomerManagerService customerMgtService = new CustomerManagerService();
            String result = customerMgtService.addNewCustomer(
                    tVehicleRegNo.getText(),
                    tCustomerFName.getText(),
                    tCustomerLName.getText(),
                    tCustomerNIC.getText(),
                    tCustomerDL.getText(),
                    tAddrHome.getText(),
                    tAddrOffice.getText(),
                    tAddrOther.getText(),
                    tMobileTP.getText(),
                    tHomeTP.getText(),
                    tOfficeTP.getText(),
                    tFax.getText(),
                    tEmail.getText(),
                    tWebsite.getText(),
                    cState.getSelectedIndex(),
                    cType.getSelectedIndex()
                    );
            JOptionPane.showMessageDialog(null, result);
            comUtil.clearMainBody();
        }
    }
}

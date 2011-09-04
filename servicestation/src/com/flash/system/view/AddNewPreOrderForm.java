package com.flash.system.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author shan
 */
public class AddNewPreOrderForm extends JPanel implements ActionListener {

    private CommonWindowUtilities comUtil;

    private JLabel lCaption;
    private JLabel lVehicleRegNo;
    private JLabel lCustomerName;
    private JLabel lODOMeter;
    private JTextField tVehicleRegNo;
    private JTextField tCustomerName;
    private JTextField tODOMeter;
    private JButton bAdd;
    private JButton bSave;
    private JButton bClear;
    private JButton bAddService;
    private JButton bAddItem;

    private JPanel base;
    private JPanel servicePanel;
    private JPanel itemPanel;
    private JPanel tempBase;

    private JList serviceList;
    private JList itemList;

    private JComboBox cServices;
    private JComboBox cItems;

    public AddNewPreOrderForm(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;

        base = new JPanel();
        base.setLayout(new MigLayout());

        lCaption = new JLabel("New Pre Oreder Form");
        lCaption.setFont(new Font("Monospaced 12", Font.BOLD, 16));
        lCaption.setHorizontalAlignment(SwingUtilities.CENTER);
        lCaption.setPreferredSize(new Dimension(600, 30));
        lVehicleRegNo = new JLabel("Vehicle Reg No : ");
        lVehicleRegNo.setHorizontalAlignment(SwingUtilities.RIGHT);
        lVehicleRegNo.setPreferredSize(new Dimension(150, 30));
        lCustomerName = new JLabel("Customer Name : ");
        lCustomerName.setHorizontalAlignment(SwingUtilities.RIGHT);
        lCustomerName.setPreferredSize(new Dimension(150, 30));
        lODOMeter = new JLabel("ODO Meter : ");
        lODOMeter.setHorizontalAlignment(SwingUtilities.RIGHT);
        lODOMeter.setPreferredSize(new Dimension(150, 30));

        tVehicleRegNo = new JTextField();
        tVehicleRegNo.setPreferredSize(new Dimension(300, 30));
        tCustomerName = new JTextField();
        tCustomerName.setPreferredSize(new Dimension(300, 30));
        tODOMeter = new JTextField();
        tODOMeter.setPreferredSize(new Dimension(300, 30));

        bAdd = new JButton(" Add ");
        bAdd.setPreferredSize(new Dimension(100, 30));
        bSave = new JButton(" Save ");
        bSave.setPreferredSize(new Dimension(100, 30));
        bClear = new JButton(" Clear ");
        bClear.setPreferredSize(new Dimension(100, 30));

        serviceList = new JList();
        servicePanel = new JPanel(new BorderLayout());
        JScrollPane servicePane = new JScrollPane();
        servicePane.getViewport().add(serviceList);
        servicePane.setPreferredSize(new Dimension(300, 250));
        servicePanel.add(servicePane);

        itemList = new JList();
        itemPanel = new JPanel(new BorderLayout());
        JScrollPane itemPane = new JScrollPane();
        itemPane.getViewport().add(itemList);
        itemPane.setPreferredSize(new Dimension(300, 250));
        itemPanel.add(itemPane);

        JLabel serviceLbl = new JLabel("Services");
        serviceLbl.setHorizontalAlignment(SwingUtilities.CENTER);
        serviceLbl.setPreferredSize(new Dimension(300, 30));
        JLabel itemLbl = new JLabel("Issued Items");
        itemLbl.setHorizontalAlignment(SwingUtilities.CENTER);
        itemLbl.setPreferredSize(new Dimension(300, 30));

        cServices = new JComboBox();
        cServices.setPreferredSize(new Dimension(300, 30));
        cItems = new JComboBox();
        cItems.setPreferredSize(new Dimension(300, 30));
        bAddService = new JButton(" Add Service ");
        bAddItem = new JButton(" Add Item ");

        tempBase = new JPanel(new MigLayout());
        tempBase.add(serviceLbl, "cell 0 0");
        tempBase.add(servicePanel, "cell 0 1");
        tempBase.add(itemLbl, "cell 1 0");
        tempBase.add(itemPanel, "cell 1 1");
        tempBase.add(cServices, "cell 0 2");
        tempBase.add(cItems, "cell 1 2");
        tempBase.add(bAddService, "cell 0 3");
        tempBase.add(bAddItem, "cell 1 3");

        base.add(lCaption, "cell 0 0 4 1");
        base.add(lVehicleRegNo, "cell 0 1");
        base.add(lCustomerName, "cell 0 2");
        base.add(lODOMeter, "cell 0 3");

        base.add(tVehicleRegNo, "cell 1 1 2 1");
        base.add(tCustomerName, "cell 1 2 2 1");
        base.add(tODOMeter, "cell 1 3 2 1");

        base.add(bAdd, "cell 3 1");
        base.add(bSave, "cell 3 2");
        base.add(bClear, "cell 3 3");

        base.add(new JLabel(" "), "cell 0 4 4 1");
        base.add(tempBase, "cell 0 5 4 1");

        

        add(base);
    }

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

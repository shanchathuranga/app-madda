package com.flash.system.view;

import com.flash.system.logic.VehicleManagerService;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shan
 */
public class AddNewVehicleCategory extends JPanel implements ActionListener {

    private CommonWindowUtilities comUtil;
    private JPanel base;
    private JLabel lVehicleCat;
    private JTextField tVehicleCat;
    private JButton bAddVehicleCat;

    public AddNewVehicleCategory(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;

        base = new JPanel();
        base.setPreferredSize(new Dimension(400, 200));
        base.setBorder(BorderFactory.createTitledBorder("|   Add New Vehicle Category   |"));
        lVehicleCat = new JLabel("Vehicle Category Name : ");
        lVehicleCat.setPreferredSize(new Dimension(170, 30));
        base.add(lVehicleCat);
        tVehicleCat = new JTextField();
        tVehicleCat.setPreferredSize(new Dimension(140, 30));
        base.add(tVehicleCat);
        bAddVehicleCat = new JButton("Add Category");
        bAddVehicleCat.setPreferredSize(new Dimension(120, 30));
        base.add(bAddVehicleCat);

        bAddVehicleCat.addActionListener(this);

        add(base);
    }

    public void actionPerformed(ActionEvent ae) {
        if( ae.getSource() == bAddVehicleCat ) {
            VehicleManagerService vehicleManagerService = new VehicleManagerService();
            vehicleManagerService.addNewVehicleCategory(tVehicleCat.getText());
            comUtil.clearMainBody();
        }
    }
}

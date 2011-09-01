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
public class AddNewVehicleType extends JPanel implements ActionListener {

    private CommonWindowUtilities comUtil;
    private JPanel base;
    private JLabel lVehicleType;
    private JTextField tVehicleType;
    private JButton bAddVehicleType;

    public AddNewVehicleType(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;

        base = new JPanel();
        base.setPreferredSize(new Dimension(400, 200));
        base.setBorder(BorderFactory.createTitledBorder("|   Add New Vehicle Type   |"));
        lVehicleType = new JLabel("Vehicle Type Name : ");
        lVehicleType.setPreferredSize(new Dimension(150, 30));
        base.add(lVehicleType);
        tVehicleType = new JTextField();
        tVehicleType.setPreferredSize(new Dimension(160, 30));
        base.add(tVehicleType);
        bAddVehicleType = new JButton("Add Type");
        bAddVehicleType.setPreferredSize(new Dimension(120, 30));
        base.add(bAddVehicleType);

        bAddVehicleType.addActionListener(this);

        add(base);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if( ae.getSource() == bAddVehicleType ) {
            VehicleManagerService vehicleManagerService = new VehicleManagerService();
            vehicleManagerService.addNewVehicleType(tVehicleType.getText());
            comUtil.clearMainBody();
        }
    }
}

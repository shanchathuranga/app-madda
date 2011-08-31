package com.flash.system.view;

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
    private JLabel lUserType;
    private JTextField tUserType;
    private JButton bAddUserType;

    public AddNewVehicleType(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;

        base = new JPanel();
        base.setPreferredSize(new Dimension(400, 200));
        base.setBorder(BorderFactory.createTitledBorder("|   Add New Vehicle Type   |"));
        lUserType = new JLabel("Vehicle Type Name : ");
        lUserType.setPreferredSize(new Dimension(150, 30));
        base.add(lUserType);
        tUserType = new JTextField();
        tUserType.setPreferredSize(new Dimension(160, 30));
        base.add(tUserType);
        bAddUserType = new JButton("Add Type");
        bAddUserType.setPreferredSize(new Dimension(120, 30));
        base.add(bAddUserType);

        bAddUserType.addActionListener(this);

        add(base);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if( ae.getSource() == bAddUserType ) {
            
            comUtil.clearMainBody();
        }
    }
}

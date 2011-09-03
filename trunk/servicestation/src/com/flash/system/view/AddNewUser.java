/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flash.system.view;

import com.flash.system.logic.UserManagerService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shan
 */
public class AddNewUser extends JPanel implements ActionListener {

    private UserManagerService userManagerService;
    private CommonWindowUtilities comUtil;

    private JLabel lEmployeeType;
    private JLabel lEmployeeName;
    private JLabel lEmployeeAddress;
    private JLabel lEmployeePhone;
    private JLabel lEmployeeEmail;
    private JLabel lEmployeeDOB;
    private JLabel lEmployeeJoinDate;

    private JComboBox cEmployeeType;
    private JTextField tEmployeeName;
    private JTextField tEmployeeAddress;
    private JTextField tEmployeePhone;
    private JTextField tEmployeeEmail;
    private JTextField tEmployeeDOB;
    private JTextField tEmployeeJoinDate;

    private JPanel base;

    public AddNewUser(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;
        userManagerService = new UserManagerService();

        lEmployeeType = new JLabel("Employee Type : ");
        lEmployeeName = new JLabel("Employee Name : ");
        lEmployeeAddress = new JLabel("Employee Address : ");
        lEmployeePhone = new JLabel("Employee Phone : ");
        lEmployeeEmail = new JLabel("Employee Email : ");
        lEmployeeDOB = new JLabel("Employee DOB : ");
        lEmployeeJoinDate = new JLabel("Employee JoinDate : ");


    }

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

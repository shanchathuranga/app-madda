package com.flash.system.view;

import com.flash.system.core.dao.EmployeeTypeDAO;
import com.flash.system.core.entity.EmployeeType;
import com.flash.system.core.service.EmployeeTypeDAOImpl;
import com.flash.system.logic.EmployeeManagerService;
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
public class AddNewEmployeeType extends JPanel implements ActionListener {

    private EmployeeManagerService employeeManagerService;

    private CommonWindowUtilities comUtil;
    private JPanel base;
    private JLabel lUserType;
    private JTextField tUserType;
    private JButton bAddUserType;

    public AddNewEmployeeType(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;
        employeeManagerService = new EmployeeManagerService();

        base = new JPanel();
        base.setPreferredSize(new Dimension(400, 200));
        base.setBorder(BorderFactory.createTitledBorder("  Add New Employee Type  "));
        lUserType = new JLabel("Employee Type Name : ");
        lUserType.setPreferredSize(new Dimension(150, 30));
        base.add(lUserType);
        tUserType = new JTextField();
        tUserType.setPreferredSize(new Dimension(160, 30));
        base.add(tUserType);
        bAddUserType = new JButton("Add Employee Type");
        bAddUserType.setPreferredSize(new Dimension(150, 30));
        base.add(bAddUserType);

        bAddUserType.addActionListener(this);

        add(base);
    }

    public void actionPerformed(ActionEvent ae) {
        if( ae.getSource() == bAddUserType ) {
                employeeManagerService.addEmployeeType(tUserType.getText());
                comUtil.clearMainBody();
        }
    }


}

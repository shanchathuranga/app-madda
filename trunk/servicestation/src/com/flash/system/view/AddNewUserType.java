package com.flash.system.view;

import com.flash.system.core.dao.EmployeeTypeDAO;
import com.flash.system.core.entity.EmployeeType;
import com.flash.system.core.service.EmployeeTypeDAOImpl;
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
public class AddNewUserType extends JPanel implements ActionListener {

    private CommonWindowUtilities comUtil;
    private JPanel base;
    private JLabel lUserType;
    private JTextField tUserType;
    private JButton bAddUserType;

    public AddNewUserType(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;

        base = new JPanel();
        base.setPreferredSize(new Dimension(400, 200));
        base.setBorder(BorderFactory.createTitledBorder("  Add New User Type  "));
        lUserType = new JLabel("User Type Name : ");
        lUserType.setPreferredSize(new Dimension(150, 30));
        base.add(lUserType);
        tUserType = new JTextField();
        tUserType.setPreferredSize(new Dimension(160, 30));
        base.add(tUserType);
        bAddUserType = new JButton("Add User Type");
        bAddUserType.setPreferredSize(new Dimension(120, 30));
        base.add(bAddUserType);

        bAddUserType.addActionListener(this);

        add(base);
    }

    public void actionPerformed(ActionEvent ae) {
        if( ae.getSource() == bAddUserType ) {
            EmployeeTypeDAO employeeTypeDAO = new EmployeeTypeDAOImpl();
            EmployeeType e = new EmployeeType();
            e.setJobName(tUserType.getText());
            try {
                employeeTypeDAO.addEmployeeType(e);
            } catch (Exception ex) {
            }
            comUtil.clearMainBody();
        }
    }


}

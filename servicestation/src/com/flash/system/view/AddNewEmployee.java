package com.flash.system.view;

import com.flash.system.core.entity.EmployeeType;
import com.flash.system.logic.EmployeeManagerService;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
public class AddNewEmployee extends JPanel implements ActionListener {

    private EmployeeManagerService employeeManagerService;
    private CommonWindowUtilities comUtil;

    private JLabel lCaption;
    private JLabel lEmployeeType;
    private JLabel lEmployeeName;
    private JLabel lEmployeeAddress;
    private JLabel lEmployeePhone;
    private JLabel lEmployeeEmail;
    private JLabel lEmployeeDOB;
    private JLabel lNote;
    
    private JComboBox cEmployeeType;
    private JTextField tEmployeeName;
    private JTextField tEmployeeAddress;
    private JTextField tEmployeePhone;
    private JTextField tEmployeeEmail;
    private JTextField tEmployeeDOB;
    private JTextArea tNote;
    private JScrollPane scrollPane;
    
    private JPanel base;
    private JPanel areaPanel;

    private JButton bAddUser;
    private JButton bSaveUser;
    private JButton bClearUser;

    public AddNewEmployee(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;
        employeeManagerService = new EmployeeManagerService();

        base = new JPanel();
        base.setLayout(new MigLayout());

        lCaption = new JLabel("Employee Registration");
        lCaption.setFont(new Font("Monospaced 12", Font.BOLD, 16));
        lCaption.setHorizontalAlignment(SwingUtilities.CENTER);
        lCaption.setPreferredSize(new Dimension(870, 30));
        lEmployeeType = new JLabel("Employee Type : ");
        lEmployeeType.setHorizontalAlignment(SwingUtilities.RIGHT);
        lEmployeeType.setPreferredSize(new Dimension(150, 30));
        lEmployeeName = new JLabel("Employee Name : ");
        lEmployeeName.setHorizontalAlignment(SwingUtilities.RIGHT);
        lEmployeeName.setPreferredSize(new Dimension(150, 30));
        lEmployeeAddress = new JLabel("Employee Address : ");
        lEmployeeAddress.setHorizontalAlignment(SwingUtilities.RIGHT);
        lEmployeeAddress.setPreferredSize(new Dimension(150, 30));
        lEmployeePhone = new JLabel("Employee Phone : ");
        lEmployeePhone.setHorizontalAlignment(SwingUtilities.RIGHT);
        lEmployeePhone.setPreferredSize(new Dimension(150, 30));
        lEmployeeEmail = new JLabel("Employee Email : ");
        lEmployeeEmail.setHorizontalAlignment(SwingUtilities.RIGHT);
        lEmployeeEmail.setPreferredSize(new Dimension(150, 30));
        lEmployeeDOB = new JLabel("Employee DOB : ");
        lEmployeeDOB.setHorizontalAlignment(SwingUtilities.RIGHT);
        lEmployeeDOB.setPreferredSize(new Dimension(150, 30));
        lNote = new JLabel("Note : ");
        lNote.setHorizontalAlignment(SwingUtilities.RIGHT);
        lNote.setPreferredSize(new Dimension(100, 30));
        
        cEmployeeType = new JComboBox();
        cEmployeeType.setPreferredSize(new Dimension(200, 30));
        tEmployeeName = new JTextField();
        tEmployeeName.setPreferredSize(new Dimension(300, 30));
        tEmployeeAddress = new JTextField();
        tEmployeeAddress.setPreferredSize(new Dimension(300, 30));
        tEmployeePhone = new JTextField();
        tEmployeePhone.setPreferredSize(new Dimension(300, 30));
        tEmployeeEmail = new JTextField();
        tEmployeeEmail.setPreferredSize(new Dimension(300, 30));
        tEmployeeDOB = new JTextField();
        tEmployeeDOB.setPreferredSize(new Dimension(300, 30));
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

        bAddUser = new JButton(" Add ");
        bAddUser.setPreferredSize(new Dimension(96, 40));
        bAddUser.addActionListener(this);
        bSaveUser = new JButton(" Save ");
        bSaveUser.setPreferredSize(new Dimension(96, 40));
        bSaveUser.addActionListener(this);
        bClearUser = new JButton(" Clear ");
        bClearUser.setPreferredSize(new Dimension(96, 40));
        bClearUser.addActionListener(this);

        base.add(lCaption, "cell 0 0 4 1");
        base.add(lEmployeeType, "cell 0 1");
        base.add(lEmployeeName, "cell 0 2");
        base.add(lEmployeeAddress, "cell 0 3");
        base.add(lEmployeeDOB, "cell 0 4");
        base.add(lEmployeeEmail, "cell 0 5");
        base.add(lEmployeePhone, "cell 0 6");
        base.add(lNote, "cell 2 2");
        base.add(cEmployeeType, "cell 1 1");
        base.add(tEmployeeName, "cell 1 2");
        base.add(tEmployeeAddress, "cell 1 3");
        base.add(tEmployeeDOB, "cell 1 4");
        base.add(tEmployeeEmail, "cell 1 5");
        base.add(tEmployeePhone, "cell 1 6");
        base.add(areaPanel, "cell 3 1, span 1 3");
        base.add(bAddUser, "cell 3 4, span 1 2, split 3");
        base.add(bSaveUser);
        base.add(bClearUser);

        add(base);

        List<EmployeeType> employeeTypeList = employeeManagerService.getAllEmployeeTypes();
        for(EmployeeType et : employeeTypeList) {
            String s = et.getJobCode() + " : " + et.getJobName();
            cEmployeeType.addItem(s);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        
    }

}

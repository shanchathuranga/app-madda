package com.flash.system.view;

import com.flash.system.core.entity.SysUser;
import com.flash.system.logic.EmployeeManagerService;
import com.flash.system.main.ConfigureApp;
import com.flash.system.util.ApplicationSession;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author shan
 */
public class LogIn extends JFrame implements ActionListener {

    private JLabel lCaption;
    private JLabel lUsername;
    private JLabel lPassword;
    private JLabel lErrorField;
    private JTextField tUsername;
    private JPasswordField tPassword;
    private JButton okButton;
    private JButton cancelButton;
    private EmployeeManagerService employeeManagerService;

    public LogIn() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        employeeManagerService = new EmployeeManagerService();

        /* Initializing Controllers */
        lCaption = new JLabel("Login Form");
        lCaption.setFont(new Font("Monospaced 12", Font.BOLD, 16));
        lCaption.setHorizontalAlignment(SwingUtilities.CENTER);
        lCaption.setPreferredSize(new Dimension(300, 30));
        lUsername = new JLabel("Username : ");
        lUsername.setFont(new Font("Monospaced 12", Font.PLAIN, 12));
        lUsername.setHorizontalAlignment(SwingUtilities.RIGHT);
        lUsername.setPreferredSize(new Dimension(90, 30));
        lPassword = new JLabel("Password : ");
        lPassword.setFont(new Font("Monospaced 12", Font.PLAIN, 12));
        lPassword.setHorizontalAlignment(SwingUtilities.RIGHT);
        lPassword.setPreferredSize(new Dimension(90, 30));
        lErrorField = new JLabel("");
        lErrorField.setForeground(Color.RED);
        lErrorField.setFont(new Font("Monospaced 12", Font.BOLD, 12));
        lErrorField.setHorizontalAlignment(SwingUtilities.CENTER);
        lErrorField.setPreferredSize(new Dimension(300, 30));
        tUsername = new JTextField();
        tUsername.setPreferredSize(new Dimension(200, 30));
        tPassword = new JPasswordField();
        tPassword.setPreferredSize(new Dimension(200, 30));
        okButton = new JButton(" LogIn ");
        okButton.setPreferredSize(new Dimension(95, 30));
        okButton.addActionListener(this);
        cancelButton = new JButton(" Cancel ");
        cancelButton.setPreferredSize(new Dimension(98, 30));
        cancelButton.addActionListener(this);

        setLayout(new MigLayout());

        add(lCaption, "cell 0 0 4 1");
        add(lUsername, "cell 0 1");
        add(tUsername, "cell 1 1 3 1");
        add(lPassword, "cell 0 2");
        add(tPassword, "cell 1 2 3 1");
        add(lErrorField, "cell 0 4 4 1");
        add(okButton, "cell 1 3");
        add(cancelButton, "cell 2 3");

        setSize(new Dimension(330, 200));
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screen.width - 330) / 2, (screen.height - 200) / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == okButton) {
            SysUser sysUser = new SysUser();
            sysUser.setUsername(tUsername.getText());
            sysUser.setPassword(tPassword.getPassword());
            
            boolean res = employeeManagerService.authenticateUser(sysUser);

            if (res) {
                ApplicationSession.appSession.put("USER", sysUser);
                ConfigureApp.startUI();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Username or Password incorrect.\n"
                        + "Please enter valid username and\n"
                        + "password or contact your Admin.",
                        "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (ae.getSource() == cancelButton) {
            System.exit(0);
        }
    }
}

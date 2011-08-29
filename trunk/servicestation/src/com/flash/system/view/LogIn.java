package com.flash.system.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author shan
 */
public class LogIn extends JPanel implements ActionListener {

    private JLabel lCaption;
    private JLabel lUsername;
    private JLabel lPassword;
    private JLabel lErrorField;
    private JTextField tUsername;
    private JPasswordField tPassword;
    private JButton okButton;
    private JPanel base;
    private CommonWindowUtilities comUtil;

    LogIn(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;

        /* Initializing Controllers */
        lCaption = new JLabel("Login Form");
        lCaption.setFont(new Font("Monospaced 12", Font.BOLD, 16));
        lCaption.setHorizontalAlignment(SwingUtilities.CENTER);
        lCaption.setPreferredSize(new Dimension(300, 30));
        lUsername = new JLabel("Username : ");
        lUsername.setFont(new Font("Monospaced 12", Font.PLAIN, 12));
        lUsername.setHorizontalAlignment(SwingUtilities.RIGHT);
        lUsername.setPreferredSize(new Dimension(80, 30));
        lPassword = new JLabel("Password : ");
        lPassword.setFont(new Font("Monospaced 12", Font.PLAIN, 12));
        lPassword.setHorizontalAlignment(SwingUtilities.RIGHT);
        lPassword.setPreferredSize(new Dimension(80, 30));
        lErrorField = new JLabel("");
        lErrorField.setForeground(Color.RED);
        lErrorField.setFont(new Font("Monospaced 12", Font.BOLD, 12));
        lErrorField.setHorizontalAlignment(SwingUtilities.CENTER);
        lErrorField.setPreferredSize(new Dimension(300, 30));
        tUsername = new JTextField();
        tUsername.setPreferredSize(new Dimension(220, 30));
        tPassword = new JPasswordField();
        tPassword.setPreferredSize(new Dimension(220, 30));
        okButton = new JButton(" LogIn ");
        okButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
        okButton.setPreferredSize(new Dimension(100, 30));
        okButton.addActionListener(this);

        base = new JPanel();
        base.setBorder(BorderFactory.createEtchedBorder());
        base.setLayout(new MigLayout());

        base.add(lCaption, "cell 0 0 3 1");
        base.add(lUsername, "cell 0 1");
        base.add(tUsername, "cell 1 1 2 1");
        base.add(lPassword, "cell 0 2");
        base.add(tPassword, "cell 1 2 2 1");
        base.add(okButton, "cell 1 3");
        base.add(lErrorField, "cell 0 3 3 1");

        base.setPreferredSize(new Dimension(320, 165));
        add(base);
    }

    private boolean checkPassword(char[] password) {
        String pw = "shan";
        if (password.length != pw.length()) {
            return false;
        } else {
            for (int i = 0; i < pw.length(); i++) {
                if (password[i] != pw.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == okButton) {
            String username = tUsername.getText();
            char[] password = tPassword.getPassword();

            if (username.equals("shan") && checkPassword(password)) {
                MainWindow.appSession.put("USERNAME", username.toUpperCase());
                comUtil.getLogInOut().setText("Log Out ( " + username.toUpperCase() + " )");
                comUtil.clearMainBody();
            } else {
                JOptionPane.showMessageDialog(null, "Login Error", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

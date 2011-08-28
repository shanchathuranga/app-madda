package com.flash.system.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author shan
 */
public class LogIn extends JPanel{

    private JLabel lCaption;
    private JLabel lUsername;
    private JLabel lPassword;
    private JLabel lErrorField;
    private JLabel lvspace;
    private JLabel lhspace;
    private JTextField tUsername;
    private JPasswordField tPassword;
    private JButton okButton;
    private JPanel base;

    LogIn() {
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
        lvspace = new JLabel("");
        lvspace.setPreferredSize(new Dimension(20, 30));
        lhspace = new JLabel("");
        lhspace.setPreferredSize(new Dimension(300, 30));

        base = new JPanel();
        base.setBorder(BorderFactory.createEtchedBorder());
        base.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        /* vertical space */
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 5;
        base.add(lvspace, c);

        /* caption */
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 5;
        base.add(lCaption, c);

        /* vertical space */
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 5;
        base.add(lvspace, c);

        /* horizontal space */
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        base.add(lhspace, c);

        /* username label */
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        base.add(lUsername, c);

        /* username textfield */
        c.gridx = 2;
        c.gridy = 3;
        c.gridwidth = 2;
        base.add(tUsername, c);

        /* horizontal space */
        c.gridx = 3;
        c.gridy = 3;
        c.gridwidth = 1;
        base.add(lhspace, c);

        /* horizontal space */
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        base.add(lhspace, c);

        /* password label */
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        base.add(lPassword, c);

        /* password textfield */
        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 2;
        base.add(tPassword, c);

        /* horizontal space */
        c.gridx = 3;
        c.gridy = 4;
        c.gridwidth = 1;
        base.add(lhspace, c);

        /* vertical space */
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 5;
        base.add(lvspace, c);

        /* login button */
        c.gridx = 3;
        c.gridy = 6;
        c.gridwidth = 1;
        base.add(okButton, c);

        /* vertical space */
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 5;
        base.add(lvspace, c);

        /* error field */
        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 5;
        base.add(lErrorField, c);

        /* vertical space */
        c.gridx = 0;
        c.gridy = 9;
        c.gridwidth = 5;
        base.add(lvspace, c);
        
        add(base);
    }

}

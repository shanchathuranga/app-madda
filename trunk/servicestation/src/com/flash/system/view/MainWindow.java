package com.flash.system.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;

/**
 *
 * @author shan
 */
public class MainWindow extends JFrame{

    private JMenuBar menubar;

    private JMenu menuApp;
    private JMenu menuCustomer;
    private JMenu menuToolBar;
    private JMenu menuVehicle;
    private JMenu menuUser;

    private JMenuItem menuItemExit;
    private JMenuItem menuItemAddCustomer;
    private JMenuItem menuItemUpdateCustomer;
    private JMenuItem menuItemRegisterVehicle;
    private JMenuItem menuItemUpdateVehicle;
    private JMenuItem menuItemAddNewUser;
    private JMenuItem menuItemUpdateUser;

    private JToolBar toolbar;

    private JButton toolExit;
    private JButton toolNewUser;
    private JButton toolUpdateUser;

    private JCheckBoxMenuItem toolAddNewUserItem;
    private JCheckBoxMenuItem toolUpdateUserItem;

    public MainWindow() {
        super();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        setDefaultLookAndFeelDecorated(true);

        /*JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);
        JButton bt = new JButton(" OK ");
        bt.setBounds(200, 225, 100, 50);
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        bt.setToolTipText("Quit");
        panel.add(bt);*/

        initMenuBar();
        initMenuActions();
        initToolBar();

        setSize(Toolkit.getDefaultToolkit().getScreenSize().width,
                Toolkit.getDefaultToolkit().getScreenSize().height
                );
        setIconImage(getFDImage());
        setLocationRelativeTo(null);
        setTitle("Flash Service Station");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected static Image getFDImage() {
        java.net.URL imgURL = MainWindow.class.getResource("/com/flash/system/resource/car_icon.png");
        if (imgURL != null) {
            return new ImageIcon(imgURL).getImage();
        } else {
            return null;
        }
    }

    private void initMenuBar() {
        menubar = new JMenuBar();

        /* Creating Menus */
        menuApp = new JMenu("Application");
        menuCustomer = new JMenu("Customer Mgt");
        menuToolBar = new JMenu("Tool Bar");
        menuVehicle = new JMenu("Vehicle Mgt");
        menuUser = new JMenu("User Mgt");

        /* Creating Menu Items */
        menuItemExit = new JMenuItem("Exit");
        menuItemAddCustomer = new JMenuItem("Add Customer");
        menuItemUpdateCustomer = new JMenuItem("Update Customer");
        menuItemRegisterVehicle = new JMenuItem("Register Vehicle");
        menuItemUpdateVehicle = new JMenuItem("Update Vehicle");
        menuItemAddNewUser = new JMenuItem("Add New User");
        menuItemUpdateUser = new JMenuItem("Update User");
        toolAddNewUserItem = new JCheckBoxMenuItem("show Add New User Icon");
        toolAddNewUserItem.setState(false);
        toolUpdateUserItem = new JCheckBoxMenuItem("show Update User Icon");
        toolUpdateUserItem.setState(false);

        /* Adding Menu Items to Menus */
        menuApp.add(menuUser);
        menuApp.add(menuToolBar);
        menuApp.add(menuItemExit);
        menuCustomer.add(menuItemAddCustomer);
        menuCustomer.add(menuItemUpdateCustomer);
        menuVehicle.add(menuItemRegisterVehicle);
        menuVehicle.add(menuItemUpdateVehicle);
        menuUser.add(menuItemAddNewUser);
        menuUser.add(menuItemUpdateUser);
        menuToolBar.add(toolAddNewUserItem);
        menuToolBar.add(toolUpdateUserItem);

        /* Adding Menus to the Menubar */
        menubar.add(menuApp);
        menubar.add(menuCustomer);
        menubar.add(menuVehicle);

        setJMenuBar(menubar);
    }

    private void initMenuActions() {
        menuItemExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);System.exit(0);
            }
        });

        menuItemAddCustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemUpdateCustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemRegisterVehicle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemUpdateVehicle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemAddNewUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemUpdateUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });
    }

    private void initToolBar() {
        toolbar = new JToolBar();
        add(toolbar, BorderLayout.NORTH);

        ImageIcon exit = new ImageIcon(getClass().getResource("/com/flash/system/resource/exit.png"));

        toolExit = new JButton(exit);
        toolExit.setToolTipText("Application Exit");
        toolbar.add(toolExit);
        toolExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });   

        ImageIcon newuser = new ImageIcon(getClass().getResource("/com/flash/system/resource/newuser.png"));

        toolNewUser = new JButton(newuser);
        toolNewUser.setToolTipText("Create New User");
        toolbar.add(toolNewUser);
        toolNewUser.setVisible(false);
        toolNewUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        ImageIcon updateuser = new ImageIcon(getClass().getResource("/com/flash/system/resource/updateuser.png"));

        toolUpdateUser = new JButton(updateuser);
        toolUpdateUser.setToolTipText("Update User");
        toolbar.add(toolUpdateUser);
        toolUpdateUser.setVisible(false);
        toolUpdateUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        toolAddNewUserItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                if(aButton.getModel().isSelected()) {
                    toolNewUser.setVisible(true);
                } else {
                    toolNewUser.setVisible(false);
                }
            }
        });

        toolUpdateUserItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                if(aButton.getModel().isSelected()) {
                    toolUpdateUser.setVisible(true);
                } else {
                    toolUpdateUser.setVisible(false);
                }
            }
        });
    }

}

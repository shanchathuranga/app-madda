package com.flash.system.view;

import java.awt.BorderLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;

/**
 *
 * @author shan
 */
public class MainWindow extends JFrame implements CommonWindowUtilities {

    private JPanel base;
    private JMenuBar menubar;
    private JMenu menuApp;
    private JMenu menuCustomer;
    private JMenu menuToolBar;
    private JMenu menuVehicle;
    private JMenu menuUser;
    private JMenu menuServiceType;
    private JMenu menuPreOrder;
    private JMenu menuStore;
    private JMenu menuOrder;
    private JMenu menuPayment;
    private JMenuItem menuItemExit;
    private JMenuItem menuItemAddCustomer;
    private JMenuItem menuItemUpdateCustomer;
    private JMenuItem menuItemRegisterVehicle;
    private JMenuItem menuItemUpdateVehicle;
    private JMenuItem menuItemAddNewVehicleModel;
    private JMenuItem menuItemAddNewVehicleCategory;
    private JMenuItem menuItemAddNewVehicleType;
    private JMenuItem menuItemAddNewUser;
    private JMenuItem menuItemUpdateUser;
    private JMenuItem menuItemAddNewServiceType;
    private JMenuItem menuItemUpdateServiceType;
    private JMenuItem menuItemAddNewUserType;
    private JMenuItem menuItemAddNewPreOrder;
    private JMenuItem menuItemUpdatePreOrder;
    private JMenuItem menuItemAddNewStoreItem;
    private JMenuItem menuItemUpdateStoreItem;
    private JMenuItem menuItemAddNewOrder;
    private JMenuItem menuItemUpdateOrder;
    private JMenuItem menuItemNewPayment;
    private JMenuItem menuItemUpdatePayment;
    private JToolBar toolbar;
    private JButton toolExit;
    private JButton toolNewCustomer;
    private JButton toolUpdateCustomer;
    private JButton toolNewUser;
    private JButton toolUpdateUser;
    private JButton toolNewVehicle;
    private JButton toolUpdateVehicle;
    private JButton toolLogInOut;
    private JCheckBoxMenuItem toolAddNewCustomerItem;
    private JCheckBoxMenuItem toolUpdateCustomerItem;
    private JCheckBoxMenuItem toolAddUserItem;
    private JCheckBoxMenuItem toolUpdateUserItem;
    private JCheckBoxMenuItem toolAddNewVehicleItem;
    private JCheckBoxMenuItem toolUpdateVehicleItem;
    public static Map appSession = new HashMap();

    public MainWindow() {
        super();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        setDefaultLookAndFeelDecorated(true);
        setLayout(new BorderLayout());
        base = new JPanel();
        add(base, BorderLayout.CENTER);

        initMenuBar();
        initMenuActions();
        initToolBar();

        GraphicsDevice gDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        if (gDevice.isFullScreenSupported()) {
            setUndecorated(false);
            setResizable(false);
            gDevice.setFullScreenWindow(this);
            validate();
        }

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
        menuServiceType = new JMenu("Service Type Mgt");
        menuPreOrder = new JMenu("Pre Order");
        menuStore = new JMenu("Stroe Mgt");
        menuOrder = new JMenu("Order Mgt");
        menuPayment = new JMenu("Payments");

        /* Creating Menu Items */
        menuItemExit = new JMenuItem("Exit");
        menuItemAddCustomer = new JMenuItem("Add Customer");
        menuItemUpdateCustomer = new JMenuItem("Update Customer");
        menuItemRegisterVehicle = new JMenuItem("Add New Vehicle");
        menuItemUpdateVehicle = new JMenuItem("Update Vehicle");
        menuItemAddNewVehicleModel = new JMenuItem("Add Vehicle Model");
        menuItemAddNewVehicleCategory = new JMenuItem("Add Vehicle Category");
        menuItemAddNewVehicleType = new JMenuItem("Add Vehicle Type");
        menuItemAddNewUser = new JMenuItem("Add New User");
        menuItemUpdateUser = new JMenuItem("Update User");
        menuItemAddNewServiceType = new JMenuItem("Add New Service Type");
        menuItemUpdateServiceType = new JMenuItem("Update Service Type");
        menuItemAddNewUserType = new JMenuItem("Add New User Type");
        menuItemAddNewPreOrder = new JMenuItem("Add New Pre Order");
        menuItemUpdatePreOrder = new JMenuItem("Update Pre Order");
        menuItemAddNewStoreItem = new JMenuItem("Add New Store Item");
        menuItemUpdateStoreItem = new JMenuItem("Update Store Item");
        menuItemAddNewOrder = new JMenuItem("Add New Order");
        menuItemUpdateOrder = new JMenuItem("Update Order");
        menuItemNewPayment = new JMenuItem("New Payment");
        menuItemUpdatePayment = new JMenuItem("Update Payment");

        toolAddNewCustomerItem = new JCheckBoxMenuItem("show Add New Customer Icon");
        toolAddNewCustomerItem.setState(false);
        toolUpdateCustomerItem = new JCheckBoxMenuItem("show Update Customer Icon");
        toolUpdateCustomerItem.setState(false);
        toolAddUserItem = new JCheckBoxMenuItem("show Add User Icon");
        toolAddUserItem.setState(false);
        toolUpdateUserItem = new JCheckBoxMenuItem("show Update User Icon");
        toolUpdateUserItem.setState(false);
        toolAddNewVehicleItem = new JCheckBoxMenuItem("show Add New Vehicle Icon");
        toolAddNewVehicleItem.setState(false);
        toolUpdateVehicleItem = new JCheckBoxMenuItem("show Update Vehicle Icon");
        toolUpdateVehicleItem.setState(false);

        /* Adding Menu Items to Menus */
        menuApp.add(menuUser);
        menuApp.add(menuServiceType);
        menuApp.add(menuToolBar);
        menuApp.add(menuItemExit);
        menuCustomer.add(menuItemAddCustomer);
        menuCustomer.add(menuItemUpdateCustomer);
        menuVehicle.add(menuItemRegisterVehicle);
        menuVehicle.add(menuItemUpdateVehicle);
        menuVehicle.add(menuItemAddNewVehicleModel);
        menuVehicle.add(menuItemAddNewVehicleCategory);
        menuVehicle.add(menuItemAddNewVehicleType);
        menuUser.add(menuItemAddNewUser);
        menuUser.add(menuItemUpdateUser);
        menuUser.add(menuItemAddNewUserType);
        menuServiceType.add(menuItemAddNewServiceType);
        menuServiceType.add(menuItemUpdateServiceType);
        menuToolBar.add(toolAddNewCustomerItem);
        menuToolBar.add(toolUpdateCustomerItem);
        menuToolBar.add(toolAddUserItem);
        menuToolBar.add(toolUpdateUserItem);
        menuToolBar.add(toolAddNewVehicleItem);
        menuToolBar.add(toolUpdateVehicleItem);
        menuPreOrder.add(menuItemAddNewPreOrder);
        menuPreOrder.add(menuItemUpdatePreOrder);
        menuStore.add(menuOrder);
        menuStore.add(menuItemAddNewStoreItem);
        menuStore.add(menuItemUpdateStoreItem);
        menuOrder.add(menuItemAddNewOrder);
        menuOrder.add(menuItemUpdateOrder);
        menuPayment.add(menuItemNewPayment);
        menuPayment.add(menuItemUpdatePayment);

        /* Adding Menus to the Menubar */
        menubar.add(menuApp);
        menubar.add(menuCustomer);
        menubar.add(menuVehicle);
        menubar.add(menuPreOrder);
        menubar.add(menuStore);
        menubar.add(menuPayment);

        setJMenuBar(menubar);
    }

    private void initMenuActions() {
        menuItemExit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
                System.exit(0);
            }
        });

        menuItemAddCustomer.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                addCustomerBody();
            }
        });

        menuItemUpdateCustomer.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemRegisterVehicle.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                addNewVehicleBody();
            }
        });

        menuItemUpdateVehicle.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemAddNewVehicleModel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                addNewVehicleModelBody();
            }
        });

        menuItemAddNewVehicleCategory.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                addNewVehicleCategoryBody();
            }
        });

        menuItemAddNewVehicleType.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                addNewVehicleTypeBody();
            }
        });

        menuItemAddNewUser.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                addNewUserBody();
            }
        });

        menuItemUpdateUser.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemAddNewServiceType.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                addNewServiceTypeBody();
            }
        });

        menuItemUpdateServiceType.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                //
            }
        });

        menuItemAddNewUserType.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                addNewUserTypeBody();
            }
        });
        
        menuItemAddNewPreOrder.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                addNewPreOrderBody();
            }
        });
        
        menuItemUpdatePreOrder.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemAddNewStoreItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemUpdateStoreItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemAddNewOrder.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemUpdateOrder.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemNewPayment.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        menuItemUpdatePayment.addActionListener(new ActionListener() {

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

        ImageIcon newCustomerIcon = new ImageIcon(getClass().getResource("/com/flash/system/resource/add_customer.png"));


        toolNewCustomer = new JButton(newCustomerIcon);
        toolNewCustomer.setToolTipText("Create New Customer");
        toolbar.add(toolNewCustomer);
        toolNewCustomer.setVisible(false);
        toolNewCustomer.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                addCustomerBody();
            }
        });

        ImageIcon updateCustomerIcon = new ImageIcon(getClass().getResource("/com/flash/system/resource/edit_customer.png"));

        toolUpdateCustomer = new JButton(updateCustomerIcon);
        toolUpdateCustomer.setToolTipText("Update Customer");
        toolbar.add(toolUpdateCustomer);
        toolUpdateCustomer.setVisible(false);
        toolUpdateCustomer.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        ImageIcon addUserIcon = new ImageIcon(getClass().getResource("/com/flash/system/resource/add_user"
                + ".png"));

        toolNewUser = new JButton(addUserIcon);
        toolNewUser.setToolTipText("Create New User");
        toolbar.add(toolNewUser);
        toolNewUser.setVisible(false);
        toolNewUser.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        ImageIcon updateUserIcon = new ImageIcon(getClass().getResource("/com/flash/system/resource/edit_user.png"));

        toolUpdateUser = new JButton(updateUserIcon);
        toolUpdateUser.setToolTipText("Update User");
        toolbar.add(toolUpdateUser);
        toolUpdateUser.setVisible(false);
        toolUpdateUser.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "Not supported yet.");
            }
        });

        ImageIcon addVehicleIcon = new ImageIcon(getClass().getResource("/com/flash/system/resource/add_vehicle.png"));

        toolNewVehicle = new JButton(addVehicleIcon);
        toolNewVehicle.setToolTipText("Add New Vehicle");
        toolbar.add(toolNewVehicle);
        toolNewVehicle.setVisible(false);
        toolNewVehicle.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not Supported yet.");
            }
        });

        ImageIcon updateVehicleIcon = new ImageIcon(getClass().getResource("/com/flash/system/resource/edit_vehicle.png"));

        toolUpdateVehicle = new JButton(updateVehicleIcon);
        toolUpdateVehicle.setToolTipText("Update Vehicle");
        toolbar.add(toolUpdateVehicle);
        toolUpdateVehicle.setVisible(false);
        toolUpdateVehicle.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Not Supported yet.");
            }
        });

        toolLogInOut = new JButton("Log In");
        toolbar.add(Box.createHorizontalGlue());
        toolbar.add(toolLogInOut);

        toolLogInOut.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                if (MainWindow.appSession.containsKey("USERNAME")) {
                    int n = JOptionPane.showConfirmDialog(
                            null,
                            "You are going to logout. Are you sure ?",
                            "You are going to logout",
                            JOptionPane.YES_NO_OPTION);
                    if (n == JOptionPane.YES_OPTION) {
                        getLogInOut().setText("Log In");
                        MainWindow.appSession.remove("USERNAME");
                        clearBody();
                    }
                } else {
                    loginBody();
                }
            }
        });

        toolAddNewCustomerItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                if (aButton.getModel().isSelected()) {
                    toolNewCustomer.setVisible(true);
                } else {
                    toolNewCustomer.setVisible(false);
                }
            }
        });

        toolUpdateCustomerItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                if (aButton.getModel().isSelected()) {
                    toolUpdateCustomer.setVisible(true);
                } else {
                    toolUpdateCustomer.setVisible(false);
                }
            }
        });

        toolAddUserItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                if (aButton.getModel().isSelected()) {
                    toolNewUser.setVisible(true);
                } else {
                    toolNewUser.setVisible(false);
                }
            }
        });

        toolUpdateUserItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                if (aButton.getModel().isSelected()) {
                    toolUpdateUser.setVisible(true);
                } else {
                    toolUpdateUser.setVisible(false);
                }
            }
        });

        toolAddNewVehicleItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                if (aButton.getModel().isSelected()) {
                    toolNewVehicle.setVisible(true);
                } else {
                    toolNewVehicle.setVisible(false);
                }
            }
        });

        toolUpdateVehicleItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                if (aButton.getModel().isSelected()) {
                    toolUpdateVehicle.setVisible(true);
                } else {
                    toolUpdateVehicle.setVisible(false);
                }
            }
        });
    }

    private void loginBody() {
        base.removeAll();
        base.repaint();
        LogIn login = new LogIn(this);
        base.add(login);
        base.validate();
    }

    private void addCustomerBody() {
        base.removeAll();
        base.repaint();
        AddNewCustomer addNewCustomer = new AddNewCustomer(this);
        base.add(addNewCustomer);
        base.validate();
    }

    private void addNewUserBody() {
        base.removeAll();
        base.repaint();
        AddNewEmployee addNewUser = new AddNewEmployee(this);
        base.add(addNewUser);
        base.validate();
    }

    private void addNewServiceTypeBody() {
        base.removeAll();
        base.repaint();
        AddNewServiceType addNewUser = new AddNewServiceType(this);
        base.add(addNewUser);
        base.validate();
    }

    private void addNewUserTypeBody() {
        base.removeAll();
        base.repaint();
        AddNewEmployeeType addNewUserType = new AddNewEmployeeType(this);
        base.add(addNewUserType);
        base.validate();
    }

    private void addNewVehicleBody() {
        base.removeAll();
        base.repaint();
        AddNewVehicle vehicle = new AddNewVehicle(this);
        base.add(vehicle);
        base.validate();
    }

    private void addNewVehicleModelBody() {
        base.removeAll();
        base.repaint();
        AddNewVehicleModel vehModel = new AddNewVehicleModel(this);
        base.add(vehModel);
        base.validate();
    }

    private void addNewVehicleCategoryBody() {
        base.removeAll();
        base.repaint();
        AddNewVehicleCategory vehCategory = new AddNewVehicleCategory(this);
        base.add(vehCategory);
        base.validate();
    }

    private void addNewVehicleTypeBody() {
        base.removeAll();
        base.repaint();
        AddNewVehicleType vehType = new AddNewVehicleType(this);
        base.add(vehType);
        base.validate();
    }

    private void addNewPreOrderBody() {
        base.removeAll();
        base.repaint();
        AddNewPreOrderForm preOrderForm = new AddNewPreOrderForm(this);
        base.add(preOrderForm);
        base.validate();
    }

    private void clearBody() {
        base.removeAll();
        base.repaint();
        base.validate();
    }

    public void clearMainBody() {
        clearBody();
    }

    public JButton getLogInOut() {
        return toolLogInOut;
    }
}

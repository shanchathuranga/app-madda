package com.flash.system.main;

import com.Insert.Testdata.RandomString;
import com.flash.system.core.entity.*;
import com.flash.system.logic.CustomerManagerService;
import com.flash.system.logic.EmployeeManagerService;
import com.flash.system.logic.VehicleManagerService;
import com.flash.system.view.MainWindow;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author shan
 */
public class ConfigureApp {

    public static void runPreSQL() {
        System.out.println("Running DB queries...");

        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Account.class);
        config.addAnnotatedClass(Bill.class);
        config.addAnnotatedClass(Customer.class);
        config.addAnnotatedClass(Employee.class);
        config.addAnnotatedClass(EmployeeType.class);
        config.addAnnotatedClass(Item.class);
        config.addAnnotatedClass(Order.class);
        config.addAnnotatedClass(Permission.class);
        config.addAnnotatedClass(PreOrderForm.class);
        config.addAnnotatedClass(Service.class);
        config.addAnnotatedClass(ServiceType.class);
        config.addAnnotatedClass(Supplier.class);
        config.addAnnotatedClass(Vehicle.class);
        config.addAnnotatedClass(VehicleCategory.class);
        config.addAnnotatedClass(VehicleModel.class);
        config.addAnnotatedClass(VehicleType.class);

        config.configure();

        new SchemaExport(config).create(true, true);
    }

    public static void addSampleData() {
        addSampleCustomers();
        addSampleEmployeeTypes();
        addSampleVehicleCategories();
        addSampleVehicleModels();
        addSampleVehicleTypes();
    }

    private static void addSampleCustomers() {
        CustomerManagerService cm = new CustomerManagerService();
        RandomString myTestData = new RandomString();
        for (int i = 0; i < 10; i++) {
            String s = cm.addNewCustomer(myTestData.getRandomString(10),
                    myTestData.getRandomString(10), myTestData.getRandomString(10),
                    myTestData.getRandomString(10), myTestData.getRandomString(10),
                    myTestData.getRandomString(10), myTestData.getRandomString(10),
                    myTestData.getRandomString(10), myTestData.getRandomString(10),
                    myTestData.getRandomString(10), myTestData.getRandomString(10),
                    myTestData.getRandomString(10), myTestData.getRandomEmail(10),
                    myTestData.getRandomUrl(10), 0, 1);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }

    private static void addSampleEmployeeTypes() {
        EmployeeManagerService em = new EmployeeManagerService();
        RandomString myTestData = new RandomString();
        String[] empType = {"Maneger", "Chashier", "Accountant", "Mechanic", "Clener",
            "Tinker", "Painter", "Stockeper", "Other"};
        for (int i = 0; i < empType.length; i++) {
            String s = em.addEmployeeType(empType[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }

    private static void addSampleVehicleCategories() {
        VehicleManagerService vm = new VehicleManagerService();
        RandomString myTestData = new RandomString();
        String[] vCat = {"Bus", "Truck", "Lorry", "Van", "Car", "Pick Up", "Jeep", "Land Vehicles"};
        for (int i = 0; i < vCat.length; i++) {
            String s = vm.addNewVehicleCategory(vCat[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }

    private static void addSampleVehicleModels() {
        VehicleManagerService vm = new VehicleManagerService();
        RandomString myTestData = new RandomString();
        String[] vCat = {"TOYOTA", "NISSAN", "HONDA", "MITSUBISHI", "JEEP",
            "MICRO", "LAYLAND", "TATA", "LAND ROVER"};
        for (int i = 0; i < vCat.length; i++) {
            String s = vm.addNewVehicleModel(vCat[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }

    private static void addSampleVehicleTypes() {
        VehicleManagerService vm = new VehicleManagerService();
        RandomString myTestData = new RandomString();
        String[] vCat = {"PATROL", "DIESEL", "GAS", "ELECTRIC", "HYBRID", "OTHER"};
        for (int i = 0; i < vCat.length; i++) {
            String s = vm.addNewVehicleType(vCat[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }

    public static void startUI() {
        System.out.println("Application Starting...");

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);
            }
        });
    }

    public static void testQuery() {
        CustomerManagerService cms = new CustomerManagerService();
        try {
            Customer c = cms.getByEmail("xvmucplqpi@sampathzone.com");
            JOptionPane.showMessageDialog(null, c.getCustomerFName() + " : " + c.getEmail());
        } catch (Exception ex) {
            Logger.getLogger(ConfigureApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

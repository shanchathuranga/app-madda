package com.flash.system.main;

import com.flash.system.core.entity.*;
import com.flash.system.view.MainWindow;
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
      // TODO
      // create service objects
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

}

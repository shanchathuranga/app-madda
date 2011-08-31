package com.flash.system.main;

import com.flash.system.core.entity.Account;
import com.flash.system.core.entity.Bill;
import com.flash.system.core.entity.Customer;
import com.flash.system.core.entity.Employee;
import com.flash.system.core.entity.EmployeeType;
import com.flash.system.core.entity.Item;
import com.flash.system.core.entity.Job;
import com.flash.system.core.entity.Order;
import com.flash.system.core.entity.PreOrder;
import com.flash.system.core.entity.Repair;
import com.flash.system.core.entity.Service;
import com.flash.system.core.entity.Supplier;
import com.flash.system.core.entity.Vehicle;
import com.flash.system.view.MainWindow;
import javax.swing.SwingUtilities;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author shan
 */
public class Main {

    public static void main(String args[]) {

//        System.out.println("Running DB queries...");
//
//        AnnotationConfiguration config = new AnnotationConfiguration();
//        config.addAnnotatedClass(Account.class);
//        config.addAnnotatedClass(Bill.class);
//        config.addAnnotatedClass(Customer.class);
//        config.addAnnotatedClass(Employee.class);
//        config.addAnnotatedClass(EmployeeType.class);
//        config.addAnnotatedClass(Item.class);
//        config.addAnnotatedClass(Job.class);
//        config.addAnnotatedClass(Order.class);
//        config.addAnnotatedClass(Permission.class);
//        config.addAnnotatedClass(PreOrder.class);
//        config.addAnnotatedClass(Repair.class);
//        config.addAnnotatedClass(Service.class);
//        config.addAnnotatedClass(Supplier.class);
//        config.addAnnotatedClass(Vehicle.class);
//        config.configure();
//
//        new SchemaExport(config).create(true, true);

        System.out.println("Application Starting...");

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);
            }
        });
        
    }

}

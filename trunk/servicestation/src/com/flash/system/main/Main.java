package com.flash.system.main;

import com.flash.system.core.entity.Customer;
import com.flash.system.view.MainWindow;
import javax.swing.SwingUtilities;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author shan
 */
public class Main {

    public static void main(String args[]) {

        System.out.println("Running DB queries...");

        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Customer.class);
        config.configure();

        new SchemaExport(config).create(true, true);

        System.out.println("Starting...");

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);
            }
        });
        
    }

}

package com.flash.system.main;

import com.flash.system.view.MainWindow;
import javax.swing.SwingUtilities;

/**
 *
 * @author shan
 */
public class Main {

    public static void main(String args[]) {

        System.out.println("Starting...");

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);
            }
        });
        
    }

}

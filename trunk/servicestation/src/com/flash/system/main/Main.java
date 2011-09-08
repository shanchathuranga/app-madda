package com.flash.system.main;

import com.flash.system.view.LogIn;

/**
 *
 * @author shan
 */
public class Main {

    public static void main(String args[]) {

        System.out.println("Application starting...");

        //ConfigureApp.runPreSQL();

        //ConfigureApp.addSampleData();

        //ConfigureApp.testQuery();

        //ConfigureApp.runTestData();

        new LogIn();

        //ConfigureApp.startUI();

    }
}

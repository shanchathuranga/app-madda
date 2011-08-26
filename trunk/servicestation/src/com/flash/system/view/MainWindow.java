package com.flash.system.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author shan
 */
public class MainWindow extends JFrame{

    public MainWindow() {
        super();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        JPanel panel = new JPanel();
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
        panel.add(bt);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Flash Service Station");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

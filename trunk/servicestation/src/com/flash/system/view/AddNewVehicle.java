package com.flash.system.view;

import com.flash.system.core.entity.VehicleCategory;
import com.flash.system.core.entity.VehicleModel;
import com.flash.system.core.entity.VehicleType;
import com.flash.system.logic.VehicleManagerService;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author shan
 */
public class AddNewVehicle extends JPanel implements ActionListener {

    private VehicleManagerService vehicleManagerService;

    private CommonWindowUtilities comUtil;
    private JLabel lCaption;
    private JLabel lVehicleDetail;
    private JLabel lOwnerDetail;
    private JLabel lVehicleRegNo;
    private JLabel lChasseyNo;
    private JLabel lEngineNo;
    private JLabel lCylinderCapacity;
    private JLabel lFuelType;
    private JLabel lVehicleColor;
    private JLabel lMeterODO;
    private JLabel lVehicleCategory;
    private JLabel lVehicleModel;
    private JLabel lVehicleType;
    private JLabel lOwnerNIC;
    private JLabel lOwnerDL;
    private JLabel lOwnerFName;
    private JLabel lOwnerLName;
    private JLabel lOwnerAddr;
    private JLabel lNote;
    private JTextField tVehicleRegNo;
    private JTextField tChasseyNo;
    private JTextField tEngineNo;
    private JTextField tCylinderCapacity;
    private JTextField tFuelType;
    private JTextField tVehicleColor;
    private JTextField tMeterODO;
    private JComboBox tVehicleCategory;
    private JComboBox tVehicleModel;
    private JComboBox tVehicleType;
    private JTextField tOwnerNIC;
    private JTextField tOwnerDL;
    private JTextField tOwnerFName;
    private JTextField tOwnerLName;
    private JTextField tOwnerAddr;
    private JTextArea tNote;
    private JPanel base;
    private JPanel areaPanel;
    private JScrollPane scrollPane;
    private JButton bAddVehicle;
    private JButton bSaveVehicle;
    private JButton bClearVehicle;

    public AddNewVehicle(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;
        vehicleManagerService = new VehicleManagerService();

        List<VehicleCategory> vehicleCategoryList = vehicleManagerService.getAllVehicleCategories();
        List<VehicleModel> vehicleModelList = vehicleManagerService.getAllVehicleModels();
        List<VehicleType> vehicleTypeList = vehicleManagerService.getAllVehicleTypes();

        base = new JPanel();
        base.setLayout(new MigLayout());

        lCaption = new JLabel("Vehicle Registration");
        lCaption.setFont(new Font("Monospaced 12", Font.BOLD, 16));
        lCaption.setHorizontalAlignment(SwingUtilities.CENTER);
        lCaption.setPreferredSize(new Dimension(870, 30));
        lVehicleDetail = new JLabel("Vehicle Details");
        lVehicleDetail.setFont(new Font("Monospaced 12", Font.BOLD, 12));
        lVehicleDetail.setHorizontalAlignment(SwingUtilities.CENTER);
        lVehicleDetail.setPreferredSize(new Dimension(450, 30));
        lOwnerDetail = new JLabel("Owner Details");
        lOwnerDetail.setFont(new Font("Monospaced 12", Font.BOLD, 12));
        lOwnerDetail.setHorizontalAlignment(SwingUtilities.CENTER);
        lOwnerDetail.setPreferredSize(new Dimension(450, 30));
        lVehicleRegNo = new JLabel("Vehicle Reg No : ");
        lVehicleRegNo.setHorizontalAlignment(SwingUtilities.RIGHT);
        lVehicleRegNo.setPreferredSize(new Dimension(150, 30));
        lChasseyNo = new JLabel("Chassey No : ");
        lChasseyNo.setHorizontalAlignment(SwingUtilities.RIGHT);
        lChasseyNo.setPreferredSize(new Dimension(150, 30));
        lEngineNo = new JLabel("Engine No : ");
        lEngineNo.setHorizontalAlignment(SwingUtilities.RIGHT);
        lEngineNo.setPreferredSize(new Dimension(150, 30));
        lCylinderCapacity = new JLabel("Cylinder Capacity : ");
        lCylinderCapacity.setHorizontalAlignment(SwingUtilities.RIGHT);
        lCylinderCapacity.setPreferredSize(new Dimension(150, 30));
        lFuelType = new JLabel("Fuel Type : ");
        lFuelType.setHorizontalAlignment(SwingUtilities.RIGHT);
        lFuelType.setPreferredSize(new Dimension(150, 30));
        lVehicleColor = new JLabel("Vehicle Color : ");
        lVehicleColor.setHorizontalAlignment(SwingUtilities.RIGHT);
        lVehicleColor.setPreferredSize(new Dimension(150, 30));
        lMeterODO = new JLabel("ODO Meter : ");
        lMeterODO.setHorizontalAlignment(SwingUtilities.RIGHT);
        lMeterODO.setPreferredSize(new Dimension(150, 30));
        lVehicleCategory = new JLabel("Vehicle Category : ");
        lVehicleCategory.setHorizontalAlignment(SwingUtilities.RIGHT);
        lVehicleCategory.setPreferredSize(new Dimension(150, 30));
        lVehicleModel = new JLabel("Vehicle Model : ");
        lVehicleModel.setHorizontalAlignment(SwingUtilities.RIGHT);
        lVehicleModel.setPreferredSize(new Dimension(150, 30));
        lVehicleType = new JLabel("Vehicle Type : ");
        lVehicleType.setHorizontalAlignment(SwingUtilities.RIGHT);
        lVehicleType.setPreferredSize(new Dimension(150, 30));
        lOwnerNIC = new JLabel("Owner NIC : ");
        lOwnerNIC.setHorizontalAlignment(SwingUtilities.RIGHT);
        lOwnerNIC.setPreferredSize(new Dimension(150, 30));
        lOwnerDL = new JLabel("Owner DL : ");
        lOwnerDL.setHorizontalAlignment(SwingUtilities.RIGHT);
        lOwnerDL.setPreferredSize(new Dimension(150, 30));
        lOwnerFName = new JLabel("First Name : ");
        lOwnerFName.setHorizontalAlignment(SwingUtilities.RIGHT);
        lOwnerFName.setPreferredSize(new Dimension(150, 30));
        lOwnerLName = new JLabel("Last Name : ");
        lOwnerLName.setHorizontalAlignment(SwingUtilities.RIGHT);
        lOwnerLName.setPreferredSize(new Dimension(150, 30));
        lOwnerAddr = new JLabel("Address : ");
        lOwnerAddr.setHorizontalAlignment(SwingUtilities.RIGHT);
        lOwnerAddr.setPreferredSize(new Dimension(150, 30));
        lNote = new JLabel("Note : ");
        lNote.setHorizontalAlignment(SwingUtilities.RIGHT);
        lNote.setPreferredSize(new Dimension(150, 30));

        tVehicleRegNo = new JTextField();
        tVehicleRegNo.setPreferredSize(new Dimension(300, 30));
        tChasseyNo = new JTextField();
        tChasseyNo.setPreferredSize(new Dimension(300, 30));
        tEngineNo = new JTextField();
        tEngineNo.setPreferredSize(new Dimension(300, 30));
        tCylinderCapacity = new JTextField();
        tCylinderCapacity.setPreferredSize(new Dimension(300, 30));
        tFuelType = new JTextField();
        tFuelType.setPreferredSize(new Dimension(300, 30));
        tVehicleColor = new JTextField();
        tVehicleColor.setPreferredSize(new Dimension(300, 30));
        tMeterODO = new JTextField();
        tMeterODO.setPreferredSize(new Dimension(300, 30));
        tVehicleCategory = new JComboBox();
        tVehicleCategory.setPreferredSize(new Dimension(200, 30));
        tVehicleModel = new JComboBox();
        tVehicleModel.setPreferredSize(new Dimension(200, 30));
        tVehicleType = new JComboBox();
        tVehicleType.setPreferredSize(new Dimension(200, 30));
        tOwnerNIC = new JTextField();
        tOwnerNIC.setPreferredSize(new Dimension(300, 30));
        tOwnerDL = new JTextField();
        tOwnerDL.setPreferredSize(new Dimension(300, 30));
        tOwnerFName = new JTextField();
        tOwnerFName.setPreferredSize(new Dimension(300, 30));
        tOwnerLName = new JTextField();
        tOwnerLName.setPreferredSize(new Dimension(300, 30));
        tOwnerAddr = new JTextField();
        tOwnerAddr.setPreferredSize(new Dimension(300, 30));
        tNote = new JTextArea();
        scrollPane = new JScrollPane();
        areaPanel = new JPanel(new BorderLayout());

        tNote.setLineWrap(true);
        tNote.setWrapStyleWord(true);
        tNote.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        scrollPane.getViewport().add(tNote);
        scrollPane.setVerticalScrollBar(new JScrollBar());

        areaPanel.add(scrollPane);
        areaPanel.setPreferredSize(new Dimension(300, 90));

        bAddVehicle = new JButton(" Add ");
        bAddVehicle.setPreferredSize(new Dimension(96, 40));
        bAddVehicle.addActionListener(this);
        bSaveVehicle = new JButton(" Save ");
        bSaveVehicle.setPreferredSize(new Dimension(96, 40));
        bSaveVehicle.addActionListener(this);
        bClearVehicle = new JButton(" Clear ");
        bClearVehicle.setPreferredSize(new Dimension(96, 40));
        bClearVehicle.addActionListener(this);

        base.add(lCaption, "cell 0 0 4 1");
        base.add(lVehicleDetail, "cell 0 1 2 1");
        base.add(lOwnerDetail, "cell 2 1 2 1");
        base.add(lVehicleRegNo, "cell 0 2");
        base.add(lChasseyNo, "cell 0 3");
        base.add(lEngineNo, "cell 0 4");
        base.add(lCylinderCapacity, "cell 0 5");
        base.add(lFuelType, "cell 0 6");
        base.add(lVehicleColor, "cell 0 7");
        base.add(lMeterODO, "cell 0 8");
        base.add(lVehicleCategory, "cell 0 9");
        base.add(lVehicleModel, "cell 0 10");
        base.add(lVehicleType, "cell 0 11");
        base.add(lOwnerNIC, "cell 2 2");
        base.add(lOwnerDL, "cell 2 3");
        base.add(lOwnerFName, "cell 2 4");
        base.add(lOwnerLName, "cell 2 5");
        base.add(lOwnerAddr, "cell 2 6");
        base.add(lNote, "cell 2 7");

        base.add(tVehicleRegNo, "cell 1 2");
        base.add(tChasseyNo, "cell 1 3");
        base.add(tEngineNo, "cell 1 4");
        base.add(tCylinderCapacity, "cell 1 5");
        base.add(tFuelType, "cell 1 6");
        base.add(tVehicleColor, "cell 1 7");
        base.add(tMeterODO, "cell 1 8");
        base.add(tVehicleCategory, "cell 1 9");
        base.add(tVehicleModel, "cell 1 10");
        base.add(tVehicleType, "cell 1 11");
        base.add(tOwnerNIC, "cell 3 2");
        base.add(tOwnerDL, "cell 3 3");
        base.add(tOwnerFName, "cell 3 4");
        base.add(tOwnerLName, "cell 3 5");
        base.add(tOwnerAddr, "cell 3 6");
        base.add(areaPanel, "cell 3 7, span 1 3");

        base.add(bAddVehicle, "cell 3 11, span 1 2, split 3");
        base.add(bSaveVehicle);
        base.add(bClearVehicle);

        add(base);

        for(VehicleCategory vehicleCategory : vehicleCategoryList) {
            String s = vehicleCategory.getCategoryCode() +
                    " : " +vehicleCategory.getCategoryName();
            tVehicleCategory.addItem(s);
        }

        for(VehicleModel vehicleModel : vehicleModelList) {
            String s = vehicleModel.getModelCode() +
                    " : " + vehicleModel.getModelName();
            tVehicleModel.addItem(s);
        }

        for(VehicleType vehicleType : vehicleTypeList) {
            String s = vehicleType.getModelCode() +
                    " : " + vehicleType.getModelName();
            tVehicleType.addItem(s);
        }
    }

    public void actionPerformed(ActionEvent click) {
        if (click.getSource() == bAddVehicle) {
            // todo
        }
        if (click.getSource() == bSaveVehicle) {
            // todo
        }
        if (click.getSource() == bClearVehicle) {
            // todo
        }
    }
}

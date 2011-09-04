package com.flash.system.view;

import com.flash.system.core.dao.ServiceTypeDAO;
import com.flash.system.core.entity.ServiceType;
import com.flash.system.core.service.ServiceTypeDAOImpl;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author shan
 */
public class AddNewServiceType extends JPanel implements ActionListener {

    private CommonWindowUtilities comUtil;
    private JPanel base;
    private JLabel lServiceTypeName;
    private JLabel lServiceTypeCode;
    private JTextField tServiceTypeName;
    private JTextField tServiceTypeCode;
    private JButton bAddServiceType;

    public AddNewServiceType(CommonWindowUtilities comUtil) {
        this.comUtil = comUtil;

        base = new JPanel(new MigLayout());
        base.setPreferredSize(new Dimension(400, 200));
        base.setBorder(BorderFactory.createTitledBorder("  Add New Service Type  "));
        lServiceTypeName = new JLabel("Service Type Name : ");
        lServiceTypeName.setPreferredSize(new Dimension(150, 30));
        lServiceTypeName.setHorizontalAlignment(SwingUtilities.RIGHT);
        base.add(lServiceTypeName, "cell 0 0");
        tServiceTypeName = new JTextField();
        tServiceTypeName.setPreferredSize(new Dimension(160, 30));
        base.add(tServiceTypeName, "cell 1 0");
        lServiceTypeCode = new JLabel("Service Type Code : ");
        lServiceTypeCode.setPreferredSize(new Dimension(150, 30));
        lServiceTypeCode.setHorizontalAlignment(SwingUtilities.RIGHT);
        base.add(lServiceTypeCode, "cell 0 2");
        tServiceTypeCode = new JTextField();
        tServiceTypeCode.setPreferredSize(new Dimension(160, 30));
        base.add(tServiceTypeCode, "cell 1 2");
        bAddServiceType = new JButton("Add User Type");
        bAddServiceType.setPreferredSize(new Dimension(100, 30));
        base.add(bAddServiceType, "cell 1 3");

        bAddServiceType.addActionListener(this);

        add(base);
    }
    
    public void actionPerformed(ActionEvent click) {
        if( click.getSource() == bAddServiceType ) {
            ServiceTypeDAO serviceTypeDAO = new ServiceTypeDAOImpl();
            ServiceType st = new ServiceType();
            st.setServiceTypeCode(tServiceTypeCode.getText());
            st.setServiceTypeFullName(tServiceTypeName.getText());
            try {
                serviceTypeDAO.addServiceType(st);
            } catch (Exception ex) {
            }
            comUtil.clearMainBody();
        }
    }

}

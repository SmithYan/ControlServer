/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlserver;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author wy521
 */
public class JInternalFrameSubformTemplate extends JInternalFrame {

    public JInternalFrameSubformTemplate(String title, JDesktopPane desktopPane) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(400, 400);
        internalFrame.setVisible(true);
        JPanelControlSubform jpst = new JPanelControlSubform();
        jpst.setLocation(0, 0);
        jpst.setSize(400, 400);
        jpst.setVisible(true);
        internalFrame.add(jpst);
        //��JInternalFrame����JDesktopPane�У����һ������ʹ�����ܶ�JInternalFrame,JDesktopPaneҲ
        //�ܽ�����֮��Ĺ�ϵ������൱���á�
        desktopPane.add(internalFrame);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
        }
    }

}

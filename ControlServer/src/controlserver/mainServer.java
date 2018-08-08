/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlserver;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

/**
 * 服务器端控制
 * @author wy521
 */
public class mainServer extends javax.swing.JFrame {
     JDesktopPane desktopPane;
    private static final long serialVersionUID = 1L;
    /**
     * Creates new form mainServer
     */
    public mainServer() {
        initComponents();
        //声明容器指向this.getContentPane()
         Container contentPane = this.getContentPane();
         //设置容器中的排列方式
        contentPane.setLayout(new BorderLayout());
        /*建立一个新的JDesktopPane并加入于contentPane中
         */
        desktopPane = new JDesktopPane(); 
        contentPane.add(desktopPane);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuConnect = new javax.swing.JMenu();
        jMenuItemConnectAll = new javax.swing.JMenuItem();
        jMenuItemConnectSome = new javax.swing.JMenuItem();
        jMenuItemSaveIPAndPort = new javax.swing.JMenuItem();
        jMenuNewJFrame = new javax.swing.JMenu();
        jMenuItemJFrameAll = new javax.swing.JMenuItem();
        jMenuItemJFrameOne = new javax.swing.JMenuItem();
        jMenuItemJFrameSome = new javax.swing.JMenuItem();
        jMenuCloseJFrame = new javax.swing.JMenu();
        jMenuItemCloseAll = new javax.swing.JMenuItem();
        jMenuItemCloseSome = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuJFrameHelp = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ServerControl");
        setSize(new java.awt.Dimension(1000, 618));

        jMenuBar.setMinimumSize(new java.awt.Dimension(70, 40));
        jMenuBar.setName(""); // NOI18N

        jMenuConnect.setText("连接");

        jMenuItemConnectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemConnectAll.setText("连接所有客户端");
        jMenuItemConnectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConnectAllActionPerformed(evt);
            }
        });
        jMenuConnect.add(jMenuItemConnectAll);

        jMenuItemConnectSome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemConnectSome.setText("连接单个或多个客户端");
        jMenuConnect.add(jMenuItemConnectSome);

        jMenuItemSaveIPAndPort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSaveIPAndPort.setText("保存所有IP以及端口到本地");
        jMenuConnect.add(jMenuItemSaveIPAndPort);

        jMenuBar.add(jMenuConnect);

        jMenuNewJFrame.setText("新建");

        jMenuItemJFrameAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemJFrameAll.setText("打开所有客户端控制窗口");
        jMenuNewJFrame.add(jMenuItemJFrameAll);

        jMenuItemJFrameOne.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemJFrameOne.setText("打开单个客户端控制窗口");
        jMenuNewJFrame.add(jMenuItemJFrameOne);

        jMenuItemJFrameSome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemJFrameSome.setText("打开一组客户端控制窗口");
        jMenuNewJFrame.add(jMenuItemJFrameSome);

        jMenuBar.add(jMenuNewJFrame);

        jMenuCloseJFrame.setText("关闭");

        jMenuItemCloseAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCloseAll.setText("关闭所有客户端");
        jMenuCloseJFrame.add(jMenuItemCloseAll);

        jMenuItemCloseSome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCloseSome.setText("关闭单个或多个客户端");
        jMenuCloseJFrame.add(jMenuItemCloseSome);

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemExit.setText("退出程序");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuCloseJFrame.add(jMenuItemExit);

        jMenuBar.add(jMenuCloseJFrame);

        jMenuJFrameHelp.setText("帮助");
        jMenuBar.add(jMenuJFrameHelp);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemConnectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConnectAllActionPerformed
        
    }//GEN-LAST:event_jMenuItemConnectAllActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCloseJFrame;
    private javax.swing.JMenu jMenuConnect;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCloseAll;
    private javax.swing.JMenuItem jMenuItemCloseSome;
    private javax.swing.JMenuItem jMenuItemConnectAll;
    private javax.swing.JMenuItem jMenuItemConnectSome;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemJFrameAll;
    private javax.swing.JMenuItem jMenuItemJFrameOne;
    private javax.swing.JMenuItem jMenuItemJFrameSome;
    private javax.swing.JMenuItem jMenuItemSaveIPAndPort;
    private javax.swing.JMenu jMenuJFrameHelp;
    private javax.swing.JMenu jMenuNewJFrame;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlserver;

import javax.swing.DefaultButtonModel;

/**
 *
 * @author wy521
 */
public class JPanelSubformTemplate extends javax.swing.JPanel {

    /**
     * Creates new form JPanelSubformTemplate
     */
    public JPanelSubformTemplate() {
        initComponents();
        init();
    }
private void init(){
    this.buttonGroup.add(this.jRadioButtonText);
    this.buttonGroup.add(this.jRadioButtonCommand);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jRadioButtonText = new javax.swing.JRadioButton();
        jRadioButtonCommand = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaShow = new javax.swing.JTextArea();
        jTextFieldToSend = new javax.swing.JTextField();
        jButtonConfiguration = new javax.swing.JButton();
        jButtonSend = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 51));

        jRadioButtonText.setSelected(true);
        jRadioButtonText.setText("Text");

        jRadioButtonCommand.setText("Command");

        jTextAreaShow.setColumns(20);
        jTextAreaShow.setRows(5);
        jScrollPane1.setViewportView(jTextAreaShow);

        jButtonConfiguration.setText("������Ϣ");

        jButtonSend.setText("����");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonText)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonCommand)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldToSend)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConfiguration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonText)
                    .addComponent(jRadioButtonCommand)
                    .addComponent(jButtonConfiguration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldToSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonConfiguration;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JRadioButton jRadioButtonCommand;
    private javax.swing.JRadioButton jRadioButtonText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaShow;
    private javax.swing.JTextField jTextFieldToSend;
    // End of variables declaration//GEN-END:variables
}

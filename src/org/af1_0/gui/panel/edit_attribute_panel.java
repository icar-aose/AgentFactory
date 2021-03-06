/*
 * edit_attribute_panel.java
 *
 * Created on 3 novembre 2002, 15.16
 */

package org.af1_0.gui.panel;

import java.util.Iterator;

import org.af1_0.entity.*;
import org.af1_0.gui.command.command;

/**
 *
 * @author  Luca
 */
public class edit_attribute_panel extends javax.swing.JPanel {
    protected java_attribute attribute = null;
    command ok_command = null;
    command cancel_command = null;
    
    /** Creates new form edit_attribute_panel */
    public edit_attribute_panel() {
        initComponents();
    }
    
    public void setSuggested(java_attribute the_attribute) {
        attribute = new java_attribute();
        
        attribute.setName( the_attribute.getName() );
        attribute.setType( the_attribute.getType() );
        attribute.setStartValue( the_attribute.getStartValue() );
        attribute.setVisibility( the_attribute.getVisibility() );

        nameField.setText( attribute.getName() );
        typeField.setText( attribute.getType() );
        valueField.setText( attribute.getStartValue() );
        
        String vis = attribute.getVisibility();
        if (vis.equals("public"))
            publicRadioButton.setSelected(true);
        else if (vis.equals("package"))
            packageRadioButton.setSelected(true);
        else if (vis.equals("protected"))
            protectedRadioButton.setSelected(true);
        else
            privateRadioButton.setSelected(true);
        
        staticCB.setSelected(false);
        finalCB.setSelected(false);
        nativeCB.setSelected(false);
        volatileCB.setSelected(false);
        Iterator it = the_attribute.getModifierList();
        while(it.hasNext()) {
            String mod = (String) it.next();
            if (mod.equals("static"))
                staticCB.setSelected(true);
            else if (mod.equals("final"))
                finalCB.setSelected(true);
            else if (mod.equals("native"))
                nativeCB.setSelected(true);
            else if (mod.equals("volatile"))
                volatileCB.setSelected(true);
        }
    }
    
    public java_attribute getAttribute() {
        return attribute;
    }

    public void setOkCommand(command ok) {
        ok_command = ok;
    }
    
    public void setCancelCommand(command cancel) {
        cancel_command = cancel;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        visibilityGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        typeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valueField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        publicRadioButton = new javax.swing.JRadioButton();
        privateRadioButton = new javax.swing.JRadioButton();
        protectedRadioButton = new javax.swing.JRadioButton();
        packageRadioButton = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        staticCB = new javax.swing.JCheckBox();
        finalCB = new javax.swing.JCheckBox();
        nativeCB = new javax.swing.JCheckBox();
        volatileCB = new javax.swing.JCheckBox();

        setLayout(new java.awt.BorderLayout());

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        jPanel1.add(OKButton);

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jPanel1.add(CancelButton);

        add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel1.setText("Name: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel5.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.9;
        jPanel5.add(nameField, gridBagConstraints);

        jLabel2.setText("Type: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel5.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.9;
        jPanel5.add(typeField, gridBagConstraints);

        jLabel3.setText("Start value: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel5.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.9;
        jPanel5.add(valueField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = -1.0;
        jPanel2.add(jPanel5, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        jPanel3.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Visibility"), new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 20, 1, 20))));
        publicRadioButton.setText("public");
        visibilityGroup.add(publicRadioButton);
        jPanel3.add(publicRadioButton);

        privateRadioButton.setText("private");
        visibilityGroup.add(privateRadioButton);
        jPanel3.add(privateRadioButton);

        protectedRadioButton.setText("protected");
        visibilityGroup.add(protectedRadioButton);
        jPanel3.add(protectedRadioButton);

        packageRadioButton.setText("package");
        visibilityGroup.add(packageRadioButton);
        jPanel3.add(packageRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.6;
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Modifiers"), new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 20, 1, 20))));
        staticCB.setText("static");
        jPanel4.add(staticCB);

        finalCB.setText("final");
        jPanel4.add(finalCB);

        nativeCB.setText("native");
        jPanel4.add(nativeCB);

        volatileCB.setText("volatile");
        jPanel4.add(volatileCB);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.6;
        jPanel2.add(jPanel4, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        attribute.setName(null);
        if (cancel_command != null)
            cancel_command.execute();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        attribute.setName( nameField.getText() );
        attribute.setType( typeField.getText() );
        attribute.setStartValue( valueField.getText() );        
        
        if (publicRadioButton.isSelected())
            attribute.setVisibility("public");
        else if (privateRadioButton.isSelected())
            attribute.setVisibility("private");
        else if (protectedRadioButton.isSelected())
            attribute.setVisibility("protected");
        else if (packageRadioButton.isSelected())
            attribute.setVisibility("package");

        if (staticCB.isSelected()==true)
            attribute.addModifier("static");
        if (finalCB.isSelected()==true)
            attribute.addModifier("final");
        if (nativeCB.isSelected()==true)
            attribute.addModifier("native");
        if (volatileCB.isSelected()==true)
            attribute.addModifier("volatile");
        
        if (ok_command != null)
            ok_command.execute();
        
    }//GEN-LAST:event_OKButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox nativeCB;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField typeField;
    private javax.swing.JCheckBox volatileCB;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton OKButton;
    private javax.swing.JRadioButton packageRadioButton;
    private javax.swing.JCheckBox finalCB;
    private javax.swing.JRadioButton publicRadioButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField valueField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup visibilityGroup;
    private javax.swing.JCheckBox staticCB;
    private javax.swing.JRadioButton privateRadioButton;
    private javax.swing.JRadioButton protectedRadioButton;
    // End of variables declaration//GEN-END:variables
    
}

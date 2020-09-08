/*
 * edit_method_panel.java
 *
 * Created on 4 novembre 2002, 9.54
 */

package org.af1_0.gui.panel;

import java.util.Iterator;

import org.af1_0.entity.*;
import org.af1_0.gui.command.command;

/**
 *
 * @author  Luca
 */
public class edit_class_panel extends javax.swing.JPanel {
    protected java_class _class = null;
    command ok_command = null;
    command cancel_command = null;
    
    /** Creates new form edit_method_panel */
    public edit_class_panel() {
        initComponents();
    }
    
    public void setSuggested(java_class the_class) {
        _class = new java_class();
        
        _class.setName( the_class.getName() );
        _class.setExtends( the_class.getExtends() );
        _class.setVisibility( the_class.getVisibility() );

        nameField.setText( _class.getName() );
        typeField.setText( _class.getExtends() );
                
        abstractCB.setSelected(false);
        finalCB.setSelected(false);
        Iterator it = the_class.getModifierList();
        while(it.hasNext()) {
            String mod = (String) it.next();
            if (mod.equals("abstract"))
                abstractCB.setSelected(true);
            else if (mod.equals("final"))
                finalCB.setSelected(true);
        }
                
    }
    
    public java_class getClassObject() {
        return _class;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        finalCB = new javax.swing.JCheckBox();
        abstractCB = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        typeField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jTextField61 = new javax.swing.JTextField();
        jList11 = new javax.swing.JList();
        jPanel8 = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        panel1.add(OKButton);

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        panel1.add(CancelButton);

        add(panel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        jPanel4.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Modifiers"), new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 20, 1, 20))));
        finalCB.setText("final");
        jPanel4.add(finalCB);

        abstractCB.setText("abstract");
        jPanel4.add(abstractCB);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.2;
        jPanel2.add(jPanel4, gridBagConstraints);

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

        jLabel2.setText("Extends: ");
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = -1.0;
        jPanel2.add(jPanel5, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBorder(new javax.swing.border.TitledBorder("Interfaces"));
        jLabel61.setText("Implements: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = -1.0;
        jPanel6.add(jLabel61, gridBagConstraints);

        jTextField61.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.weightx = 0.8;
        jPanel6.add(jTextField61, gridBagConstraints);

        jList11.setPreferredSize(new java.awt.Dimension(50, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel6.add(jList11, gridBagConstraints);

        jPanel8.setLayout(new java.awt.GridLayout(2, 0));

        jButton31.setText("Add");
        jButton31.setToolTipText("");
        jPanel8.add(jButton31);

        jButton4.setText("Delete");
        jPanel8.add(jButton4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        jPanel6.add(jPanel8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.8;
        jPanel2.add(jPanel6, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        _class.setName(null);
        if (cancel_command != null)
            cancel_command.execute();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        _class.setName( nameField.getText() );
        _class.setExtends( typeField.getText() );
        
        if (abstractCB.isSelected()==true)
            _class.addModifier("abstract");
        if (finalCB.isSelected()==true)
            _class.addModifier("final");
        
        if (ok_command != null)
            ok_command.execute();
    }//GEN-LAST:event_OKButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jButton31;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox abstractCB;
    private javax.swing.JTextField typeField;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panel1;
    private javax.swing.JButton OKButton;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JCheckBox finalCB;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JButton CancelButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JList jList11;
    // End of variables declaration//GEN-END:variables
    
}
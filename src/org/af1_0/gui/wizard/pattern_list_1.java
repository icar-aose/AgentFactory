/*
 * pattern_list.java
 *
 * Created on 30 novembre 2002, 13.44
 */

package org.af1_0.gui.wizard;

import java.util.Vector;
import java.util.Iterator;

import org.af1_0.pattern.pattern_description;
/**
 *
 * @author  Luca
 */
public class pattern_list_1 extends javax.swing.JPanel {
    private Vector patterns = null;
    private pattern_description pattern_selected = null;
    
    /** Creates new form pattern_list */
    public pattern_list_1() {
        initComponents();
    }
    
    public pattern_description getPatternSelected() {
        return pattern_selected;
    }
    
    public void setPatternList(Vector pattern_list) {
        patterns = pattern_list;
        
        Vector names = new Vector();
        Iterator it = pattern_list.iterator();
        while (it.hasNext()) {
            pattern_description patt = (pattern_description) it.next();
            names.add(patt.getName());
        }
        
        PatternList.setSelectedIndex(-1);
        PatternList.setListData(names);
        pattern_selected = null;
    }
    
    public void setTitle(String titolo) {
        jLabel1.setText(titolo);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Scenario = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        PatternList = new javax.swing.JList();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Titolo");
        add(jLabel1, java.awt.BorderLayout.NORTH);

        jSplitPane1.setDividerLocation(200);
        jSplitPane2.setDividerLocation(100);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder("Description"));
        Description.setEditable(false);
        Description.setLineWrap(true);
        Description.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Description);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane2.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(new javax.swing.border.TitledBorder("Scenario"));
        Scenario.setEditable(false);
        Scenario.setLineWrap(true);
        Scenario.setWrapStyleWord(true);
        jScrollPane2.setViewportView(Scenario);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jSplitPane2.setRightComponent(jPanel2);

        jSplitPane1.setRightComponent(jSplitPane2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(new javax.swing.border.TitledBorder("Select a pattern"));
        PatternList.setBorder(new javax.swing.border.EtchedBorder());
        PatternList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                PatternListValueChanged(evt);
            }
        });

        jPanel3.add(PatternList, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel3);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents

    private void PatternListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_PatternListValueChanged
        int index = PatternList.getSelectedIndex();
        if (index != -1) {
            pattern_selected = (pattern_description) patterns.get(index);
            Description.setText( pattern_selected.getDescription() );
            Scenario.setText( pattern_selected.getScenario() );   
        }
    }//GEN-LAST:event_PatternListValueChanged
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextArea Description;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList PatternList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea Scenario;
    // End of variables declaration//GEN-END:variables
    
}
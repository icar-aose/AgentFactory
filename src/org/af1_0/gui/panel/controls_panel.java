/*
 * controls_panel.java
 *
 * Created on 2 novembre 2002, 15.38
 */

package org.af1_0.gui.panel;

import org.af1_0.gui.*;
import org.af1_0.gui.wizard.*;
import org.af1_0.gui.command.command;

import org.af1_0.gui.options.*;

/**
 *
 * @author  Luca
 */
public class controls_panel extends javax.swing.JPanel {
    protected edit_class_panel name = new edit_class_panel();
    protected edit_relation_panel rel = new edit_relation_panel();
    protected edit_attribute_panel attribute = new edit_attribute_panel();
    protected edit_method_panel method = new edit_method_panel();
    protected classDiagram class_panel = new classDiagram();
    protected activityDiagram activity_panel = new activityDiagram();
    protected codeView code_panel = new codeView();
    protected wizard_control wizard = new wizard_control();
    protected option_controls options_sheet = new option_controls();
    protected InfoPanel info = new InfoPanel();
    
    protected command show_agent = null;
    
    /** Creates new form controls_panel */
    public controls_panel() {
        initComponents();
    }
    
    public void clear() {
        class_panel.clear();
        activity_panel.clear();
        code_panel.clear();
        show_agent = null;
    }
    
    public edit_class_panel getNamePanel() {
        return name;
    }
    public edit_relation_panel getRelationPanel() {
        return rel;
    }
    public edit_attribute_panel getAttributePanel() {
        return attribute;
    }
    public edit_method_panel getMethodPanel() {
        return method;
    }
    
    public classDiagram getClassPanel() {
        return class_panel;
    }
       
    public activityDiagram getActivityPanel() {
        return activity_panel;
    }
    
    public codeView getCodePanel() {
        return code_panel;
    }

    public wizard_control getWizardPanel() {
        return wizard;
    }

    public option_controls getOptionPanel() {
        return options_sheet;
    }

    public void setAgentCommand(command a_command) {
        show_agent = a_command;
    }
    
    public void updateAgentShow() {
        if (show_agent != null)
            show_agent.execute();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        mas_panel = new javax.swing.JTabbedPane();
        static_scrollbar = new javax.swing.JScrollPane();
        static_panel = class_panel;
        dynamic_scrollbar = new javax.swing.JScrollPane();
        dynamic_panel = activity_panel;
        code_scrollbar = new javax.swing.JScrollPane();
        java_panel = code_panel;
        empty_panel = new javax.swing.JPanel();
        name_panel = name;
        attribute_panel = attribute;
        method_panel = method;
        relation_panel = rel;
        wizard_panel = wizard;
        option_panel = options_sheet;
        info_panel = info;

        setLayout(new java.awt.CardLayout());

        static_panel.setLayout(new java.awt.BorderLayout());

        static_scrollbar.setViewportView(static_panel);

        mas_panel.addTab("static structure", static_scrollbar);

        dynamic_scrollbar.setViewportView(dynamic_panel);

        mas_panel.addTab("dynamic behaviour", dynamic_scrollbar);

        code_scrollbar.setViewportView(java_panel);

        mas_panel.addTab("code generation", code_scrollbar);

        add(mas_panel, "mas_view");

        add(empty_panel, "empty");

        add(name_panel, "name_view");

        add(attribute_panel, "attribute_view");

        add(method_panel, "method_view");

        add(relation_panel, "relation_view");

        add(wizard_panel, "wizard");

        add(option_panel, "options");

        add(info_panel, "about");

    }//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel attribute_panel;
    private javax.swing.JScrollPane dynamic_scrollbar;
    private javax.swing.JScrollPane static_scrollbar;
    private javax.swing.JPanel relation_panel;
    private javax.swing.JTabbedPane mas_panel;
    private javax.swing.JPanel static_panel;
    private javax.swing.JScrollPane code_scrollbar;
    private javax.swing.JPanel name_panel;
    private javax.swing.JPanel method_panel;
    private javax.swing.JPanel info_panel;
    private javax.swing.JPanel dynamic_panel;
    private javax.swing.JPanel option_panel;
    private javax.swing.JPanel empty_panel;
    private javax.swing.JPanel wizard_panel;
    private javax.swing.JPanel java_panel;
    // End of variables declaration//GEN-END:variables
    
}
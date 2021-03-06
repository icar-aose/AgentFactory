/*
 * component_wizard_start.java
 *
 * Created on 30 novembre 2002, 11.19
 */

package org.af1_0.gui.command.behaviour_wizard;

import java.util.Vector;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

import org.af1_0.gui.command.*;
import org.af1_0.gui.*;
import org.af1_0.gui.panel.controls_panel;
import org.af1_0.mas.multi_agent_system;
import org.af1_0.entity.*;
import org.af1_0.pattern.*;
import org.af1_0.mas.*;

/**
 *
 * @author  Luca
 */
public class behaviour_wizard implements command {
    protected multi_agent_system current_model;
    protected controls_panel controls;
    protected TreeModelUpdate tree_model;
    
    /** Creates a new instance of component_wizard_start */
    public behaviour_wizard(controls_panel the_controls, multi_agent_system current, TreeModelUpdate model) {
        current_model = current;
        controls = the_controls;
        tree_model = model;
    }
    
    public void execute() {
        controls.getWizardPanel().getPatternListPanel().setTitle("Behaviour pattern list");
        controls.getWizardPanel().getPatternOverviewPanel().setTitle("Behaviour pattern overview");
        controls.getWizardPanel().getAgentTargetPanel().setTitle("Agent target selection");
        controls.getWizardPanel().getSelectionPanel().setTitle("Task target selection");
        
        // 1.0 preleva tutti i pattern dal repository
        Vector pattern_list = new Vector();
        Vector names = current_model.getRepository().queryBehaviourList();
        
		Iterator it = names.iterator();
        while (it.hasNext()) {
            String pattern_name = (String) it.next();
            pattern_list.add( current_model.getRepository().queryBehaviourItem(pattern_name) );
        }
        
        // effettua l'ordinamento dei pattern per la visualizzazione
        Collections.sort(pattern_list, new Comparator() {
            public int compare(Object a, Object b) {
                String aid = ((pattern_description)a).getName();
                String bid = ((pattern_description)b).getName();
                return aid.compareTo(bid);
            }
        });
        
        controls.getWizardPanel().getPatternListPanel().setPatternList(pattern_list);  
        
        // 2.0 preleva tutti gli agenti dal repository
        Vector agent_list = new Vector();
        it = current_model.getStatic().values().iterator();
        while (it.hasNext()) {
            entity ent = (entity) it.next();
            if (ent.isAgent()) {
                java_class agent = (java_class) ent;
                agent_list.add(agent.getName());
            }
        }
        
        controls.getWizardPanel().getAgentTargetPanel().setAgentList(agent_list);
        
        // 3.0 mostra la prima scheda
        behaviour_wizard_sheet1 sheet1 = new behaviour_wizard_sheet1( controls, current_model, tree_model);
        ((java.awt.CardLayout) controls.getLayout()).show(controls,"wizard");
        
        sheet1.execute();
    }
    
}

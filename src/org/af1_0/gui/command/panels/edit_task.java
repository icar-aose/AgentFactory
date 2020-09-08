/*
 * add_new_agent.java
 *
 * Created on 2 novembre 2002, 10.49
 */

package org.af1_0.gui.command.panels;

import java.util.Iterator;

import org.af1_0.gui.command.*;
import org.af1_0.gui.*;
import org.af1_0.gui.panel.controls_panel;
import org.af1_0.mas.multi_agent_system;
import org.af1_0.entity.*;
import org.af1_0.mas.*;

/** Questa classe svolge il compito di aggiungere un nuovo agente al multi-agent system corrente
 * @author Luca
 */
public class edit_task extends edit_command implements command {
    protected java_class task;
    
    /** Creates a new instance of add_new_agent */
    public edit_task(controls_panel controls, multi_agent_system model, java_class the_task) {
        super(controls,model);
        task = the_task;
    }
    
    /** Esegue l'operazione
     */    
    public void execute() {     
        // 1. preleva il nome dell'agente
        java_class new_task = controls.getNamePanel().getClassObject();
        //String task_name = controls.getNamePanel().getName();
        //String new_task_name = controls.getNamePanel().getName();

        // 2. opera il rename
        entity_renaming renaming = new entity_renaming(current_model);

        renaming.renameAgent(task, new_task.getName());
        task.setExtends( new_task.getExtends() );
        
        Iterator deleting = task.getModifierList();
        while(deleting.hasNext()) {
            deleting.next();
            deleting.remove();
        }      
        Iterator adding = new_task.getModifierList();
        while(adding.hasNext()) {
            task.addModifier( (String) adding.next() );
        }
        //current_model.getStatic().remove(task.getName());
        //task.setName( new_task_name );
        //current_model.getStatic().put(new_task_name, task);
        
        // 3. aggiorna la vista ad albero
        task.notifyChange();
        controls.updateAgentShow();
        
        // 4. annulla la vista corrente
        ((java.awt.CardLayout) controls.getLayout()).show(controls,"mas_view");
    }
    
    public void setOnEnd(command onend) {
    }
    
}

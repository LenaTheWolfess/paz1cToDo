/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.todo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author student
 */
public class UlohaListCellRenderer extends DefaultListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component ulohaCompomnent = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); 
        Uloha uloha = (Uloha) value;
        if(jeSplnena(uloha))
        {
            ulohaCompomnent.setForeground(new Color(0.0f, 0.5f, 0.0f));
        }        
        return ulohaCompomnent;
    }

    private boolean jeSplnena(Uloha uloha) {
        return uloha.isSplnena();
    }
    
        
}

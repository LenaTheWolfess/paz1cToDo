/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.todo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author student
 */
public class UlohaListCellRenderer implements ListCellRenderer<Uloha>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Uloha> list, Uloha uloha, int index, boolean isSelected, boolean cellHasFocus) {
        
        JLabel ulohaLabel = new JLabel(uloha.toString());
        
        if(jeSplnena(uloha))
        {
            ulohaLabel.setOpaque(true);
            ulohaLabel.setBackground(Color.GREEN);
        }
        
        return ulohaLabel;
    }

    private boolean jeSplnena(Uloha uloha) {
        return true;
    }
    
}

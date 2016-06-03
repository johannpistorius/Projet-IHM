/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetihm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @authors BOURG Thomas, KOUSONSAVATH Sanlasun, PISTORIUS Johann
 */
public class BarreMenu extends JPanel{
    JComboBox box;
    JButton button;
    PageVente container;
    /**
     * Constructeur
     * @param pv la page principale
     */
    public BarreMenu(PageVente pv){
        super();
        container = pv;
        init();
    }
    
    public final void init(){
        setPreferredSize(new Dimension(750, 100));
        setBackground(Color.GRAY);
        box=new JComboBox();
        box.addItem("Tri par nom");
        box.addItem("Tri par Espece");
        button=new JButton(new AbstractAction("Trier"){
             @Override
            public void actionPerformed( ActionEvent e ) {
                String select = box.getSelectedItem().toString();
                if(select.equals("Tri par nom"))
                {
                    container.setListe(Tri.triParNom(container.getListe()));
                }
                else if(select.equals("Tri par nom"))
                {
                    container.setListe(Tri.triParEspece(container.getListe()));
                }
            }
        });
        add(box);
        add(button);
    }

}

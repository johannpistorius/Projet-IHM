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
 * @author tbour_000
 */
public class BarreMenu extends JPanel{
    JButton triNom;
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
    
    public void init(){
        setPreferredSize(new Dimension(750, 100));
        triNom =new JButton("Tri par nom");
        triNom.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setListe(Tri.triParNom(container.getListe()));
            }
        });
        add(triNom);
    }

}

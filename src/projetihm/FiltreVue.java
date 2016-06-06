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
public class FiltreVue extends JPanel{
    JComboBox box_prix;
    JComboBox box_poids;
    JComboBox box_taille;
    JComboBox box_sexe;
    JComboBox box;
    JButton button;
    PageVente container;
    /**
     * Constructeur
     * @param pv la page principale
     */
    public FiltreVue(PageVente pv){
        super();
        container = pv;
        init();
    }
    
    public final void init(){
        setPreferredSize(new Dimension(100, 750));
        setBackground(Color.GRAY);
        box_poids=new JComboBox();
        box_poids.addItem("0 - 200");
        box_poids.addItem("200 - 400");
        box_poids.addItem("400 - 600");
        box_poids.addItem("600 et +");
        box_taille=new JComboBox();
        box_taille.addItem("0 - 100");
        box_taille.addItem("100 - 200");
        box_taille.addItem("200 - 300");
        box_taille.addItem("300 et +");
        box_prix=new JComboBox();
        box_prix.addItem("0 - 500");
        box_prix.addItem("500 - 1500");
        box_prix.addItem("1500 - 3000");
        box_prix.addItem("3000 et +");
        box_sexe=new JComboBox();
        box_sexe.addItem("M");
        box_sexe.addItem("F");
        button=new JButton(new AbstractAction("Filtrer"){
            @Override
            public void actionPerformed( ActionEvent e ) {
                int select_pd = box_poids.getSelectedIndex();
                int select_ta = box_taille.getSelectedIndex();
                int select_pr = box_prix.getSelectedIndex();
                int select_sexe = box_sexe.getSelectedIndex();
                switch(select_pd){
                    case 0: container.setListe(Filtre.filtreParPoids(container.getListe(), 0, 200));
                        break;
                    case 1:container.setListe(Filtre.filtreParPoids(container.getListe(), 200, 400));
                        break;
                    case 2:container.setListe(Filtre.filtreParPoids(container.getListe(), 400, 600));
                        break;
                    case 3:container.setListe(Filtre.filtreParPoids(container.getListe(), 600, Integer.MAX_VALUE));
                        break;
                }
                switch(select_ta){
                    case 0:container.setListe(Filtre.filtreParTaille(container.getListe(), 0, 100));
                        break;
                    case 1:container.setListe(Filtre.filtreParTaille(container.getListe(), 100, 200));
                        break;
                    case 2:container.setListe(Filtre.filtreParTaille(container.getListe(), 200, 300));
                        break;
                    case 3:container.setListe(Filtre.filtreParTaille(container.getListe(), 300, Integer.MAX_VALUE));
                        break;
                }
                switch(select_pr){
                    case 0:container.setListe(Filtre.filtreParPrix(container.getListe(), 0, 500));
                        break;
                    case 1:container.setListe(Filtre.filtreParPrix(container.getListe(), 500, 1500));
                        break;
                    case 2:container.setListe(Filtre.filtreParPrix(container.getListe(), 15000, 3000));
                        break;
                    case 3:container.setListe(Filtre.filtreParPrix(container.getListe(), 3000, Integer.MAX_VALUE));
                        break;
                }
                switch (select_sexe){
                    case 0:container.setListe(Filtre.filtreParSexe(container.getListe(), "M"));
                        break;
                    case 1:container.setListe(Filtre.filtreParSexe(container.getListe(), "F"));
                        break;
                }
            }
        });
        add(new JLabel("Taille :"));
        add(box_taille);
        add(new JLabel("Poids :"));
        add(box_poids);
        add(new JLabel("Prix :"));
        add(box_prix);
        add(new JLabel("Sexe :"));
        add(box_sexe);
        add(button);
    }

}
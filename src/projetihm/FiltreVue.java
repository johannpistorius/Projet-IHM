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
    JComboBox box_age;
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
        box_poids.addItem("");
        box_poids.addItem("0 - 200");
        box_poids.addItem("200 - 400");
        box_poids.addItem("400 - 600");
        box_poids.addItem("600 et +");
        box_taille=new JComboBox();
        box_taille.addItem("");
        box_taille.addItem("0 - 100");
        box_taille.addItem("100 - 200");
        box_taille.addItem("200 - 300");
        box_taille.addItem("300 et +");
        box_prix=new JComboBox();
        box_prix.addItem("");
        box_prix.addItem("0 - 500");
        box_prix.addItem("500 - 1500");
        box_prix.addItem("1500 - 3000");
        box_prix.addItem("3000 et +");
        box_sexe=new JComboBox();
        box_sexe.addItem("");
        box_sexe.addItem("M");
        box_sexe.addItem("F");
        box_age=new JComboBox();
        box_age.addItem("");
        box_age.addItem("0 - 50");
        box_age.addItem("50 - 100");
        box_age.addItem("100 - 150");
        box_age.addItem("150 - 200");
        box_age.addItem("200 et +");
        button=new JButton(new AbstractAction("Filtrer"){
            @Override
            public void actionPerformed( ActionEvent e ) {
                int select_pd = box_poids.getSelectedIndex();
                int select_ta = box_taille.getSelectedIndex();
                int select_pr = box_prix.getSelectedIndex();
                int select_sexe = box_sexe.getSelectedIndex();
                int select_age = box_age.getSelectedIndex();
                switch(select_pd){
                    case 1: container.setListe(Filtre.filtreParPoids(container.tortue, 0, 200));
                        break;
                    case 2:container.setListe(Filtre.filtreParPoids(container.tortue, 200, 400));
                        break;
                    case 3:container.setListe(Filtre.filtreParPoids(container.tortue, 400, 600));
                        break;
                    case 4:container.setListe(Filtre.filtreParPoids(container.tortue, 600, Integer.MAX_VALUE));
                        break;
                }
                switch(select_ta){
                    case 1:container.setListe(Filtre.filtreParTaille(container.tortue, 0, 100));
                        break;
                    case 2:container.setListe(Filtre.filtreParTaille(container.tortue, 100, 200));
                        break;
                    case 3:container.setListe(Filtre.filtreParTaille(container.tortue, 200, 300));
                        break;
                    case 4:container.setListe(Filtre.filtreParTaille(container.tortue, 300, Integer.MAX_VALUE));
                        break;
                }
                switch(select_pr){
                    case 1:container.setListe(Filtre.filtreParPrix(container.tortue, 0, 500));
                        break;
                    case 2:container.setListe(Filtre.filtreParPrix(container.tortue, 500, 1500));
                        break;
                    case 3:container.setListe(Filtre.filtreParPrix(container.tortue, 15000, 3000));
                        break;
                    case 4:container.setListe(Filtre.filtreParPrix(container.tortue, 3000, Integer.MAX_VALUE));
                        break;
                }
                switch (select_sexe){
                    case 1:container.setListe(Filtre.filtreParSexe(container.tortue, "M"));
                        break;
                    case 2:container.setListe(Filtre.filtreParSexe(container.tortue, "F"));
                        break;
                }
                
                switch(select_age){
                    case 1:container.setListe(Filtre.filtreParAge(container.tortue, 0, 50));
                        break;
                    case 2:container.setListe(Filtre.filtreParAge(container.tortue, 50, 100));
                        break;
                    case 3:container.setListe(Filtre.filtreParAge(container.tortue, 100, 150));
                        break;
                    case 4:container.setListe(Filtre.filtreParAge(container.tortue, 150, 200));
                        break;
                    case 5:container.setListe(Filtre.filtreParAge(container.tortue, 200, Integer.MAX_VALUE));
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
        add(new JLabel("Age :"));
        add(box_age);
        add(button);
    }

}
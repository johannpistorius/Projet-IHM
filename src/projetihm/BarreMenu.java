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
public class BarreMenu extends JPanel {

    JComboBox box;
    JButton button;
    JTextField search;
    ;
    JButton search_b;
    PageVente container;

    /**
     * Constructeur
     *
     * @param pv la page principale
     */
    public BarreMenu(PageVente pv) {
        super();
        container = pv;
        init();
    }

    public final void init() {
        // setPreferredSize(new Dimension(100, 50));
        search = new JTextField(20);
        search_b = new JButton("Rechercher");
        search_b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (search.getText().isEmpty()) {
                    container.setListe(container.tortue);
                } else {
                    container.setListe(Recherche.chercheNom(container.getListe(), search.getText()));
                }
            }
        });
        box = new JComboBox();
        box.addItem("Tri par nom");
        box.addItem("Tri par Espece");
        box.addItem("Tri par Poids");
        box.addItem("Tri par Taille");
        box.addItem("Tri par Age");
        box.addItem("Tri par Sexe");
        box.addItem("Tri par Prix");
        button = new JButton(new AbstractAction("Trier") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String select = box.getSelectedItem().toString();
                switch (select) {
                    case "Tri par nom":
                        container.setListe(Tri.triParNom(container.getListe()));
                        break;
                    case "Tri par Espece":
                        container.setListe(Tri.triParEspece(container.getListe()));
                        break;
                    case "Tri par Poids":
                        container.setListe(Tri.triParPoids(container.getListe()));
                        break;
                    case "Tri par Taille":
                        container.setListe(Tri.triParTaille(container.getListe()));
                        break;
                    case "Tri par Sexe":
                        container.setListe(Tri.triParSexe(container.getListe()));
                        break;
                    case "Tri par Prix":
                        container.setListe(Tri.triParPrix(container.getListe()));
                        break;
                    case "Tri par Age":
                        container.setListe(Tri.triParAge(container.getListe()));
                        break;
                    default:
                        break;
                }
            }
        });
        add(new JLabel("Recherche :"));
        add(search);
        add(search_b);
        add(box);
        add(button);
    }

}

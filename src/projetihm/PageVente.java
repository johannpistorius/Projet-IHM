/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @authors BOURG Thomas, KOUSONSAVATH Sanlasun, PISTORIUS Johann
 */
public class PageVente extends JFrame {

    ArrayList<Tortue> tortue;
    ArrayList<Tortue> tortueSel;
    JPanel panel = new JPanel();

    /**
     * Constructeur
     */
    public PageVente() {
        super("Page Vente");
        init();
    }

    /**
     * Methode d'initialisation
     */
    public final void init() {
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(null);

        tortue = new ArrayList<>();
        tortue.add(new Tortue("tortue geante des Galapagos", "Mathilda",
                200, 422, 110, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Leonardo",
                150, 400, 120, "M", 1000, "images/Leonardo.jpg"));
        tortue.add(new Tortue("tortue luth", "Giovanni",
                50, 650, 213, "M", 5000, "images/Giovanni.jpg"));
        tortue.add(new Tortue("tortue verte", "Roberto",
                30, 130, 110, "M", 5000, "images/Roberto.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Alessandra",
                60, 90, 60, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue verte", "Bernardo",
                130, 520, 130, "M", 5000, "images/Roberto.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Carolina",
                220, 160, 220, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Donatella",
                17, 512, 17, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue verte", "Ernesto",
                93, 78, 93, "M", 5000, "images/Roberto.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Francesca",
                46, 364, 46, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Guendolina",
                322, 528, 322, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue verte", "Fabrizzio",
                61, 264, 61, "M", 5000, "images/Roberto.jpg"));
        tortue.add(new Tortue("tortue verte", "Igor",
                150, 148, 150, "M", 5000, "images/Roberto.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Luciana",
                59, 367, 59, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue verte", "Roberto",
                110, 291, 110, "M", 5000, "images/Lorenzo.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Olga",
                73, 372, 73, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Rebecca",
                91, 490, 91, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Tatiana",
                122, 167, 122, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue verte", "Prospero",
                80, 279, 80, "M", 5000, "images/Roberto.jpg"));
        tortue.add(new Tortue("tortue verte", "Valentino",
                36, 394, 36, "M", 5000, "images/Roberto.jpg"));
        tortueSel = tortue;
        majAffichage();
    }

    public void majAffichage() {
        panel.removeAll();
        panel.add(new Bandeau());
        ((Bandeau) panel.getComponent(0)).setBounds(0, 0, 1000, 200);
        panel.add(new BarreMenu(this));
        ((BarreMenu) panel.getComponent(1)).setBounds(0, 200, 1000, 50);
        panel.add(new FiltreVue(this));
        ((FiltreVue) panel.getComponent(2)).setBounds(0, 250, 200, 450);
        JPanel liste = new JPanel(new GridLayout(20, 1));
        Affichage.afficherListe(liste, tortueSel);
        panel.add(new JScrollPane(liste));
        ((JScrollPane) panel.getComponent(3)).setBounds(200, 250, 780, 410);
        setContentPane(panel);
        setVisible(true);
    }

    public ArrayList<Tortue> getListe() {
        return tortueSel;
    }

    public void setListe(ArrayList<Tortue> l) {
        tortueSel = l;
        majAffichage();
    }

}

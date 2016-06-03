/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.util.ArrayList;
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
        setSize(800, 1000);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tortue = new ArrayList<>();
        tortue.add(new Tortue("tortue geante des Galapagos", "Mathilda",
                200, 422, 110, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Leonardo",
                150, 400, 120, "M", 1000, "images/Leonardo.jpg"));
        tortue.add(new Tortue("tortue luth", "Giovanni",
                50, 650, 213, "M", 5000, "images/Giovanni.jpg"));
        tortue.add(new Tortue("tortue verte", "Roberto",
                30, 130, 110, "M", 5000, "images/Roberto.jpg"));
        tortue.add(new Tortue("e", "e",
                200, 422, 110, "F", 1000, "images/Mathilda.jpg"));
        tortue.add(new Tortue("r", "r",
                200, 422, 110, "F", 1000, "images/Mathilda.jpg"));
        tortueSel = tortue;
        majAffichage();
    }
    
    public void majAffichage(){
        panel.removeAll();
        panel.add(new BarreMenu(this));
        Affichage.afficherListe(panel, tortueSel);

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

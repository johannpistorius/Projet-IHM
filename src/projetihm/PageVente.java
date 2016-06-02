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
        tortue.add(new Tortue("tortue geante des Galapagos", "Leonardo", 150, 400, 120, "M", 1000,"images/Leonardo.jpg"));
        tortue.add(new Tortue("tortue geante des Galapagos", "Mathilda", 200, 422, 110, "F", 1000,"images/Mathilda.jpg"));
        
        Affichage.afficherListe(panel, tortue);
        
        setContentPane(panel);
        setVisible(true);
    }
}

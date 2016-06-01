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
 * @author p1511158
 */
public class PageVente extends JFrame {

    ArrayList<Tortue> tortue;
    ArrayList<JPanel> panes;
    JPanel panel = new JPanel();

    public PageVente() {
        super("Page Vente");
        init();
        setContentPane(panel);
        setVisible(true);
    }

    public final void init() {
        setSize(800, 1000);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tortue = new ArrayList<>();
        tortue.add(new Tortue("tortue geante des Galapagos", "Leonardo", 150, 400, 120, "M", 1000));
        tortue.add(new Tortue("tortue geante des Galapagos", "Mathilda", 200, 422, 110, "F", 1000));

        panes = new ArrayList<>();
        for (Tortue t : tortue) {
            panes.add(t.toPanel());
        }
        for (JPanel p : panes) {
            panel.add(p);
        }
    }
}

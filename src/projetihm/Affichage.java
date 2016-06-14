/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;

/**
 *
 * @authors BOURG Thomas, KOUSONSAVATH Sanlasun, PISTORIUS Johann, GIRARD Mihajlo
 */
public class Affichage {
    /**
     * Constructeur
     */
    public Affichage() {
    }
    /**
     * Gere l'affichage des tortues
     * @param p_dest JPanel
     * @param l list de tortue
     */
    public static void afficherListe(JPanel p_dest, List<Tortue> l){
        List <JPanel> panes = new ArrayList<>();
        l.stream().forEach((t) -> {
            panes.add(t.toPanel());
        });
        panes.stream().forEach((p) -> {
            p_dest.add(p);
        });
        if(l.isEmpty()){
            p_dest.add(new JLabel("Aucune tortue ne correspond à vos critères."));
        }
    }
}

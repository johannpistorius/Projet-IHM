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
 * @authors BOURG Thomas, KOUSONSAVATH Sanlasun, PISTORIUS Johann
 */
public class Affichage {

    public Affichage() {
    }
    
    public static void afficherListe(JPanel p_dest, List<Tortue> l){
        List <JPanel> panes = new ArrayList<>();
        l.stream().forEach((t) -> {
            panes.add(t.toPanel());
        });
        panes.stream().forEach((p) -> {
            p_dest.add(p);
        });
    }
}

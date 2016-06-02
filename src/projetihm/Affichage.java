/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author tbour_000
 */
public class Affichage {

    public Affichage() {
    }
    
    public static void afficherListe(JPanel p_dest, List<Tortue> l){
        
        List <JPanel> panes = new ArrayList<>();
        for (Tortue t : l) {
            panes.add(t.toPanel());
        }
        for (JPanel p : panes) {
            p_dest.add(p);
        }
    }
}

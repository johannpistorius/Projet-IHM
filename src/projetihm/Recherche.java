/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.util.*;

/**
 *
 * @authors BOURG Thomas, KOUSONSAVATH Sanlasun, PISTORIUS Johann
 */
public class Recherche {
    public static ArrayList<Tortue> chercheNom(ArrayList<Tortue> l, String s){
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((t) -> (t.nom.toLowerCase().contains(s.toLowerCase()))).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }
}

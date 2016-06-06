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
public class Filtre {

    public static ArrayList<Tortue> filtreParPoids(List<Tortue> l, int b1, int b2) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((t) -> (b1 < t.poids && t.poids < b2)).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }

    public static ArrayList<Tortue> filtreParTaille(List<Tortue> l, int b1, int b2) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((t) -> (b1 < t.taille && t.taille < b2)).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }

    public static ArrayList<Tortue> filtreParPrix(List<Tortue> l, int b1, int b2) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((t) -> (b1 < t.prix && t.prix < b2)).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }
    
    public static ArrayList<Tortue> filtreParSexe(List<Tortue> l, String s) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((Tortue t) -> (s.equals(t.sexe))).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }
    
    public static ArrayList<Tortue> filtreParAge(List<Tortue> l, int b1, int b2) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((t) -> (b1 < t.age && t.age < b2)).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }
}

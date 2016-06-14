/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.util.*;

/**
 *
 * @authors BOURG Thomas, KOUSONSAVATH Sanlasun, PISTORIUS Johann, GIRARD Mihajlo
 */
public class Filtre {
    /**
     * Filtre tortue par poids
     * @param l liste de tortue
     * @param b1 poids min
     * @param b2 poids max
     * @return liste de tortue
     */
    public static ArrayList<Tortue> filtreParPoids(List<Tortue> l, int b1, int b2) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((t) -> (b1 < t.poids && t.poids < b2)).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }
    /**
     * Filtre tortue par taille
     * @param l liste de tortue
     * @param b1 taille min
     * @param b2 taille max
     * @return liste de tortue
     */
    public static ArrayList<Tortue> filtreParTaille(List<Tortue> l, int b1, int b2) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((t) -> (b1 < t.taille && t.taille < b2)).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }
    /**
     * Filtre tortue par prix
     * @param l liste de tortue
     * @param b1 prix min
     * @param b2 prix max
     * @return liste de tortue
     */
    public static ArrayList<Tortue> filtreParPrix(List<Tortue> l, int b1, int b2) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((t) -> (b1 < t.prix && t.prix < b2)).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }
    /**
     * Filtre tortue par sexe
     * @param l liste de tortue
     * @param s sexe de tortue
     * @return liste de tortue
     */
    public static ArrayList<Tortue> filtreParSexe(List<Tortue> l, String s) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((Tortue t) -> (s.equals(t.sexe))).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }
    /**
     * Filtre tortue par age
     * @param l liste de tortue
     * @param b1 age min
     * @param b2 age max
     * @return liste de tortue
     */
    public static ArrayList<Tortue> filtreParAge(List<Tortue> l, int b1, int b2) {
        ArrayList<Tortue> gardee = new ArrayList<>();
        l.stream().filter((t) -> (b1 < t.age && t.age < b2)).forEach((t) -> {
            gardee.add(t);
        });
        return gardee;
    }
}

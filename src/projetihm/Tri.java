/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.util.*;

/**
 * Classe contenant des méthodes qui trie la liste affichée à l'écran
 * @authors BOURG Thomas, KOUSONSAVATH Sanlasun, PISTORIUS Johann, GIRARD Mihajlo
 */
public class Tri {
    /**
     * Filtre par nom
     * @param l liste de tortue
     * @return liste de tortue
     */
    public static ArrayList<Tortue> triParNom(List<Tortue> l) {
        Collections.sort(l, (Tortue t1, Tortue t2) -> t1.nom.compareTo(t2.nom));
        return (ArrayList<Tortue>) l;
    }
    /**
     * Filtre par age
     * @param l liste de tortue
     * @return liste de tortue
     */
    public static ArrayList<Tortue> triParAge(List<Tortue> l) {
        Collections.sort(l, (Tortue t1, Tortue t2) -> t1.age - t2.age);
        return (ArrayList<Tortue>) l;
    }
    /**
     * Filtre par espece
     * @param l liste de tortue
     * @return liste de tortue
     */
    public static ArrayList<Tortue> triParEspece(List<Tortue> l) {
        Collections.sort(l, (Tortue t1, Tortue t2) -> t1.espece.compareTo(t2.espece));
        return (ArrayList<Tortue>) l;
    }
    /**
     * Filtre par poids
     * @param l liste de tortue
     * @return liste de tortue
     */
    public static ArrayList<Tortue> triParPoids(List<Tortue> l) {
        Collections.sort(l, (Tortue t1, Tortue t2) -> t1.poids - t2.poids);
        return (ArrayList<Tortue>) l;
    }
    /**
     * Filtre par taille
     * @param l liste de tortue
     * @return liste de tortue
     */
    public static ArrayList<Tortue> triParTaille(List<Tortue> l) {
        Collections.sort(l, (Object o1, Object o2) -> ((Tortue) o1).taille - ((Tortue) o2).taille);
        return (ArrayList<Tortue>) l;
    }
    /**
     * Filtre par sexe
     * @param l liste de tortue
     * @return liste de tortue
     */
    public static ArrayList<Tortue> triParSexe(List<Tortue> l) {
        Collections.sort(l, (Tortue t1, Tortue t2) -> t1.sexe.compareTo(t2.sexe));
        return (ArrayList<Tortue>) l;
    }
    /**
     * Filtre par prix
     * @param l liste de tortue
     * @return liste de tortue
     */
    public static ArrayList<Tortue> triParPrix(List<Tortue> l) {
        Collections.sort(l, (Tortue t1, Tortue t2) -> t1.prix - t2.prix);
        return (ArrayList<Tortue>) l;
    }
}

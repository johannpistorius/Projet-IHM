/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.util.*;

/**
 *
 * @author tbour_000
 */
public class Tri {
    public static ArrayList<Tortue> triParNom(List<Tortue> l){
        Collections.sort(l, new Comparator<Tortue>() {
            @Override
            public int compare(Tortue t1, Tortue t2){
                return t1.nom.compareTo(t2.nom);
            }
        });
        return (ArrayList<Tortue>)l;
    }
}

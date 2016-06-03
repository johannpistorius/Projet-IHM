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
public class Tri {
    public static ArrayList<Tortue> triParNom(List<Tortue> l){
        Collections.sort(l, (Tortue t1, Tortue t2) -> t1.nom.compareTo(t2.nom));
        return (ArrayList<Tortue>)l;
    }
    
    public static ArrayList<Tortue> triParEspece(List<Tortue> l){
        Collections.sort(l, (Tortue t1, Tortue t2) -> t1.espece.compareTo(t2.espece));
        return (ArrayList<Tortue>)l;
    }
}

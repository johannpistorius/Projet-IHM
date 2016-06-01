/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

/**
 *
 * @author p1511158
 */
public class Tortue {
    String espece;
    String nom;
    int age;
    int poids;
    int taille;
    String sexe;
    int prix;
    public Tortue(String e, String n, int a, int po, int t, String s, int pr)
    {
        this.espece=e;
        this.nom=n;
        this.age=a;
        this.poids=po;
        this.taille=t;
        this.sexe=s;
        this.prix=pr;
    }
    
    @Override
    public String toString()
    {
        return("Nom: "+nom+" Espece: "+espece+" Age :"+age+"ans Poids: "+poids+"kg Taille: "+taille+" Sexe: "+sexe+" Prix: "+prix+"$");
    }
}

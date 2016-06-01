/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

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

    public Tortue(String e, String n, int a, int po, int t, String s, int pr) {
        this.espece = e;
        this.nom = n;
        this.age = a;
        this.poids = po;
        this.taille = t;
        this.sexe = s;
        this.prix = pr;
    }

    public JPanel toPanel() {
        JPanel rep;
        rep = new JPanel();
        rep.setPreferredSize(new Dimension(600, 125));
        rep.setLayout(new GridLayout(7, 1));
        rep.add(new JLabel("Nom: " + nom));
        rep.add(new JLabel("Espece: " + espece));
        rep.add(new JLabel("Age :" + age + "ans"));
        rep.add(new JLabel("Poids: " + poids + "kg"));
        rep.add(new JLabel("Taille: " + taille));
        rep.add(new JLabel("Sexe: " + sexe));
        rep.add(new JLabel("Prix: " + prix + "$"));
        rep.setBorder(new LineBorder(Color.GRAY, 1));
        return rep;
    }
}

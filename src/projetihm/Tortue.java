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
 * @authors BOURG Thomas, KOUSONSAVATH Sanlasun, PISTORIUS Johann
 */
public class Tortue extends JPanel{

    String espece;
    String nom;
    int age;
    int poids;
    int taille;
    String sexe;
    int prix;
    String imgPath;

    public Tortue(String es, String n, int a, int po, int t, String s, int pr, String ip) {
        this.espece = es;
        this.nom = n;
        this.age = a;
        this.poids = po;
        this.taille = t;
        this.sexe = s;
        this.prix = pr;
        this.imgPath = ip;
    }

    public JPanel toPanel() {
        JPanel rep;
        rep = new JPanel();
        rep.setPreferredSize(new Dimension(600, 125));
        rep.setLayout(new GridLayout(3, 1));
        
        rep.add(new JLabel(createImageIcon(imgPath)));
        
        rep.add(new JLabel("Nom: " + nom));
        rep.add(new JLabel("Espece: " + espece));
        rep.add(new JLabel("Age :" + age + "ans"));
        rep.add(new JLabel("Poids: " + poids + "kg"));
        rep.add(new JLabel("Taille: " + taille + "cm"));
        rep.add(new JLabel("Sexe: " + sexe));
        rep.add(new JLabel("Prix: " + prix + "$"));
        rep.setBorder(new LineBorder(Color.GRAY, 1));
        return rep;
    }
    protected ImageIcon createImageIcon(String path) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL);
    } 
    else{
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}
}

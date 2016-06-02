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
        rep.setPreferredSize(new Dimension(600, 130));
        JPanel img;
        img = new JPanel();
        img.add(new JLabel(createImageIcon(imgPath)));
        JPanel txt;
        txt = new JPanel();
        txt.setLayout(new GridLayout(7, 1));
        
        txt.add(new JLabel("Nom: " + nom));
        txt.add(new JLabel("Espece: " + espece));
        txt.add(new JLabel("Age :" + age + "ans"));
        txt.add(new JLabel("Poids: " + poids + "kg"));
        txt.add(new JLabel("Taille: " + taille + "cm"));
        txt.add(new JLabel("Sexe: " + sexe));
        txt.add(new JLabel("Prix: " + prix + "$"));
        rep.add(img);
        rep.add(txt);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author tbour_000
 */
public class Bandeau extends JPanel {

    /**
     * Constructeur
     */
    public Bandeau() {
        super();
        init();
    }
    
    public void init(){
        setPreferredSize(new Dimension(1000, 100));
        add(new JLabel(new ImageIcon(getClass().getResource("images/tortuga.png"))));
        add(new JLabel("Tortuga store"));
        ((JLabel) getComponent(1)).setFont(new Font("perso", Font.ITALIC + Font.BOLD, 80));
    }

}

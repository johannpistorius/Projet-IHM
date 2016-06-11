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
public class PageFacturation extends JFrame {

    JPanel pane = new JPanel();
    
    /**
     * Constructeur
     */
    public PageFacturation() {
        super("Page Facturation");
        init();
        setVisible(true);
    }

    /**
     * Methode d'initialisation
     */
    public final void init() {
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pane.setLayout(null);
        pane.add(new Bandeau());
        ((Bandeau)pane.getComponent(0)).setBounds(0, 0, 1000, 200);
        pane.add(new JLabel("Paiement"));
        ((JLabel)pane.getComponent(1)).setFont(new Font("perso", Font.BOLD, 35));
        ((JLabel)pane.getComponent(1)).setBounds(450, 200, ((JLabel)pane.getComponent(1)).getPreferredSize().width, ((JLabel)pane.getComponent(1)).getPreferredSize().height);
        pane.add(new JLabel("Civilité :"));
        ((JLabel)pane.getComponent(2)).setBounds(300, 270, ((JLabel)pane.getComponent(2)).getPreferredSize().width, ((JLabel)pane.getComponent(2)).getPreferredSize().height);
        pane.add(new JComboBox(new String[]{"M", "F"}));
        ((JComboBox)pane.getComponent(3)).setBounds(600, 270, ((JComboBox)pane.getComponent(3)).getPreferredSize().width, ((JComboBox)pane.getComponent(3)).getPreferredSize().height);
        pane.add(new JLabel("Prénom :"));
        ((JLabel)pane.getComponent(4)).setBounds(300, 310, ((JLabel)pane.getComponent(4)).getPreferredSize().width, ((JLabel)pane.getComponent(4)).getPreferredSize().height);
        pane.add(new JTextField(20));
        ((JTextField)pane.getComponent(5)).setBounds(600, 310, ((JTextField)pane.getComponent(5)).getPreferredSize().width, ((JTextField)pane.getComponent(5)).getPreferredSize().height);
        pane.add(new JLabel("Nom :"));
        ((JLabel)pane.getComponent(6)).setBounds(300, 350, ((JLabel)pane.getComponent(6)).getPreferredSize().width, ((JLabel)pane.getComponent(6)).getPreferredSize().height);
        pane.add(new JTextField(20));
        ((JTextField)pane.getComponent(7)).setBounds(600, 350, ((JTextField)pane.getComponent(7)).getPreferredSize().width, ((JTextField)pane.getComponent(7)).getPreferredSize().height);
        pane.add(new JLabel("Adresse :"));
        ((JLabel)pane.getComponent(8)).setBounds(300, 390, ((JLabel)pane.getComponent(8)).getPreferredSize().width, ((JLabel)pane.getComponent(8)).getPreferredSize().height);
        pane.add(new JTextField(20));
        ((JTextField)pane.getComponent(9)).setBounds(600, 390, ((JTextField)pane.getComponent(9)).getPreferredSize().width, ((JTextField)pane.getComponent(9)).getPreferredSize().height);
        pane.add(new JTextField(20));
        ((JTextField)pane.getComponent(10)).setBounds(600, 410, ((JTextField)pane.getComponent(10)).getPreferredSize().width, ((JTextField)pane.getComponent(10)).getPreferredSize().height);
        pane.add(new JLabel("Code postal :"));
        ((JLabel)pane.getComponent(11)).setBounds(300, 450, ((JLabel)pane.getComponent(11)).getPreferredSize().width, ((JLabel)pane.getComponent(11)).getPreferredSize().height);
        pane.add(new JTextField(20));
        ((JTextField)pane.getComponent(12)).setBounds(600, 450, ((JTextField)pane.getComponent(12)).getPreferredSize().width, ((JTextField)pane.getComponent(12)).getPreferredSize().height);
        pane.add(new JLabel("Pays :"));
        ((JLabel)pane.getComponent(13)).setBounds(300, 490, ((JLabel)pane.getComponent(13)).getPreferredSize().width, ((JLabel)pane.getComponent(13)).getPreferredSize().height);
        pane.add(new JTextField(20));
        ((JTextField)pane.getComponent(14)).setBounds(600, 490, ((JTextField)pane.getComponent(14)).getPreferredSize().width, ((JTextField)pane.getComponent(14)).getPreferredSize().height);
        pane.add(new JLabel("Numéro de carte bleue :"));
        ((JLabel)pane.getComponent(15)).setBounds(300, 530, ((JLabel)pane.getComponent(15)).getPreferredSize().width, ((JLabel)pane.getComponent(15)).getPreferredSize().height);
        pane.add(new JTextField(20));
        ((JTextField)pane.getComponent(16)).setBounds(600, 530, ((JTextField)pane.getComponent(16)).getPreferredSize().width, ((JTextField)pane.getComponent(16)).getPreferredSize().height);
        pane.add(new JButton("Payer"));
        ((JButton)pane.getComponent(17)).setBounds(700, 600, ((JButton)pane.getComponent(17)).getPreferredSize().width, ((JButton)pane.getComponent(17)).getPreferredSize().height);
        setContentPane(pane);
        
    }

}

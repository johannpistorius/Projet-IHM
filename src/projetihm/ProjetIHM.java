/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

/**
 *
 * @authors BOURG Thomas, KOUSONSAVATH Sanlasun, PISTORIUS Johann, GIRARD Mihajlo
 */
public class ProjetIHM {

    static PageVente pv;
    static PageFacturation pf;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pv = new PageVente();
    }
    /**
     * Page Facturaction
     */
    public static void facturation(){
        pv.dispose();
        pf = new PageFacturation();
        
    }

}

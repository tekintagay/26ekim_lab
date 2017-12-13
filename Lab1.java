/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 *
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arac a1 = new Arac();
        a1.ekranaYazdir();
        
        Arac a2 = new Arac("Ticari", 2012);
        a2.ekranaYazdir();
        
        Otomobil o1 = new Otomobil();
        o1.ekranaYazdir();
        
        Otomobil o2 = new Otomobil("Ford", 1500, 4);
        o2.ekranaYazdir();
        
        BMW b1 = new BMW();
        b1.ekranaYazdir();
        
        BMW b2 = new BMW("Siyah", 2017, 250000);
        b2.ekranaYazdir();
    }
}

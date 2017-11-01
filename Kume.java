/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kume;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Exper
 */
public class Kume {
    int n;
    private ArrayList<Integer> elemanlar;
    /**
     * @param args the command line arguments
     */
    public Kume(){// parametresiz constructor 
        elemanlar = new ArrayList<Integer>();
    }
    public Kume(int[] a){// a dizisinin elemanlarindan olusan kume
        elemanlar = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            elemanlar.add(a[i]);
        }
    }
    public Kume(Kume a){ //copy constructor
        this.elemanlar = new ArrayList<Integer>(a.elemanlar);
    }
    public void ekle(int a){ //kumeye yeni eleman ekleme
        elemanlar.add(a);
    }
    public void yazdir(){ //kume icerigini yazdırma
        if(elemanlar.size() > 0){
            for (int i = 0; i < elemanlar.size() - 1; i++) 
                System.out.print(elemanlar.get(i) + ",");
            System.out.println(elemanlar.get(elemanlar.size() - 1));
        }
    }
    public boolean denk(Kume a){ //cagrici obje ile parametre objenin denk kume olup olmadigini test eder
        return (this.elemanlar.size() == a.elemanlar.size());
    }
    
    public boolean esit(Kume a){ //cagrici obje ile parametre objenin esit kume olup olmadigini test eder
        if(this.denk(a)){
            Collections.sort(this.elemanlar);
            Collections.sort(a.elemanlar);
            for (int i = 0; i < this.elemanlar.size(); i++) 
                if(this.elemanlar.get(i) != a.elemanlar.get(i))
                    return false;
            return true;
        }
        return false;
    }
    
    public Kume birlesim(Kume a){ // cagrici obje ile parametre objenin bilesiminden olusan kumeyi dondurur
        Kume sonuc = new Kume();
        for (int i = 0; i < this.elemanlar.size(); i++)
            sonuc.elemanlar.add(this.elemanlar.get(i));
        
        for (int i = 0; i < a.elemanlar.size(); i++)//varolan elemanları eklemiyoruz
            if(sonuc.elemanlar.indexOf(a.elemanlar.get(i)) == -1)
                    sonuc.ekle(a.elemanlar.get(i));
        return sonuc;
    }
    
    public Kume kesisim(Kume a){
        Kume sonuc = new Kume();
        for (int i = 0; i < a.elemanlar.size(); i++)//varolan elemanları eklemiyoruz
            if(this.elemanlar.indexOf(a.elemanlar.get(i)) != -1)
                    sonuc.ekle(a.elemanlar.get(i));
        return sonuc;
    }
    
    public Kume fark(Kume a){
        Kume sonuc = new Kume();
        for (int i = 0; i < a.elemanlar.size(); i++)//varolan elemanları eklemiyoruz
            if(this.elemanlar.indexOf(a.elemanlar.get(i)) == -1)
                    sonuc.ekle(a.elemanlar.get(i));
        return sonuc;
    }
        
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Kume km = new Kume();
        km.ekle(10);
        km.ekle(11);
        km.ekle(2);
        System.out.print("km = {");
        km.yazdir();
        System.out.println("}");
        int[] a = {1,2,3,4,5,6};
        Kume km2 = new Kume(a);
        System.out.print("km2 = {");
        km2.yazdir();
        System.out.println("}");
        Kume km3 = new Kume(a);
        System.out.print("km3 = {");
        km3.yazdir();
        System.out.println("}");
        if (km.denk(km2))
            System.out.println("km ve km2 kumeleri denk.");
        else
            System.out.println("km ve km2 kumeleri denk degil.");
        if (km2.esit(km3))
            System.out.println("km2 ve km3 kumeleri esit.");
        else
            System.out.println("km2 ve km3 kumeleri esit degil.");
        Kume sn = km.birlesim(km2);
        System.out.print("km ve km2 birlesimi = {");
        sn.yazdir();
        System.out.println("}");
        Kume sn2 = km.kesisim(km2);
        System.out.print("km ve km2 kesisimi = {");
        sn2.yazdir();
        System.out.println("}");
        Kume sn3 = km.fark(km2);
        System.out.print("km ve km2 farki = [");
        sn3.yazdir();
        System.out.println("}");
       /*
        for(int i = 0; i < sonuc.size(); i++){
            System.out.print("{");
            sonuc.get(i).yazdir();
            System.out.println("}");
        }*/
    }   
}

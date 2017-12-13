/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * Samet Diri  
 */
public class BMW extends Otomobil {
    private int model, fiyat;
    private String renk;
    
    public BMW(){
        super();
        this.renk = "Kırmızı";
        this.model = 2017;
        this.fiyat = 100000;
    }
    public BMW(String renk, int model, int fiyat){
        super();
        this.renk = renk;
        this.model = model;
        this.fiyat = fiyat;
    }
    public String getRenk(){
        return this.renk;
    }
    public void setRenk(String marka){
        this.renk = renk;
    }
    public int getModel(){
        return this.model;
    }
    public void setModel(int model){
        this.model = model;
    }
    public int getFiyat(){
        return this.fiyat;
    }
    public void setFiyat(int fiyat){
        this.fiyat = fiyat;
    }
    public void ekranaYazdir(){
        System.out.println("ARACIN RENGİ: " + this.renk + " MODELİ: " + this.model + " FİYATI: " + this.fiyat);
    }
}

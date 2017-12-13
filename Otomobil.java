/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * 
 */
public class Otomobil extends Arac {
    private String marka;
    private int agirlik, tekerSayisi;
    public Otomobil(){
        super();
        this.marka = "BMW";
        this.agirlik = 1000;
        this.tekerSayisi = 4;
    }
    public Otomobil(String marka, int agirlik, int tekerSayisi){
        super();
        this.marka = marka;
        this.agirlik = agirlik;
        this.tekerSayisi = tekerSayisi;
    }
    public String getMarka(){
        return this.marka;
    }
    public void setMarka(String marka){
        this.marka = marka;
    }
    public int getAgirlik(){
        return this.agirlik;
    }
    public void setAgirlik(int agirlik){
        this.agirlik = agirlik;
    }
    public int getTekerSayisi(){
        return this.tekerSayisi;
    }
    public void setTekerSayisi(int tekerSayisi){
        this.tekerSayisi = tekerSayisi;
    }
    public void ekranaYazdir(){
        System.out.println("ARACIN MARKASI: " + this.marka + " AĞIRLIĞI: " + this.agirlik + " TEKERLEK SAYISI: " + this.tekerSayisi);
    }
}

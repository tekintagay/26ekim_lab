/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * 
 */
public class Arac {
    private String sinif;
    private int yapimYili;
    public Arac(){
        this.sinif = "Binek";
        this.yapimYili = 2017;
    }
    public Arac(String sinif, int yapimYili){
        this.sinif = sinif;
        this.yapimYili = yapimYili;
    }
    public String getSinif(){
        return this.sinif;
    }
    public int getYapimYili(){
        return this.yapimYili;
    }
    public void setSinif(String sinif){
        this.sinif = sinif;
    }
    public void setYapimYili(int yapimYili){
        this.yapimYili = yapimYili;
    }
    public void ekranaYazdir(){
        System.out.println("ARACIN SINIFI: " + this.sinif + " YAPIM YILI: " + this.yapimYili);
    }
}

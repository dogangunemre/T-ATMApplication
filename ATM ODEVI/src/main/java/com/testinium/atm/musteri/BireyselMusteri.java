package com.testinium.atm.musteri;

public class BireyselMusteri extends Musteri{

    private String evAdresi;

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    public BireyselMusteri(int tcKimlikNo, String ad, String soyad, double hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, ad, soyad, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }
}


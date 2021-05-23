package com.testinium.atm.musteri;

public class KurumsalMusteri extends Musteri{

private String sirketAd;

    public String getSirketAd() {
        return sirketAd;
    }

    public void setSirketAd(String sirketAd) {
        this.sirketAd = sirketAd;
    }


    public KurumsalMusteri(int tcKimlikNo, String ad, String soyad, double hesapBakiyesi, String sirketAd) {
        super(tcKimlikNo, ad, soyad, hesapBakiyesi);
        this.sirketAd = sirketAd;
    }
}

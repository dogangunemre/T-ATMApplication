package com.testinium.atm.musteriBilgileri;

import com.testinium.atm.islemler.IslemSorgulama;
import com.testinium.atm.musteri.BireyselMusteri;
import com.testinium.atm.musteri.KurumsalMusteri;
import com.testinium.atm.musteri.Musteri;
import com.testinium.atm.tur.MusteriTur;

import java.util.HashMap;
import java.util.Map;

public class MusteriBilgi {
    public Map<String, Musteri> musteriEkle(){
        Map<String, Musteri> musteriMap= new HashMap<>();
        musteriMap.put("10",new Musteri(10,"Ali","Dal",12.5d));
        musteriMap.put("20",new Musteri(20,"Veli","Polat",24.6d));
        musteriMap.put("30",new Musteri(30,"Ahmet","Yilmaz",45.4d));
        musteriMap.put("40",new Musteri(40,"Ayse","Yildirim",56.7d));
        musteriMap.put("50",new Musteri(50,"Mehmet","Dogan",43.8d));
        return musteriMap;
    }
    public Map<String, KurumsalMusteri> kurumsalMusteriEkle(){
        Map<String, KurumsalMusteri> musteriMap= new HashMap<>();
        musteriMap.put("11",new KurumsalMusteri(11,"Ali","Dal",12.5d,"DGNHolding"));
        musteriMap.put("21",new KurumsalMusteri(21,"Veli","Polat",24.6d,"DGNHolding"));
        musteriMap.put("31",new KurumsalMusteri(31,"Ahmet","Yilmaz",45.4d,"DGNHolding"));
        musteriMap.put("41",new KurumsalMusteri(41,"Ayse","Yildirim",56.7d,"DGNHolding"));
        musteriMap.put("51",new KurumsalMusteri(51,"Mehmet","Dogan",43.8d,"DGNHolding"));
        return musteriMap;
    }
    public Map<String, BireyselMusteri> bireyselMusteriEkle(){
        Map<String, BireyselMusteri> musteriMap= new HashMap<>();
        musteriMap.put("12",new BireyselMusteri(12,"Ali","Dal",12.5d,"Istanbul"));
        musteriMap.put("22",new BireyselMusteri(22,"Veli","Polat",24.6d,"Istanbul"));
        musteriMap.put("32",new BireyselMusteri(32,"Ahmet","Yilmaz",45.4d,"Istanbul"));
        musteriMap.put("42",new BireyselMusteri(42,"Ayse","Yildirim",56.7d,"Istanbul"));
        musteriMap.put("52",new BireyselMusteri(52,"Mehmet","Dogan",43.8d,"Istanbul"));
        return musteriMap;
    }

    public void musteriBilgiYazdir(String bankaMusteriNo, MusteriTur tur){

        if (tur.equals(tur.KURUMSALMUSTERI)){
            kurumsalMusteriBilgiYazdir(bankaMusteriNo);
        }
        else if (tur.equals(tur.BIREYSELMUSTERI)){
            bireyselMusteriBilgiYazdir(bankaMusteriNo);
        }
    }
    public void kurumsalMusteriBilgiYazdir(String bankaMusteriNo){
        System.out.println( bankaMusteriNo + " numaralı musteriye ait bilgiler Listeleniyor...");
        KurumsalMusteri musteri;
        try {
             musteri=kurumsalMusteriEkle().get(bankaMusteriNo);

            System.out.println("Sirket adi :" + musteri.getSirketAd());
            System.out.println("Adı: " + musteri.getAd());
            System.out.println("Soyadı: " + musteri.getSoyad());
            System.out.println("Tc Kimlik Numarası: " + musteri.getTcKimlikNo());
            System.out.println("Hesap Bakiyesi: " + musteri.getHesapBakiyesi());

            IslemSorgulama islemSorgulama = new IslemSorgulama();
            islemSorgulama.Sorgulama(musteri);

        }catch (Exception e){
            System.out.println("Bu hesap numarasına ait bir musteri bulunmamaktadır.");
        }


    }
    public void bireyselMusteriBilgiYazdir(String bankaMusteriNo){

        System.out.println( bankaMusteriNo + " numaralı musteriye ait bilgiler Listeleniyor...");
        try {
            BireyselMusteri musteri=bireyselMusteriEkle().get(bankaMusteriNo);

            System.out.println("Ev adresi :" + musteri.getEvAdresi());
            System.out.println("Adı: " + musteri.getAd());
            System.out.println("Soyadı: " + musteri.getSoyad());
            System.out.println("Tc Kimlik Numarası: " + musteri.getTcKimlikNo());
            System.out.println("Hesap Bakiyesi: " + musteri.getHesapBakiyesi());

            IslemSorgulama islemSorgulama = new IslemSorgulama();
            islemSorgulama.Sorgulama(musteri);

        }catch (Exception e){
            System.out.println("Bu hesap numarasına ait bir musteri bulunmamaktadır.");
        }


    }

}

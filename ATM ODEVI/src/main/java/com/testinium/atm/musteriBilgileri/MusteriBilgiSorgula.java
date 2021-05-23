package com.testinium.atm.musteriBilgileri;

import com.testinium.atm.tur.MusteriTur;

import java.util.Locale;
import java.util.Scanner;

public class MusteriBilgiSorgula {
    public  String bankaHesapNo;
    public String musteriTur;

    MusteriBilgi musteriBilgi = new MusteriBilgi();

    public void scanner(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Musteri Kurumsal ise K'ye basınız, Bireyselise B'ye basınız.");
        musteriTur = myObj.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Musteri Hesap numaranın giriniz.");
        bankaHesapNo = myObj.nextLine();

        if (musteriTur.equals("k")){
            musteriBilgi.musteriBilgiYazdir(bankaHesapNo, MusteriTur.KURUMSALMUSTERI);

        }
        else if (musteriTur.equals("b")){
            musteriBilgi.musteriBilgiYazdir(bankaHesapNo, MusteriTur.BIREYSELMUSTERI);
        }
        else{
            System.out.println("girmiş olduğunuz bilgiler yanlış,Lütfen Tekrar Deneyiniz");
            this.scanner();
        }


    }
}

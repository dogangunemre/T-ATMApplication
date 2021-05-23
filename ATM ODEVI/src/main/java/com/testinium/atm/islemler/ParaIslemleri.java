package com.testinium.atm.islemler;

import com.testinium.atm.musteri.Musteri;

import java.util.Locale;
import java.util.Scanner;

public class ParaIslemleri {

    public static void paraYatirma(Musteri musteri){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Yatırmak istediğiniz tutarı yazınız.");
        Double tutar = myObj.nextDouble();
        Double bakiye=musteri.getHesapBakiyesi();

        tutar=tutar+bakiye;

        System.out.println(" Sayın "+musteri.getAd()+" hesabınızdaki yeni tutar: " +tutar);
    }
    public static void paraCekme(Musteri musteri){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Çekmek istediğiniz tutarı yazınız.");
        Double tutar = myObj.nextDouble();
        Double bakiye=musteri.getHesapBakiyesi();
       if (bakiye>tutar){
           bakiye=bakiye-tutar;

           System.out.println(" Sayın "+musteri.getAd()+" hesabınızdaki yeni tutar: " +bakiye);
       }
           else{
           System.out.println(" Yetersiz bakiye, Bakiyeniz:  "+bakiye);
           System.out.println("Tekrar denemek için T'ye basınız,Herhangi bir tuşa basınız ");
           Scanner myObj2 = new Scanner(System.in);

           String tekrar = myObj2.nextLine().toLowerCase(Locale.ROOT);
           if (tekrar.equals("t")){
               paraCekme(musteri);
           }
           else {
               System.out.println("Son");

           }
       }



    }
}

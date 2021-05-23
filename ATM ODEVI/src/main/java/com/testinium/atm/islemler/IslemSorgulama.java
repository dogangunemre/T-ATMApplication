package com.testinium.atm.islemler;

import com.testinium.atm.musteri.Musteri;
import com.testinium.atm.tur.MusteriTur;

import java.util.Locale;
import java.util.Scanner;

public class IslemSorgulama {

    public int islem;

    public void Sorgulama(Musteri musteri){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Para yatırma için 1'e ,Para cekmek için 2'ye basınız.");
        islem = myObj.nextInt();


        if (islem==1){
         ParaIslemleri.paraYatirma(musteri);
        }
        else if (islem==2){
            ParaIslemleri.paraCekme(musteri);
        }
        else{
            System.out.println("girmiş olduğunuz işlem yanlış,Lütfen Tekrar Deneyiniz");
            this.Sorgulama(musteri);
        }
    }

}

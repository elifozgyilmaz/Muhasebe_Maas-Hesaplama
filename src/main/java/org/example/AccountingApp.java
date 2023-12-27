package org.example;

public class AccountingApp {
    public static int maasHesapla(int calisilanGunSayisi) {
        int maas;
        int gunlukMaas = 100;

        if (calisilanGunSayisi > 25) {
            maas = (calisilanGunSayisi*gunlukMaas)+(calisilanGunSayisi - 25)*1000;
        } else {
            maas = calisilanGunSayisi * gunlukMaas;
        }
        return maas;
    }

    public static void main(String[] args) {
        int calisilanGunSayisi = 30;

        int maas = maasHesapla(calisilanGunSayisi);

        System.out.println("Personelin maaşı: " + maas + " TL");
    }
}
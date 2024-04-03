package com.company;

import java.util.*;

public class WhileZarSayisi {

    private static int sayi;

    public static void main(String[] args) {
//        int sayi;
//        int sayac = 0;
//        Scanner sc = new Scanner(System.in);
//        sayi = sc.nextInt();
//        for (int i = 1; i <= sayi; i++) {
//            if(i % 2 == 0)
//            {
//                sayac++;
//                System.out.println(i);
//            }
//        }
//        System.out.println(((Object) sayi).getClass().getName());
//
//
//        System.out.println("cift deger sayisi : " + sayac);
//    }

//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + i * j);
//            }
//        }

//        for (int i = 0; i <= 100 ; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i <= 5; i++) {
//
//            for (int j = 0; j <= 5; j++) {
//                System.out.print(" ");
//
//            }
//            System.out.println();
//        }


        // "Birden Başlayarak kullanıcının dışarıdan girdiği sayıya kadar olan tüm sayıların bir fazlasının toplamını ekrana  yazdıran algoritma"


//       Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(((n * (n + 1)) / 2) + n);


          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int toplam = 0;
        for (int i = 1; i < n; i++) {
            toplam += i;
        }
        System.out.println(toplam);
    }
}

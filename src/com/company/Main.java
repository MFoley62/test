package com.company;

import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        int sayi;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10 ; i++) {
            sayi = input.nextInt();
            if(sayi >= 0 && sayi <= 100)
            {
                if(sayi > max)
                {
                    max = sayi;
                }
                if(sayi < min)
                {
                    min = sayi;
                }

            }
        }
        System.out.println(" max : " + max);
        System.out.println(" min : " + min);

        }

        public void test11()
        {
            int calisma_saati;
            int saatlik_ücret = 10;
            int alinan_ücret;
            int calismaSabiti = 45;

            Scanner input = new Scanner(System.in);
            calisma_saati = input.nextInt();

            if(calisma_saati < calismaSabiti)
            {
                alinan_ücret = calisma_saati * saatlik_ücret;
                System.out.println("Alınan ücret  " + calismaSabiti + " < = " + alinan_ücret);
            }else
            {
                alinan_ücret = calismaSabiti * saatlik_ücret + (calisma_saati - calismaSabiti) * (saatlik_ücret * 2);
                System.out.println("alınan ücret  " + calismaSabiti + " > = " + alinan_ücret);
            }
        }

        public void test10()
        {
            for (int j = 10; j < 200; j++) {
                if((3*j+2) % 5 == 0)
                {
                    System.out.println(j);
                }
            }
        }

        public void test9()
        {
            int sayi;
            int toplam = 0;

            Scanner input = new Scanner(System.in);
            sayi = input.nextInt();

            for (int i = 1; i < sayi ; i++) {
                if(sayi % i == 0)
                {
                    toplam += i;
                }
            }
            if(toplam == sayi)
            {
                System.out.println(sayi + " Mükemmel sayidir");
            }
            else
            {
                System.out.println(sayi + " Mükemmel bir sayi değildir");
            }
        }

        public void test8()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();

            int kuvvet = 1;
            int carpim = 5;

            while (kuvvet <= sayi) {
                if (kuvvet == sayi) {
                    System.out.println(sayi + " sayısı 5'in kuvvetidir.");
                    break;
                }
                kuvvet *= carpim;
            }

            if (kuvvet != sayi) {
                System.out.println(sayi + " sayısı 5'in kuvveti değildir.");
            }
        }

        public void test7()
        {
            int a;
            int b;
            int c;
            int ort;

            Scanner sc = new Scanner(System.in);
            System.out.println("A sayısınız giriniz : ");
            a = sc.nextInt();
            System.out.println("B sayısınız giriniz : ");
            b = sc.nextInt();

            if (a > 50 && b > 50) {
                c = a + b;
                System.out.println("c sayısı : " + c);
                ort = (a + b) / 2;
                System.out.println("sayıların ortlaması : " + ort);

            } else {
                System.out.println("Bu sayılar uygun değildir.");
            }
        }

    public void test6(){
        int sayi;
        int ciftToplam = 0;
        int tekToplam = 0;
        double oran = 0f;

        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 5; i++) {
            sayi = sc.nextInt();
            if(sayi % 2 == 0)
            {
                ciftToplam += sayi;
            }
            else
            {
                tekToplam += sayi;
            }
        }
        oran = ciftToplam / tekToplam;
        System.out.println(oran);

    }


    public void test5()
    {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            int sayi = input.nextInt();
            if(sayi > 100)
            {
                System.out.println(sayi + "sayisi 100 den büyük");
            }else
            {
                System.out.println(sayi + " sayisi 100 den büyük değil");
            }
        }
    }

    public static void test4()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.print(sayi + " sayısının bölenleri: ");
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
            }
        }
    }


    public void test3()
    {
        int sayi = 1;
        int carpim = 0;

        while(sayi <= 10)
        {
            for (int i = 1; i < 10; i++) {
                carpim = sayi * i;
                System.out.println(carpim + " = " + i + " * " + sayi );
            }
            sayi++;
        }
    }


    public void test2()
    {
        int sayi= 100;
        int basamaksayi = 0;

        while(sayi > 0)
        {
            sayi /= 10;
            basamaksayi++;
        }

        System.out.println(basamaksayi);

    }

    public void test1()
    {
        int a = 2000000000;
        int b = 2;
        int carpim = 0;

        if(a < b )
        {
            for (int i = 0; i < a ; i++) {
                carpim +=b;
            }
        }

        if(b < a )
        {
            for (int i = 0; i < b ; i++) {
                carpim +=a;
            }
        }
        System.out.println(carpim);
    }
}

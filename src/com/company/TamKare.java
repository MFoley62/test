package com.company;

import java.util.Scanner;

public class TamKare {
    int sayi;

    public TamKare(int sayi){
        this.sayi = sayi;
    }

    public TamKare(){
    }

    public void TamKareKontrol()
    {
        int controlSayi;
        int sayac = 0;
        Scanner sc = new Scanner(System.in);
        controlSayi = sc.nextInt();
        if(controlSayi < 0)
        {
            System.out.print("Lütfen pozitif bir sayi giriniz : ");
            sc.next();
        } else if (controlSayi == 0) {
            System.out.print("Lütfen sıfırdan büyük bir sayi giriniz : ");
            sc.next();
        }
            while (!sc.hasNextInt())
            {
                System.out.print("Lütfen rakam giriniz : ");
                sc.next();
            }

        TamKare tk = new TamKare(controlSayi);


        for (int i = 2; i <= controlSayi ; i++) {
            if(controlSayi % 2 == 0)
            {
                break;
            }
            if(controlSayi % i == 0)
            {
                sayac++;
            }
        }
        if(sayac == 1)
        {
            System.out.println("Bu sayi asaldir.");
        }
        else
        {
            System.out.println("Bu Sayi Asal Değildir.");
        }
    }
}

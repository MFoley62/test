package com.company;

import java.io.File;
import java.io.IOException;

public class FileCreateExample {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if(file.exists())
        {
            System.out.println("Dosya zaten var.");
        }else {
            System.out.println("Böyle bir dosya yok.");
        }

        try {
            if(!file.exists())
            {
                file.createNewFile();
                System.out.println("Dosya oluşturuldu.");
            }
        }catch (IOException e)
        {
            throw  new IOException("DOSYA OLUSTURULAMADI!");
        }
        System.out.println("Dosya adı : " + file.getName());
    }
}

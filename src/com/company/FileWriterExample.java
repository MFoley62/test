package com.company;

import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
//        PrintWriter fw = new PrintWriter("NewFile.txt");
//        fw.print("A: a İlk metin");
//        fw.println();
//        fw.println("ikinci metin");
//        fw.println();
//        fw.println("üçüncü metin");
//        fw.flush();
//        fw.close();

        PrintWriter fw = new PrintWriter("NewFile2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("ilk");
        bw.write("ikinci");
        bw.close();

        FileReader fr = new FileReader("NewFile2.txt");
        BufferedReader br = new BufferedReader(fr);

        String data = null;
        String data1 = null;
        System.out.println("Ünlü yazılımcı Mert bey ");
        System.out.println("Tuncelinin gülü yakışıklı prens:D ");
        System.out.println("test" + br.readLine());
        while((data = br.readLine()) != null)
        {
            System.out.println(data);
        }
        br.close();
        fr.close();
        //Mert Bey

    }
}

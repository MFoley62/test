package com.company;

import java.util.ArrayList;
import java.util.List;

public class VarLeLe {

    public static void main(String[] args) {
        int tamsayiMax = Integer.MAX_VALUE/2;
        int tamsayiMin = Integer.MIN_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;


        ArrayList<String> liste = new ArrayList<>();
        liste.add(String.valueOf(tamsayiMax));
        liste.add(String.valueOf(tamsayiMin));
        liste.add(String.valueOf(byteMin));
        liste.add(String.valueOf(byteMax));

        liste.add(String.valueOf(shortMax));
        liste.add(String.valueOf(shortMin));
        liste.add(String.valueOf(floatMax));
        liste.add(String.valueOf(floatMin));

        liste.add(String.valueOf(doubleMax));
        liste.add(String.valueOf(String.format("%5.8f",doubleMax)));

        liste.add(String.valueOf(longMax));
        liste.add(String.valueOf(longMin));





        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }

}

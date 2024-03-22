package com.company;

import java.lang.reflect.Type;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int dollar = 5;
        float dollarF = dollar;
        long dollarL = dollar;

        float dollarFF = (float) dollar;
        double dollarDD = (double) dollar;


        System.out.println("Dollar int " + dollar);

        System.out.println("dollar Float  " + dollarF);
        System.out.println("dollar Long " + dollarL);


        System.out.println("dollar Float2  " + dollarFF);
        System.out.println("dollar Double  " + dollarDD);
    }
}

package com.company;

import java.lang.reflect.Type;

public class ArithmeticOperator {
    public int sum(int a, int b){
        return a+b;
    }

    public static int sum2(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        ArithmeticOperator a = new ArithmeticOperator();
        System.out.println(a.sum(2,3));
        System.out.println(sum2(2,3));




    }
}

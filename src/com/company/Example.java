package com.company;

public class Example {
    public String name;
    public String surname;
    public String country;

    public Example(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.country = "Türkiye";
    }

    public Example(String surname) {
        this.surname = surname;
        this.country = "Türkiye";
    }

    public Example() {
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.name = "Mert";
        example.surname = "Murat";
        example.country = "Tunus";

        Example example1 = new Example();
        example1.name = "Ahmet";
        example1.surname = "Yılmaz";
        example1.country = "Madagaskar";

        Example example2 = new Example();
        example2.name = "Ayşe";
        example2.surname = "Tok";
        example2.country = "Pakistan";

        System.out.println(example.country);
        System.out.println(example1.country);
        System.out.println(example2.country);
    }
}

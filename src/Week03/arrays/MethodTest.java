package Week03.arrays;

import java.util.Scanner;

public class MethodTest {

    // girilen bir tam sayının karesini alan bir method oluşturalım. Bu metot non static olsun.
    // Kullanıcıdan iki adet sayı isteyelim.Bu sayılardan küçük olanlardan başlayarak büyük olan sayıya kadar
    // aradaki bütün sayıların karesini oluşturduğumuz metot ile alalım ve yazdıralım.

    //TODO-> YAPILACAKLAR BURAYA YAZILACAK
  /*
  *
  *
  *
  *
  *
  *
  * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int numOne = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int numTwo = sc.nextInt();

        karesi(1);




    }


    /**
    *
    * @param numOne
    * @return karesini döner
     *
    */
    public static int karesi(int numOne)
    {
       return numOne * numOne;
    }
}

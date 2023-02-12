package day08nestedif;

import java.util.Scanner;

public class C04_Ternary {

    /*
    Kullanıcıdan iki sayı alınız buyuk olmayan sayiyi yazdiriniz
     */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        int sayi1 =input.nextInt();
        int sayi2 =input.nextInt();

        if(sayi1<sayi2){
            System.out.println("buyuk olmayan sayı : "+ sayi1);
        } else if (sayi1>sayi2){
            System.out.println("buyuk olmayan sayı : "+ sayi2);
        }else{
            System.out.println("sayilar birbirine eşit");
        }

        //2.yol

        System.out.println(sayi1 == sayi2 ?"sayilar eşit" : sayi1>sayi2 ? sayi2 :sayi1);
    }
}

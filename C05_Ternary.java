package day08nestedif;

import java.util.Scanner;

public class C05_Ternary {

    /*
    Kullanıcıdan bir sayi alin ve mutlak degerini yaziniz.

     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen bir sayi giriniz");

        int  sayi =input.nextInt();

        System.out.println(sayi <= 0 ? -1*sayi : sayi);

        //Kullanicidan bir sayi aliniz pozitifse pozitif negatifse negatif yazdırın.


        System.out.println("Bir sayi giriniz");

        int number =input.nextInt();


        String sonuc =number>=0 ? "Sayi Pozitif"  : "Sayı Negatif";

        //Kullanicidan bir sayi aliniz pozitifse pozitif negatifse sayının karesini yazdırın.



    }
}


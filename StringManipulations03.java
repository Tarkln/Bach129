package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {



    public static void main(String[] args) {

        /*

        Örnek 1 : Aşağıdaki kurallara göre password'u kontrol ediniz.

        1)En az 8 karakter
        2)Space karakteri olmasın
        3)En az  bir tane büyük harf olsun
        4)En az bir tane küçük harf olsun
        5)En az bir tane sembol olsun
        6)En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz....");

        String pwd = input.nextLine();

        //i)En az 8 character olsun

       boolean first = pwd.length()>7;
        System.out.println(first);

        //ii) Space character'i içermesin

        boolean second = pwd.contains("");
        System.out.println(second);

        //iii)En az bir tane büyük harf olsun
        // Note : Büyük harf olmayan hafleri sil,
        //        kalan character sayısına bak
        //        Character sayısı sıfır ise büyük harf yok demektir
        //        sıfırdan büyükse büyük harf var demektir.


        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;

        System.out.println(third);//Method'ları aynı satırda yan yana koyarsanız method chain denir.

        //iiii)En az bir tane küçük harf olsun.

       boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;

        System.out.println(fourth);

        //iiiii)En az bir tane sembol olsun.

        boolean fifth = pwd.replaceAll("[^a-zA-Z0-9]","").length()>0;

        System.out.println(fifth);

        //iiiiii)En az bir tane rakam olsun

        boolean sixt = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println(sixt);



        System.out.println("Password geçerli mi ?"  + (first && second && third && fourth && fifth && sixt));







    }
}

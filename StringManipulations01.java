package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non primitive data type'dır ve aynı zaman da bir class'dır.


    public static void main(String[] args) {

        String s = "Java is easy";

        //Örnek 1: s String'indeki tüm character'leri  büyük harf yapınız.

        String sUpper = s.toUpperCase();

        System.out.println(sUpper);

        //Örnek 2:  s String'indeki tüm character'leri küçük harf yapınız.

        String sLower = s.toLowerCase();

        System.out.println(sLower);

        //Örnek 3: s String'indeki ilk character'eri alınız.

         char firstChar = s.charAt(0);

         System.out.println(firstChar);

         //Örnek 4 : s String'indeki ikinci ve sondan ikinci character'ri alınız ve ekrana yanyana yazdırınız.

         char secondChar = s.charAt(1);

         char secondLast = s.charAt(10);
         //1.yol :aynı satırda yazdırmak için
         System.out.print(secondChar);
         System.out.println(secondLast);

         //2.yol :aynı satırda yazdırmak için
         System.out.println(""+ secondChar + secondLast);


         //örnek 5 : s String'indeki ikinci ve sondan ikinci character'ri alınız ve ekrana yanyana yazdırınız.

          int sLength = s.length();

         System.out.println(sLength);

         //örnek 6 : s String'in deki ilk dört character'i alınız.
           // substring(0,4) ==> "o" yani ilk index dahil,"4" yani ikinci index hariçdir.

           String sub1 = s.substring(0,4);
           System.out.println(sub1);

         //örnek 7 : s String'in deki "is" kelimesini alınız.

          String sub2 = s.substring(5,7);
          System.out.println(sub2);

        //örnek 8 : s String'in deki "easy" kelimesini alınız.

         String sub3 = s.substring(8,12);
         System.out.println(sub3);

         String sub4 = s.substring(8);
         System.out.println(sub4);

        //örnek 9 : s String'in de "money" kelimesi var olup olmadığını kontrol ediniz.

        boolean isExist = s.contains("money");
        System.out.println(isExist);

        /*
        Bir methodu öğrenirken 3 şeyi öğrenin
        i)bu method ne iş yapar ?
        ii)Bu methot'un farklı kullanımlarını nasıldır?
        iii)Bu method size ne return eder.

         */

        //örnek 10 : s String'inin belli bir harfle başlayıp başlamadığını kontrol ediniz.

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //örnek 11 : s String'inin 6.charterden itibaren belli bir harden başlayıp başlamadığını kontrol ediniz.

        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);


    }
}

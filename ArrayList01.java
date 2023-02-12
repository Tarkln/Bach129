package day17arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {
    /*
         1)ArrayList'ler coklu data depolamak icin kullanılır.
         2)ArrayList'ler non-primitive data type'ındeki coklu datalari depolamak icin kullanilir.
           List'ler "non-primitive" data kabul ederler."Array"ler ise "primitive" data veya reference kabul eder.
         3)ArrayList'leri olustururken icine koyacagıniz elaman sayisini basta soylemeye gerek yok.
           List'ler elaman sayisinda "flexible"dirler ama "Array"ler "flexible"degildirler.
         4)Madem "Array" ler elaman sayisinda flexible degıl nıcın Java "Array" leri iptal etmedi?
           i)Elaman sayisi belli olan data'lari depolamak icin "Array"ler tercih edlir.
           ii)Array'ler cok hizli calısır.
           iii)Array'ler memory'de cok az yer kaplar.
   */

    public static void main(String[] args) {

        //List nasıl olusturulur?
        ArrayList<Integer> ages =new ArrayList<>();

        System.out.println(ages);// []

        //List'lere elaman ekleme
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);
        ages.add(3,777);
        System.out.println(ages);// [9,656, 12, 777, 10, 888]

        //List'e coklu elaman nasil eklenir?
        //Bir List'e coklu elaman eklemek ,o elamanlari once bir list'in icine yerlestiriniz.
        ArrayList<Integer>newAges =new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(18);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 12, 10, 888, 8, 9, 18]

        //Bir List'teki tum elamanlari silme
       // ages.clear();
       // System.out.println(ages);

        //Bir elaminin List'te var olup olmadigini kontrol etmek
        boolean r = ages.contains(656);
        System.out.println(r);//true

        //Bir List'in baska bir list ile aynı olup olmadıgını kontrol etme
        ArrayList<String> names1 =new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("kim");

        ArrayList<String> names2 =new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s =names1.equals(names2);
        System.out.println(s);//false


        //Örnek 1 :Verilen iki Integer List'te tamamiyle ayni elamanlarinin olup olmadigini
        //         kontrol eden kodu yaziniz.

        ArrayList<Integer> nums1 =new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 =new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums2);
        Collections.sort(nums1);

        boolean t =nums1.equals(nums2);
        System.out.println(t);

    }
}

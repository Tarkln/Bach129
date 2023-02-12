package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

    public static void main(String[] args) {

        //Örnek 1 :String Array elamanlarini uzunluklarina göre kucukten buyuge siralayiniz.
        //          ["Micheal" , "Ajda" , "Thomas" , "Tom"] ==> ["Tom" , "Thomas" , "Ajda" , "Micheal"]
        String arr[] = { "Micheal" , "Ajda" , "Thomas" , "Tom" };
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));// :: ==> Method Reference
        System.out.println(Arrays.toString(arr));

        //Örnek 2 :String Array character sayisina gore buyukten kucuge siralayiniz.
        //         ["Micheal" , "Ajda" , "Thomas" , "Tom"] ==>  ["Micheal" , "Thomas" , "Cuneyt" , "Ajda" , "Tom"]
        String brr[] = { "Micheal" , "Ajda" , "Thomas" , "Tom" , "Cuneyt" };
        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr ,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Örnek 3: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        //         Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
        //         ["Michael", "Ajda", "Reyhane", "Gabriel", "Tom", "Ali", "Cin", "Cem"]
        //         [ "Gabriel", "Michael", "Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]
        String crr[] = { "Michael", "Ajda", "Reyhane", "Gabriel", "Tom", "Ali", "Cin", "Cem" };
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));
    }
}

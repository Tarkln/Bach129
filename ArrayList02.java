package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {

       //ArrayList olustururken sag tarafa(constructor) ArrayList yazmak zorundasınız.
       //Ama sol tarafa ister "ArrayList" yazın isterseniz de "List" yazın,ikisi de calısır.
       List<Character> initial = new ArrayList<>();
       initial.add('A');
       initial.add('B');
       initial.add('M');
       initial.add('S');

       //Bir List'te kac elaman oldugunu anlama
       int numOfElements =initial.size();
       System.out.println(numOfElements);//4

       //Note : Array'lerden bahsederken "length" kullanın,List'lerden bahsederken "size"kullanın.

        char u = initial.get(2);
        System.out.println(u);

        //Örnek 2 :Verilen bir String lİST'TEKİ elamanlarin toplam karakter sayısını bulan kodu yaziniz.

        List<String> cities =new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        //1.yol

        int sum = 0;

        for(String w : cities){

            w.length();

            sum = sum + w.length();
        }
        System.out.println(sum);//26

        //2.yol
        int toplam =0;

        for (int i = 0; i < cities.size(); i++) {
          toplam = toplam + cities.get(i).length();
        }

        System.out.println(toplam);//26

        //Listedeki bir elamani degistirme

        cities.set(0, "New York");

        //Örnek 3 : Maas list olustur ve maaslara %20 zam yap

        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        int idx =0;
                           //19500.25, 8500,75, 32500.50
        for(Double w : salary){

            salary.set(idx, w*1.20);

            idx++;
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]

       //2.yol

        for(int i=0; i<salary.size(); i++){

            salary.set(i, salary.get(i)*1.20);

        }
        System.out.println(salary);






    }

}

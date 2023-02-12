package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

    public static void main(String[] args) {
        List<String> cities =new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        System.out.println(cities);//[Miami, Istanbul, Kayseri, Almaty]

        //remove() method'u index ile kullanılırsa o index'teki elamani siler.
        String n = cities.remove(1);
        System.out.println(n);//Istanbul
        System.out.println(cities);//[Miami, Kayseri, Almaty]

        //remove() method'u elaman ile kullanılırsa ilk görüneni siler.
        //remove() method'u elaman ile kullanılırsa size o elamani silip silmedigini ifade eden
        //true veya false verir.
        boolean p = cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);



    }

}

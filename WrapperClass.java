package day04asciiwwrapperclassoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive ; char,boolean,byte,short,long,int,float,double
        //Wrapper Class ; Character - Boolean -Byte -Short - Integer- Long-Float-Double
        // wrapper classlar non primitiveler o yüzden memoryde çok yer kaplarlar şart değilse kullanmayı tercih etmeyiz


        int n =12;
        Integer m = 12;

        byte p = 23;
        Byte r = 43;

        //Örnek 1 : short data type tipinin minumum ve maximum değerlerini kod yazarak bulunuz

        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

         // Örnek 2: int min değeri byte max

        int intMin = Integer.MIN_VALUE;

        byte byteMax = Byte.MAX_VALUE;

        System.out.println("toplam:"+(intMin+byteMax));

        // Örnek 3: 1.primitive int'i wrapper Integer'a çeviriniz

        int num = 22;

        Integer wrapperNum = num;

        System.out.println(wrapperNum);

        // İİ. wrapper Byte'ı primitive byte'a çevir

        Byte k = 43;

        byte primitivek = k;

        System.out.println(k);


        //Örnek 4 1.primite char'ı wrapper karaktere çeviriniz(Autoboxing)


        char initial = 'T';

        Character initialNum = initial;

        System.out.println(initialNum);

       // 2.wrapper boolean'ı primitive boolane çevir(Unboxing)

        Boolean isOld = true;

        boolean isOldWrapper = isOld;

        System.out.println(isOld);

        //öRNEK 5 String olan verilen iki fiyat'ın toplamını giriniz.

        String shirt = "2300";

        String shoes = "5200";
        // java da + sembolü iki sayı arasında kullanırsa toplama işlemi olur.
        // java da 2 string arasında veya 1 string ve bir sayı arasında kullanılırsa concetenation işlemi olur.
        // concetenation java matematikte ki işlem önceliği kurallarını kullanır.

        System.out.println(shirt + shoes);

       int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);

        System.out.println(toplamFiyat);

        //Örnwk 6 string olarak verilen iki fiyatın toplamı
        // note : valueOf metodu tüm karekterleri rakam olan stringleri sayılara çevirir.
        // eğer valueOf methodu kullanırken string içine rakam olmayan bir karakter konursa hata alınır.
        // bu hatayı düzeltme ilerde
        String tv ="$11000";
        String radio = "$3000";

        System.out.println(tv + radio);

       int totalPrice= Integer.valueOf(tv) + Integer.valueOf(radio);

        System.out.println(totalPrice);


    }

}

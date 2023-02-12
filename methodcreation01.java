package day02datatatypesmethodcreation;

public class
methodcreation01 {
    /*java da method nasıl oluşturulur

    1) main methodun dışında oluşturulur
    2) access modifier + return type + method ismi yazılır + () + {}

    //oluşturulan methodlar nasıl kullanılıt

    1)main methodunun içinden kullanılır
    2)methodun ismi + parantez
    3)işlem yapacağınız sayıları parantezin içine koyun
     */

    public static void main(String[] args) {
     int sonuç = add(30,50);
        System.out.println(sonuç);

     long carpmaSonucu = multiply(3,6);

        System.out.println(carpmaSonucu);

     int ucluSonuç = firsttomultiplythirdhAdd(2,5,8);

        System.out.println(ucluSonuç);

     double kup = getCube(5);

        System.out.println(kup);

    }

    public static int add(int a ,int b ){
        return a+b;
    }

    protected static long multiply(long a ,int b) {
        return a*b;
    }

    //verilen 3 sayıdan ilk ikisini toplayan ve sonucu üçüncü sayıyla toplayan  methodu oluşturunuz

    private static int firsttomultiplythirdhAdd(int a,int b,int c){
        return a+b+c;
    }

    // verilen bir ondalık sayının küpünü hesaplayan methodu oluşturup kullanılız.
    // note access modifier i default yapmak access modifier ı yazmayınız.
    static double getCube(double a){
        return  a*a*a;
    }

}
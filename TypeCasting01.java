package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*Numeric primitive data type'larinin birbirine donuşturulmesine "Type Casting" denir.
      Numeric Data Type'lar, byte,short,int,long,float,double

      Note 1: Küçük daya typle'larını büyük data type'larına çevirmeyi Java otomatik olarak yapabilir.
              Bu işleme "Autowidening"(Otomatik Genişletme) denir.

      Note 2; Büyük data type'larını küçük data type'larına çevirmek riskli bir iştir.
              Java bu rislki işi otomatik olarak yapmaz.Bu işleri kod yazanlar yapar.
              Bu işleme "ExplicitNorrowing"(Açıktan Daraltma) denir.
     */

    public static void main(String[] args) {

       //byte data type'ını int data type'a çeviriniz.

        byte age = 13;

        int ageInt = age;//Autowidening

        //long data type!ı short data type'a çeviriniz.

        long weight = 234;

        short weightInt = (short)weight;//explicitnorrowing

        //int data type'ını float data tipine çeviriniz.

        int population = 700000;

        System.out.println(population);

        float populationFloat = (float)population;

        System.out.println(populationFloat);

        //double data type'ını short data type'a çeviriniz

        double  number = 12.234;

        System.out.println(number);

        short   numberShort = (short)number;

        System.out.println(numberShort);

        //Dikkat!
        //dönüşüm yaptığınız sayı(260),dönüşeceğiniz data type'ın sınırları dışındaysa java kullandığınız sayıyla "mod"
        //işlemi yapar ve mod işleminin sonucu yeni değerini yapınız.

        //örnek 1:
        short num = 260;

        System.out.println(num);

        byte numByte = (byte)num;

        System.out.println(numByte);

        //örnek 2 :

        short n = 1023;

        System.out.println(n);

        byte nByte = (byte)n;

        System.out.println(nByte);


    }


}

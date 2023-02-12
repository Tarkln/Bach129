package day09incrementdecrementternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
            Örnek 1 : Verilen yılın "Artık Yıl"(Leap Year) olup olmadığını kontrol eden kodu yazınız.
                      1)Yıl 100'e bolunurse 400'e bölünmelidir. 1600 ==> 1600 ==> Leap  1800 ==> Leap değil
                      2)Yıl 100'e bolunmuyorsa 4'e bolunmelidir. 2004 ==> Leap 2005 ==> Leap değil

        */


         int year =1600;
         String result = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
         System.out.println(result);
    }

}

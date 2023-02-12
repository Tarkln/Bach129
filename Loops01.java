package day10switchloops;

public class Loops01 {

    /*
    Code Standard
    i)Tekrar(Repetition) olmamalidir.
    ii)Dynamic olmalidir.
    iii)Tamir(Fix) ve update kolay yapabilmelidir.
     */
    public static void main(String[] args) {


       //Örnek 1 :Ekrana 5 kere "Hi" yazdiriniz.

       //1.yol : Tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

       //2.yol:
       //Ayni adimlar tekrar tekrar yapimasi gerektiğinde "Loop" lar kullanilir.
       //Dort tane loop var ; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

       //i)for-loop
       //baslangıc degeri Loop'un calisma sarti Incremant/Decrement
       for(int i=1       ;i<6    ;i++){
           System.out.println("Hi!");
        }

        //Örnek 2 :11'den 44'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz.

       for (int i=11; i<45; i++){
           System.out.println(i);
       }

      //Örnek 3 : 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz.

        for (int i =40; i>22; i--){
            if (i%2==0){
                System.out.println(i);
            }
        }

      //Örnek 4 = 18'dan 56'a kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz.

        for (int i=18; i<57; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }








    }

}

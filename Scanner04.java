package day04scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //kullanıcıdan 2 sayı alıp 4 işlem yapan ve işlemlerin sonuçlarını ekrana yazdıran sonuçları ekrana yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayıyı giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(5. + 2);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

    }
}

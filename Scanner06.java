package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        //kullanıcıdan alacağınız 5 basamaklı
        //bir sayının ilk iki ve son iki basamaklarında ki
        //rakamların toplamını yazdıran kodu giriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz");

        int number = input.nextInt();
        //son rakımı almak için
        int lastDigit = number%10;

        System.out.println(lastDigit);
        // sayıyı küçültmek için
        number = number/10;

        System.out.println(number);

        //sondan ikinci rakamı al

        int lastSecondDigit = number%10;

        number = number/10;

        //sondan üçüncü rakamı al

        int lastThirdDigit =number%10;

        number = number/10;

        //sondan dördüncü rakamı al

        int lastFourtDigit =number%10;

        number = number/10;

        //sondan beşinci rakamı al


        int lastFifthDigit =number%10;

        number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastThirdDigit+lastFourtDigit+lastFifthDigit);







    }
}

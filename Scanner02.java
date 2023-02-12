package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //kullanıcıdan ilk ismini  ve soy ismini alıp ikisini aynı satırda yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.println("ilk isminizi giriniz...");
        //next method kullanıcıdan tek kelimelik tring almak için kullanılır

        String firstName = input.next();

        System.out.println("sos isminizi giriniz");

        String lastaName = input.next();

        System.out.println(firstName+ " " + lastaName);
    }
}

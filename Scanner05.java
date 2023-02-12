package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //kullanıcıdan bir dikgörtgenin iki kenar uzunluğunu alının
        // 1.alan
        //2.çevre

        Scanner input = new Scanner(System.in);

        System.out.println("dikgörtgenin kısa kenar uzunluğunu giriniz");
        float shortSide = input.nextFloat();

        System.out.println("dikgörtgenin uzun kenarını giriniz");
        float longSide = input.nextFloat();

        System.out.println(shortSide * longSide);

        System.out.println(2*shortSide + 2*longSide);

    }
}

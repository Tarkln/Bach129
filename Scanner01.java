package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    //kullanıcıdan data alıp kodlarımız da kullanıcağız


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen yasınızı giriniz...");

        byte age = input.nextByte();

        System.out.println(age);


    }


}

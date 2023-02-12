package day07ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    //Kullanıcı gun numarisini girsin kod gün ismini yazsin.
    // 1 ==> Pazar 2 ==> Pazartesi 5 ==> Perşembe...

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen gun numarasını giriniz...\n 1 : Pazar 2 : Pazartesi 3 : Salı 4 : Çarşamba 5 : Perşembe 6 : Cuma 7 : Cumartesi");

        byte gunNO =input.nextByte();

        if(gunNO ==1){
            System.out.println("Pazar");
        } else if (gunNO ==2){
            System.out.println("pazartesi");
        } else if (gunNO ==3){
            System.out.println("salı");
        } else if (gunNO == 4){
            System.out.println("çarşamba");
        } else if (gunNO ==5){
            System.out.println("perşembe");
        } else if (gunNO == 6) {
            System.out.println("cuma");
        } else if (gunNO == 7){
            System.out.println("cumartesi");
        }else{
            System.out.println("Lütfen geçerli bir gün numarası giriniz \n 1 : pazar 2 : pazartesi 3 : salı 4 : çarşamba 5 : perşembe 6 : cuma 7 : cumartesi");
        }
    }
}

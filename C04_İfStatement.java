package day07ifstatement;

import java.util.Scanner;

public class C04_İfStatement {

    /*
    Kullanıcıdan yaş eğerini alan ve yaşın hangi evrede olduğunu
    aşağıdaki tabloya göre yazdıran kodu oluşturunuz.

    0-4 =0> bebek
    5-12 ==> cocuk
    13-20 ==> genc
    21-30 ==> yetiskin
    Tanımlanmamış evre
    Hata mesajı olarak "Geçerli bir yaş giriniz" yazdırınız.
     */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz");
        int yas = input.nextInt();

        if(yas<0){
            System.out.println("Geçerli bir yaş giriniz");
        } else if (yas<5){
            System.out.println("Bebek");
        } else if (yas<13){
            System.out.println("Cocuk");
        } else if (yas<21){
            System.out.println("genc");
        } else if (yas<31){
            System.out.println("yetiskin");
        } else {
            System.out.println("tanımlanmamış evre");
        }


    }//main
    }//class


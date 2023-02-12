package day07ifstatement;

import java.util.Scanner;

public class C03_İfStatement {

    public static void main(String[] args) {

        /*
        İki tane string datanin birbirine eşit olup olmadığını anlamk için "==" değil; equals() kullanırız.
        i)equals() ==> büyük küçük harf önemser
        ii)equalsIgnoreCase() ==> ikisinide önemsemez.
         */

        //Kullanıcıdan gün isimlerini alınız hafta içi mi hafta sonu mu olduğunu yazdıran kodu oluşturunuz.

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir gün giriniz");
        String gunIsmi = input.next();

        if(gunIsmi.equalsIgnoreCase("cumartesi") ||gunIsmi.equalsIgnoreCase("pazar")){
            System.out.println("Haftasonu");
        } else if ( gunIsmi.equalsIgnoreCase("pazartesi") ||
                    gunIsmi.equalsIgnoreCase("salı") ||
                    gunIsmi.equalsIgnoreCase("çarşamba") ||
                    gunIsmi.equalsIgnoreCase("perşembe") ||
                    gunIsmi.equalsIgnoreCase("cuma")){
            System.out.println("hafta ici");
            }else{
            System.out.println("Gecerli bir gün giriniz.");
        }//else body

        boolean haftaici = gunIsmi.equalsIgnoreCase("pazartesi") ||
                gunIsmi.equalsIgnoreCase("salı") ||
                gunIsmi.equalsIgnoreCase("çarşamba") ||
                gunIsmi.equalsIgnoreCase("perşembe") ||
                gunIsmi.equalsIgnoreCase("cuma");
        boolean haftasonu = gunIsmi.equalsIgnoreCase("cumartesi") ||gunIsmi.equalsIgnoreCase("pazar");

        if(haftaici){
            System.out.println("Hafta İci");
        } else if (haftasonu){
            System.out.println("Hafta Sonu");
        }else{
            System.out.println("geçerli bir gün giriniz");
        }//else body

    }//main class
    }//clASS


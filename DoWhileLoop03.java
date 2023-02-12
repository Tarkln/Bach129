package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
            Gercerli Username ="admin" Password ="pwd123" dur.
            Kullanicidan usurname ve password'u alin.
            usurname ve password dogru  ise consele'a "Hesabiniza Hosgeldiniz" yazdirin.
            usurname veya password yanlis ise 3 kere "Usurname ve password'unuzu giriniz." yazdirin.
            usurname veya  password 4 kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamla
         */

        Scanner input =new Scanner(System.in);

        int counter = 0;

        do {

        if(counter==4){
            System.out.println("Hesabiniz bloke olmustur!");
            break;
        }
            System.out.println("Username'i giriniz...");
            String usurname =input.next();

            System.out.println("Password'u giriniz...");
            String password =input.next();

        if(usurname.equals("admin") && password.equals("pwd123")){
            System.out.println("Hesabiniza Hosgeldiniz!");
            break;
        }
        counter++;

        }while(true);






    }

}

package Hastane_projesi;

public class HastaneRunner {

    public static void main(String[] args) {


    }

    private static String doktorUnvan() {

        String unvan = doktorUnvan();

        System.out.println(unvan);

        return unvan;

    }


    public static String doktorUnvan(String aktuelDurum) {

        if (aktuelDurum.equals("Allerji")) {

            System.out.println("Allergist");

        } else if (aktuelDurum.equals("Bas agrisi")) {

            System.out.println("Norolog");

        } else if (aktuelDurum.equals("Diabet")) {

            System.out.println("Genel cerrah");

        } else if (aktuelDurum.equals("sogukalginligi")) {

            System.out.println("Cocukdoktoru");

        } else if (aktuelDurum.equals("Migren")) {

            System.out.println("Dahiliye");

        } else if (aktuelDurum.equals("Kalphastaliklari")) {

            System.out.println("Kardiyolog");

        }else {

            System.out.println("yanlıs unvan");


        }

       return aktuelDurum;


    }



    }


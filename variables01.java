package day02datatatypesmethodcreation;

public class variables01 {


    //primative data types char boolean byte short int long float double
    //float virgüllü sayılar(decimal number) memory de daha az yer kaplar(fiyatlandırmalar)
    //double virgüllü sayılar(decimal number) memory daha fazla yer kaplar (bir hücrenin ağırlığı)


    public static void main(String[] args) {


        //Örnek 1 : gömlek ve ayakkabı fiyatları için iki tane variable oluşturup toplam fiyatı ekrana yazdırınız.
        //Note Java decimal numbersları double kabul eder
        // float olmasında ısrar ediyorsanız sonuna f veya F koymalısın
         float shirtPrice = 12.99F;
         float shoesPrice = 15.89F;
        // system.out.println() ekrana yazdırır ve pointer'ı bir sonra ki satıra koyar.
        // system.out.print() ekrana yazdırır ve pointer'ı aynı satıra koyar.
         System.out.println(shirtPrice+shoesPrice);
         System.out.print(shirtPrice);

         //sout yaz enter tuşuna bas system out un kısacası yazdırmanın kısa yolu
         // Örnek : hücre ağırlığı ve amipin ağırlığı için iki tane variable oluşturun ve ağırlıkların farkını ekrana yazdırır.

        double weighCell = 0.00000000000112;
        double weighAmip = 0.00000000000023;

        System.out.println(weighCell - weighAmip);



    }


}

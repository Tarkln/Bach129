package day04asciiwwrapperclassoperatorsmemoryusage;

public class Operators01 {



       /*

           1) +,_, *; / java da matematikte kullanıldığı gibi kullanılır.
           note1 : int/int = int
           note2 ; double + int = double olur.Farklı data type kullanırsa sonuç  büyük olan data type olur.

           2) java da "logical operators" lardır.
               AND ve OR işlemleri "logical operators" lardır.
           i) And işleminde 1 tane true olabilmek için herşey true olur.
              And işlemi mükemmeliyetçidir.
              And işleminde bir tane false olursa sonuç false olur.

          ii) Or işlemin de bir tane true sonucu true yapmaya yeter.
              Or işleminde sonucun false olması için herşey false olmalıdır.
              Or işlemi "polyanna" gibidir.


          iii)Not operatory(!) true olanı false ,false olanı true yapar.
               !true  = false
               !false = true
               !true =  true

          3)Karşılaştırma Operatorü
           < ,> , = = , != ,<= ,>=

           note:karşılaştırma operatörünte boolean alırsın.
           note:and işlemi için "&&" kullanırız ama tekli kullanım da geçerlidir.
           farkları nedir ?
           "&&" bu kullanım ilk ifade ne olursa olsun  iğerlerini kontrol etmez dolaysıyla daha hızlı çalışır.
           "&&" bu yüzden bunu kullanırız.

        */

    public static void main(String[] args) {

     boolean first= 3<5;
     boolean second =  2+3 != 5;
     boolean third = 2+3+5 >= 19;

        System.out.println(first+"-"+second+"-"+third);
        System.out.println(first && second);
        System.out.println(first || second || third);
    }
}

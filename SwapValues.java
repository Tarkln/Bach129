package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap : yer değiştirmek. 1.kap :patates 2.kap : domates  ==> Swap ==> 1.kap :Domates 2.kap : Patates


    public static void main(String[] args) {

        //1.yol

        int a = 12;
        int b = 5;// swap'tan sonra ==> a=5 olacak b=12 olacak
        int temp = 0;

        System.out.println("a:" + a);
        System.out.println("b"+ a);
       // 1.adım

        temp = a;

        //2.adım

        a = b;

        //3.adım

        b = temp;

        System.out.println("a:" + a);
        System.out.println("b:" + b);


        //2.yol:

        int x = 12;
        int y = 5;

         x = x + y ;
         y = x - y ;
         x = x - y ;





    }
}

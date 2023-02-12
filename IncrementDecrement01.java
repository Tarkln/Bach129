package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {

    public static void main(String[] args) {

          int a =5;
        System.out.println(a);// 5

        //Increment
        a = a + 2 ; // veya a += 2;
        System.out.println(a);// 7

        //Örnek 1 :Bir tane integer variable oluşturun ve onu iki şekilde artırın.

        int b = 10; //10
        System.out.println(b);

        b = b + 5;//15
        System.out.println(b);

        b += 5;//20
        System.out.println(b);

        //decrement

        int c = 8;
        System.out.println(c);//8

        c = c-3;
        System.out.println(c);//5

        c -= 3;
        System.out.println(c);//2

        //Incerement 2

        int d =6;
        System.out.println(d);

        d = d*2;
        System.out.println(d);

        d *= 2;
        System.out.println(d);

        //decrement 2

        int e = 24;
        System.out.println(e);//24

        e =e/2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6

        //"1" ile increment
        int f =12;
        System.out.println(f);

        //f=f+1;
        //f += 1;
        f++;
        System.out.println(f);

        //"1" ile decrement
        int h =10;
        System.out.println(h);
        //h=h-1;
        //h -=1;
        h--;
        System.out.println(h);

        //"post increment" ve "pre increment"

        int i =10;
        int k = i++;//post increment cunku increment variable ın isminden sonra yazıldı.
        System.out.println(k);//10 ==> "i" artırılmadan "k"ya konulduğu için "k" nın değeri 10 olur.
        System.out.println(i);//11 ==> "i" satır sonunda artırıldığı için "i"nin değeri 11 olur.


        int m =15;
        int n = ++m;//pre increment cünkü increment variablein isminden önce yazıldı.
        System.out.println(m);//16 ==>"m" satır sonunda artırıldığı için "m"nin değeri 11 olur.
        System.out.println(n);//16 ==>"m" artırıldıktan sonra "n" ye konulduğu için "n"nin değeri 16 olur.

        //"post decrement" ve "pre decrement"

        int p =17;
        int r =p--;
        System.out.println(p);
        System.out.println(r);


        int s =20;
        int t =--s;
        System.out.println(s);
        System.out.println(t);


    }

}

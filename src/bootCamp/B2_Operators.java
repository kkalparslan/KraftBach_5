package bootCamp;

public class B2_Operators {
    public static void main(String[] args) {
        // Aritmetic operators
        // * / + -
        int i=5+3/2+1-1;
        System.out.println("i = " + i); // 6
        i=5+3*2+2-1;
        System.out.println("i = " + i); // 12
        i=5+(int)3.1+2-1;
        System.out.println("i = " + i); // 9
        i=(int)(3.4+6.6);
        System.out.println("i = " + i); // i = 10
        i=(int)3.4+(int)6.6;
        System.out.println("i = " + i); // i = 9
        i=(int) (4.5+(double) (5/2));
        System.out.println("i = " + i);
        i=(int)(4.5+2.5);
        System.out.println("i = " + i); // 7

//        i=(int)(4.5+5/2);
//        System.out.println("i = " + i); // 6

        // unary operators
        // + - ++ -- !
        int value=0;
        value++; // postfix increment
        System.out.println("value = " + value); // value = 1
        ++value; //
        System.out.println("value = " + value);
        // kaçırdığım örneği yap burada!......................


        // The assigment operators
        // = assigment operator
        int t =10;
        int j =20;
       // j=j+t;
//        System.out.println(j += t); // assigment 30
//        System.out.println("j = " + j); // 30
//        System.out.println(j+t); // aritmethic işlem 40
//
//        System.out.println(j %= t); // 0 assigment j= j%t-----> j = 0
//        System.out.println(t %= j); // 10/0 aritmethic exception


        // The equality operators
        // == equal to
        // != not equal to
        // < less than
        // <= less than equals
        // > greater than
        // >= greater than equal
        // All of above represent boolean condition // true or false ifade eder

        double d=10;
        if(d==10){} // true döndürür
        if(d<=10){} // true döndürür
        if(d>=10){} // true döndürür
        if(d!=10){} // false döndürür
        if(d<10){} // false döndürür
        if(d>10){} // false döndürür


        int a=4;
        int b=7;
        boolean bl;
        // The conditional operators
        // & bitwise AND her iki tarafıda control ediyor/check both side
        // && logical AND doesnt check both side / short-circuit // to return true both side sholud be true
        bl=a<b && a>3; // ----> true && true = true
        System.out.println("bl = " + bl); // true
        System.out.println((a < b && a > 3)); // true

        // | bitwise OR
        // || logical OR one side is true ıt return true
        bl= b-a>0 || b-a%2==0;
        System.out.println(bl); // true

        // ^ bitwise exclusive OR if both side are same it return false
        bl=b+a>10^ b*a>25; // true || true = false
        System.out.println("bl = " + bl);
        bl=b+a<10^ b*a<25; // false || false = false
        System.out.println("bl = " + bl);
        bl=b+a<10^ b*a>25; // false || true = true
        System.out.println("bl = " + bl);

        boolean x= true, y= true, z= false;
        x=!y;
        System.out.println(z = !x && x == z); // true

        System.out.println(z = x && x == z); // false


    }
}

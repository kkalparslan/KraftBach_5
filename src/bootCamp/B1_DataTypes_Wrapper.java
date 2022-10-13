package bootCamp;

import java.util.Scanner;

public class B1_DataTypes_Wrapper {
    public static void main(String[] args) {
        // primitive data types
        // byte<short<int<long<
        // float<double // floating point number 6 tanesi dijit 1i single string car, 1 i condition data tipinde.
        // char // single string character represant
        // boolean // true or false represent

        // Casting/ primite
        // implict casting -- automatically -- smaller to larger type
        int a=100;
        double dl=a; // implict casting// kapalı
        System.out.println("dl = " + dl); // dl = 100.0

        // explicit casting -- coder must do -- larger to smaller type
        double d= 100.0;
        int i=(int) d; // explicit casting
        // dönüştürmek istediğimiz değeri önden yazmamız gerekmektedir.
        // ------------------------------------------------------------
        // *** Wrapper Class ***
        // Why do you need wrapper class for primitive type??
        // For example: Arrays work with both primitive and non primitive types but
        // Collections/Maps can not work primitive types. For that we need wrapper class
        // to utilize flaxibility of collection or maps...............
        // Every primitive type has a wrapper class.
        // int--> Integer
        // double --> Double
        // char--> Character
        // ......

        double db=10.0;
        Double db1=db; // auto boxing
        System.out.println(db1 + db);

        Integer num=10;
        int n=num;
        System.out.println(num.equals(n)); // true
        System.out.println(num == n); // true

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE); // 2147483647
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE); // -2147483648

        System.out.println("Integer.sum(10,20) = " + Integer.sum(10, 20)); // 30
        System.out.println("Integer.sum(n,num) = " + Integer.sum(n, num)); // 20

        int x=10;
        int y=15;
        System.out.println("Integer.max(x,y) = " + Integer.max(x, y)); // max(x,y) = 15

//        Scanner scan=new Scanner(System.in);
//        int num1=scan.nextInt();
//        int num2=scan.nextInt();
//        Integer.max(num2,num1); // hazır methodları kolayca kullanabiliyoruz. herhangi
//                                // bir if bloğu ile küçük büyük kontrolü yapmaya gerek duymadan hallettik
//        for (int j = Integer.min(num1,num2); j <= Integer.max(num1,num2); j++) {
//            System.out.print(j+" ");
//        }

        // *** parseInt() *** -- convert "a string consist of dijit" to primitive
        System.out.println("parseInt(100) = " + Integer.parseInt("100")); // parseInt("100") = 100
        int t = Integer.parseInt("5") + 5;
        System.out.println("t = " + t); // int bir değere atayıp yazdırabildik.

        // *** value() *** -- convert "string consist of dijit" to wrapper class object
        Integer integer = Integer.valueOf("5");
        System.out.println("integer = " + integer);
        System.out.println("Integer.valueOf(5) = " + Integer.valueOf("5"));
        //--------------------------------------------------------------------
        System.out.println("Character.isDigit(5) = " + Character.isDigit('5'));
        System.out.println("Character.isDigit('a') = " + Character.isDigit('a'));
        System.out.println("Character.isLetter('4') = " + Character.isLetter('4'));
        System.out.println("Character.isLetter('b') = " + Character.isLetter('b'));
        System.out.println("Character.isLetterOrDigit('a')+\"---\"+Character.isLetter('3') = "
                + Character.isLetterOrDigit('a') + "---" + Character.isLetterOrDigit('3'));

















    }
}

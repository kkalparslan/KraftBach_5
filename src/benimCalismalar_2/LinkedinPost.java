package benimCalismalar_2;

public class LinkedinPost {

    static int age;

    public static void main(String[] args){
        int a = 1234512345; //alabileceği value değerin üzerinde bir value atanırsa compile etmez.
       // System.out.println(a);

        int x = 5;
        x = 10;
        System.out.println(x); //x değişkeni son tanımlandığı yerdeki değeri döndürür.

       // System.out.println("Your age is: " + age);

            for (int i=0; i<=5; i++){
               // i+=1;
                System.out.println("Hello World!");
        }

        String str = "every";
        str.trim();
        str.toUpperCase();
        str.substring(2,3);
        System.out.println(str);

        System.out.println("hello my friends".split(" ")[2]);

        int[] numbers = {3, 6, 9, 12};
        System.out.println(numbers[2]);

        int ab = 100;
        int cd = 150;
        System.out.println(Math.max(ab,cd));

        for(int i = 0; i<30; i = i+3){
            System.out.println(i);
        }
    }
}

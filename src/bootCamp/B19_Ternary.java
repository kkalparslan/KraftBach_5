package bootCamp;

public class B19_Ternary {
    public static void main(String[] args) {
        // which one big?
        int x=5, y=10,z=15;
        // pattern
        System.out.println( x > y ? (x > z ? x : z) : (y > z ? y : z));

        // which one have the longest char sequences?
        String s1="ahmet", s2="mehmet", s3="ercüment";
        System.out.println(s1.length() > s2.length() ? (s1.length() > s3.length() ? s1 : s3) : s2.length() > s3.length() ? s2 : s3);
//             true                         for true

        // swaping
        int a=10;
        int b=20;
        int temp;
        temp=a;
        a=b; // a-->20
        b=temp; // b-->10
        System.out.println(a+" <--> "+b);


    }


}

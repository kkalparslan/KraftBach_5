package Day_1_BenimCalismalarim;

public class WithEbec {
    public static void main (String [] args){

        int a=8; //5
        int b=5; //8
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        int c=10; //15
        int d=15; //10

        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("c: "+c);
        System.out.println("d: "+d);

        int e=20;
        int f=10;

        e=e-f;
        f=f+e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);


    }
}

package Day_1_benimCalısmalarim;

public class TypeCasting {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String str = "Hİ";
        String str2 = "";

        System.out.println(a+b+str);
        System.out.println("--------------");
        System.out.println(str+a+b);
        System.out.println("--------------");
        System.out.println(a+str2+b);
        System.out.println("--------------");
        System.out.println(str2+b+a);
        System.out.println("--------------");
        System.out.println(b+a+b+str2);


        // 300 fahrenheit kaç celsius dur( c=(f-32)/1.8
        // C=(f-32)/1.8
        // C= (300-32)/1.8
        // C= 268/1.8

        double fahrenheit=300;
        double celcius=(fahrenheit-32)/1.8;

        System.out.println("celcius = " + celcius);




    }


}

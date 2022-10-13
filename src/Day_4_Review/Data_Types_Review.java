package Day_4_Review;

public class Data_Types_Review {
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;

        float f;
        double d;
        char c;
        boolean bl;

     // byte
        b = 127;
        b = -128;

        // short
        s= 32767;

        // int
        i=2147483647;

        // long
        l=2147483648L;

        // float ve double genel olarak banka hesapları gibi değerleri temsil ederken kullanılır.

        f=1.1234567F;
        d=1.12345671;
        System.out.println("f= "+f);
        System.out.println("d= "+d);
        d=f;

        byte byteMin=Byte.MIN_VALUE;
        byte byteMax=Byte.MAX_VALUE;

        short shortMin= Short.MIN_VALUE;
        Short ShortMax= Short.MAX_VALUE;

        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        System.out.println("shortMin = " + shortMin);
        System.out.println("ShortMax = " + ShortMax);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);

        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);






    }
}

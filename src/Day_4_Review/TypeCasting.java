package Day_4_Review;

public class TypeCasting {
    public static void main(String[] args) {

       /* Type Casting bir veri türünün başka bir veri türüne atandığında gerçekleşen bir
        dönüştürme(converting) işlemidir. 2 tip casting vardır:
        1-widening casting(automatically) küçük data type inden büyük olana doğru olur.
        2-Narrowing casting(manually) büyük data type inden küçük olana doğru olur.*/

//        Type casting
//        Widening
//        int myAge=8;
//        double myDouble=myAge;
//        System.out.println(myDouble);
//
//
//        int version=2;
//          double ver=version;

//        long l= 30;
//        double d=l;

        // Narrowing
        double d=9.78;
        int i=(int) d; // 9 data kaybı oldu. int double dan daha
        // küçük bir değer olduğu için explicit açıktan manuel olarak casting yaptık.
        System.out.println(i);

//        double d=2.3;
//        double e=4.4;
//        double f=5.3;
//        int i=5;
//        int sonuc=(int)d+(int)e+(int)f+i;
//        //int sonuc=(int)(d+e+f)+i;
//        System.out.println(sonuc);

        /*Null string; string bir değişkene henüz bir şey assign(atanma) edilmediği anlamına gelir
        String s; // null string
        Empty string; length(karakter boyu) i sıfır olan bir string yapısını temsil eder.*/
//      String st=""; // empty string







    }


}

package day_46_Exception;

//import java.io.FileNotFoundException;

public class ThrowClause {
    public static void main(String[] args) {
//        int x=0;
//        if(x==0){
//            throw new ArithmeticException("aritmetik exception hatası");
//        }else{
//            System.out.println("program sonlandı");
//        }

        int x = 0;
        try {
            if (x == 0) {
                throw new ArithmeticException("aritmetik exception hatası");
                // throw new FileNotFoundException("aritmetik exception hatası"); java.lang paketinde olmayan
                // bir exception ilgili paketten yukarıdaki gibi import edilir..
            }
        } catch (ArithmeticException e) {//FileNotFoundException e){

            System.out.println(e.getMessage());
        }
        // KULLNICIDAN BİR SAYI ALIN VE BU SAYININ FAKTORİYELİNİ ALARAK EKRANA SONUCU YAZDIRIN
    }
}


package day_37_Inheritance_Cont_2;

public class Depo {
    public static void main(String[] args) {
        Fabrika fabrika=new Fabrika();       // fabrika sınıfı, fieldsları ve metotları default
                                             // olmasına rağmen aynı paket altında olduğu için ulaşabiliyor
                                             // amafarklı sınıfta olsa ulaşılabiliyor
        System.out.println(Fabrika.personelAdi);
        fabrika.defaultMethod();


    }
}

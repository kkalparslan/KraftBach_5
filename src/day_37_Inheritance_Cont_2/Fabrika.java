package day_37_Inheritance_Cont_2;

    public class Fabrika {
    public static String personelAdi;

    public String defaultMethod(){
        return personelAdi;
    }
    static{
        System.out.println("static metot");
    }
        {
            System.out.println("blok çalıştı");
        }
        public Fabrika(){
            System.out.println("cons çalıştı");
        }
        public Fabrika(String personelAdi){
        this();
        Fabrika.personelAdi =personelAdi;
            System.out.println("cons 2 çalıştı");
        }

}

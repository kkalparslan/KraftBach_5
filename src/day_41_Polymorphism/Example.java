package day_41_Polymorphism;

public interface Example {
    default void baslat(){
        mesaj();
    }
    default void mesaj(){
        System.out.println("merhaba dünya");
    }
}
class Main implements Example{
    public static void main(String[] args) {
        Main main=new Main();
        main.baslat();
    }
}

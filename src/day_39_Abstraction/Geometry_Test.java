package day_39_Abstraction;

public class Geometry_Test {
    public static void main(String[] args) {
        Circle circle=new Circle("daire",3);
        System.out.println(circle.info());
        Square square=new Square("kare", 4);
        System.out.println(square.info());
       // Geometry geometry=new Geometry() { Abstract class olduğu için hata verir,  nesne oluşturulamaz..

    }
}

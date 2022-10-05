package day_32_Constructor_Cont;

public class Square {
//    Örnek-1
//    Square adında bir class oluşturun, sideLenght adında field tanımlayın, constructors,
//    calculateArea ve calculatePerimeter metodları oluşturarak main metodunda bu class dan
//bir obje oluşturun.
    public int sideLength;

    public Square(){
    }
    public Square(int sideLength){
        this.sideLength=sideLength;
    }
    public int calculateArea(){  // alan hesaplama metodu
        return (int)Math.pow(this.sideLength,2);
    }
    public static double calculateArea(int sideLength){  // alan hesaplama metodu
        return (int)Math.pow(sideLength,2);
    }
    public int calculatePerimeter(){  // çevre hesaplama metodu
        return 4*this.sideLength;
    }
    public static int calculatePerimeter(int sideLength){   // çevre hesaplama metodu
        return 4*sideLength;
    }

}

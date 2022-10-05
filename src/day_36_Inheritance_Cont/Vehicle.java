package day_36_Inheritance_Cont;

import day_37_Inheritance_Cont_2.Fabrika;

public class Vehicle extends Fabrika{
    int model;
    String color;
    int speed;
    public void start(){
        System.out.println("araç çalıştı");
    }
    public void stop(){
        System.out.println("araç durdu");
    }

//    public static void main(String[] args) {// default bir metodun altındaki değişkenleri
//                                            // extents olunca yani alt sınıfı kullanabilir.
//
//
//    }
}

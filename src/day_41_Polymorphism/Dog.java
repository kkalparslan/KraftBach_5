package day_41_Polymorphism;

public class Dog extends Animal {
    int disSayisi;
    int ayakSayisi = 4;

    public void voice() {
        System.out.println("hav hav");
    }

    public void speed() {
        System.out.println("dog is very fast");
    }

    public void sleep() {
        System.out.println("dog is sleeping");
    }
}


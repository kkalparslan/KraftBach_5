package day_39_Abstraction;

public class Cat extends Animal{ // concrete class


    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kediler çok şey yerler");
       }
    @Override
    public void move() {
        System.out.println("kediler iyi koşucudurlar");
    }
}

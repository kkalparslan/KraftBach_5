package day_35_challenge;

public class Human {
    public void name(){
        System.out.println("ismi ahmet olabilir");
    }
}
class Man extends Human{
    public void role(){
        System.out.println("baba olurlar");
    }
}
class Son extends Man {
    public void activity(){
        System.out.println("oyun oynar");
    }
}
class TestClass{
    public static void main(String[] args) {
        Son son=new Son();
        son.name();
        son.role();
        son.activity();
        System.out.println("----------------------");
        Man man = new Man();
        man.name();
        man.role();
        System.out.println("----------------------");
        Human human=new Human();
        human.name();
    }
}

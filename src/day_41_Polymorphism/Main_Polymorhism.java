package day_41_Polymorphism;

public class Main_Polymorhism {
    public static void main(String[] args) {
//        Dog karabas=new Dog();
//        karabas.voice();
//        Animal akbas=new Dog();
//        akbas.voice();
//        akbas.sleep();
//        System.out.println(akbas.ayakSayisi);
//        akbas.eat();

//        SporCar mazda=new SporCar();
//        mazda.start();
//        mazda.speed();
//        mazda.stop();
//        System.out.println("-----------");
//        Car peoget=new SporCar();
//        peoget.start();
//        peoget.stop();
//        peoget.durmaMesafesi();
//        System.out.println("------------");
//        IVehicle ford=new SporCar();
//        ford.start();
//        ford.stop();
//        ford.durmaMesafesi();
//        System.out.println(ford.tekerSayisi());
//        System.out.println("mazda.tekerSayisi() = " + mazda.tekerSayisi());
//        System.out.println("peoget.tekerSayisi() = " + peoget.tekerSayisi());
//        System.out.println("ford.tekerSayisi() = " + ford.tekerSayisi());
//        System.out.println(peoget.getClass().getSimpleName());
//        Kus limon = new Kanarya();
//        Kus mavis = new Muhabbet();
//        //System.out.println(mavis instanceof Kus);
//        if(limon instanceof Muhabbet  ){
//            System.out.println("limon kanaryanın örneğidir");
//        }else{
//            System.out.println("limon kusun örneğidir");
//        }
//        Animal animal=new Dog();
//        Dog dog=(Dog) animal;
//        dog.eat();
//        dog.voice();
//        System.out.println("dog.ayakSayisi = " + dog.ayakSayisi);
//        System.out.println(dog.disSayisi);
//        dog.sleep();
//        dog.speed();
//        System.out.println("-----------------------------");
//        System.out.println("animal.ayakSayisi = " + animal.ayakSayisi);
//        animal.eat();
//        animal.voice();
//        System.out.println(((Dog) animal).disSayisi);
//        animal.sleep();
//        ((Dog) animal).speed();

        // parent class child class gibi davranması gerekiyor

        Animal animal =new Animal();
        Dog dog=new Dog();
        dog.eat();   // compile ederken hata oluşmasada execyte ederken hata veriyor.
                     // çünkü ilk nesneyi oluştururken parent class nesnesini child
                     // class olmaya zorlamak gerekiyor. PARENT nesnesi CHILD gibi davranmalı.

        Animal animal1 =new Dog();
        Dog dog1=(Dog) animal1;
        dog1.eat();
        animal1.eat();
        System.out.println(((Dog) animal1).disSayisi);
        ((Dog) animal1).speed();


    }
}

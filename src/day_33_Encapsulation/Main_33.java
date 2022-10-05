package day_33_Encapsulation;

public class Main_33 {
    public static void main(String[] args) {
//        Person person = new Person("alp");
//        System.out.println(person.id);
//        Dog dog=new Dog();
//        dog.setName("Karabas");
//        System.out.println(dog.getName());
//        dog.setName("paşa");
//        System.out.println(dog.getName());
//        System.out.println(dog.isBlack);
//        dog.isBlack=true;
//        System.out.println(dog.isBlack);
//        dog.setBreed("sivas");
//        System.out.println(dog.getBreed());

       // Circle circle_1=new Circle(5);
        //circle_1.setRadius(12);
        //System.out.println(circle_1.getRadius());
        //System.out.println(circle_1.circleArea());
        //System.out.println(Circle.circleArea(8));
        KraftBankCustomer_2 enes=new KraftBankCustomer_2(1234,"enes yılmaz",false);
        System.out.println(enes.getCustomerToken());
        enes.setCustomerFullName("1234en13","enes şahin");
        System.out.println(enes.getCustomerFullName());
        enes.setCustomerFullName("1234en12","enes şahin");
        System.out.println(enes.getCustomerFullName());
        enes.addMoney(500);
        enes.setIsSms(true);

    }



}

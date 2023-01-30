package day_35_challenge;

public class Truck extends Vehicle{
    // Truck is a vehicle
    int carriyingCapasity;

    public void carriying (){
        System.out.println(color+" "+type+" "+carriyingCapasity+ " kg yük taşır");
    }
    public String toString() {
        return "Truck{" +
                "carriyingCapasity=" + carriyingCapasity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

package day_35_challenge;

public class Minibus extends Vehicle{
    // Minibus is a vehicle
    int seat;

    public void using(){
        System.out.println(color+" "+type+" "+seat+" "+" yolcu taşır");
    }
    public String toString() {
        return "Minibus{" +
                "seat=" + seat +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

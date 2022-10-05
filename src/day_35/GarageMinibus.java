package day_35;

public class GarageMinibus {
    public static void main(String[] args) {
        Minibus minibus=new Minibus();
        minibus.type="minibus";
        minibus.color="mavi";
        minibus.seat=14;
        minibus.sellPriceWithTax(50000);
        minibus.using();
        minibus.toString();

    }
}class GarageTruck{
    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.carriyingCapasity=16000;
        truck.type="kamyon";
        truck.color="kırmızı";
        truck.sellPriceWithTax(120000);

        truck.carriying();
        truck.toString();
    }

}

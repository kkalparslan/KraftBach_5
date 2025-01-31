package Day_17_Class_And_Object;

public class Car {
    public String marka;
    public String model;
    public String renk;
    public int hiz;
    public double motorHacim;

    public void calistir() {
        System.out.println("araç çalıştırıldı");
    }

    public void hizlan() {
        System.out.println("tamam ama araç zaten 5. viteste");
    }

    public void dur() {
        System.out.println("araç durduruldu");
    }
}

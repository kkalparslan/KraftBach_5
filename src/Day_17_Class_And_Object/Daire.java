package Day_17_Class_And_Object;

public class Daire {
    final double PI = 3.14;
    int cap;

    public double alanHesapla() {
        int yariCap = cap / 2;
        double sonuc = PI * yariCap * yariCap;
        return sonuc;
    }

    public double cevreHesapla() {
        int yariCap = cap / 2;
        double sonuc = 2 * PI * yariCap;
        return sonuc;
    }
}

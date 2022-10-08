package day_53_Map;

public class Manav {

        private String meyveAdi;
        private double fiyat;

    public Manav(String meyveAdi, double fiyat) {
        this.meyveAdi = meyveAdi;
        this.fiyat = fiyat;
    }

    public String getMeyveAdi() {
        return meyveAdi;
    }

    public void setMeyveAdi(String meyveAdi) {
        this.meyveAdi = meyveAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    public void fiyatArttir(int miktar){
        this.fiyat+=miktar;
    }
}

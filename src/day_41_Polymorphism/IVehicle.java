package day_41_Polymorphism;

public interface IVehicle {
    int tekerSayisi=4;
    void start();
    void stop();
    int durmaMesafesi();
    default int tekerSayisi(){
        return tekerSayisi;
    }

}

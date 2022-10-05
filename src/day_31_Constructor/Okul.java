package day_31_Constructor;

public class Okul {
    String renk;
    int kapasite;
    int sinifAdedi;
//    public Okul(){
//    }
//    public Okul(String renk){
//        this.renk=renk;
//    }
//    public Okul(String renk, int kapasite) {
//        this.renk = renk;
//        this.kapasite=kapasite;
//    }
//    public Okul(String renk, int kapasite, int sinifAdedi) {
//        this.renk = renk;
//        this.kapasite=kapasite;
//        this.sinifAdedi=sinifAdedi;
//    }
//    public void kapasiteKontrol(){
//        if(this.kapasite>500){
//            System.out.println("kapasite aşılmıştır");
//
//        }else{
//            System.out.println("kapasite aşılmasına "+(500-this.kapasite)+ " kişi kalmıştır");
//
//        }
//    }
public Okul(){
    System.out.println("parametresiz constructor çalışıyor ");
}

    public Okul(String renk){
    this();
        System.out.println("1 parametreli constructor çalışıyor");
        this.renk=renk;
    }
    public Okul(String renk, int kapasite) {
        this("pembe");
        System.out.println("2 parametreli cons. çalışıyor");
        this.renk = renk;
        this.kapasite=kapasite;
    }
    public Okul(String renk, int kapasite, int sinifAdedi) {
        this.renk = renk;
        this.kapasite=kapasite;
        this.sinifAdedi=sinifAdedi;
    }
    public void kapasiteKontrol() {
        if (this.kapasite > 500) {
            System.out.println("kapasite aşılmıştır");
            this.kapasite=0;

        } else {
            System.out.println("kapasite aşılmasına " + (500 - this.kapasite) + " kişi kalmıştır");
            this.kapasite=kapasite;

        }
    }


}

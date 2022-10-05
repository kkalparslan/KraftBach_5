package day_31_Constructor;
import Day_17_Class_And_Object.Car;
public class Constructor_Main {
    public static void main(String[] args) {
//        Car car=new Car();
//        car.model="mazda 3";
//        System.out.println(car.model);
//        System.out.println(car.hiz);
//        car.hizlan();
//        car.dur();

//        Flower flower=new Flower();
//        System.out.println(flower.renk);
//        flower.renk="kırmızı";
//        System.out.println(flower.renk);
//        flower.setRenk("sarı");
//        System.out.println(flower.renk);
        //Flower flower=new Flower("mavi",34,true);

//        Flower flower_1=new Flower();
//        Flower flower_2=new Flower("mavi");
//        Flower flower_3=new Flower("yesil",34);
//        Flower flower_4=new Flower("beyaz",44, true);
//
//        System.out.print(" "+flower_1.renk);
//        System.out.print(" "+flower_1.boy);
//        System.out.println(" "+flower_1.diken);
//
//        System.out.print(" "+flower_2.renk);
//        System.out.print(" "+flower_2.boy);
//        System.out.println(" "+flower_2.diken);
//
//        System.out.print(" "+flower_3.renk);
//        System.out.print(" "+flower_3.boy);
//        System.out.println(" "+flower_3.diken);
//
//        System.out.print(" "+flower_4.renk);
//        System.out.print(" "+flower_4.boy);
//        System.out.println(" "+flower_4.diken);


  //        Okul pursaklarFenLisesi=new Okul();
          Okul veyselTiryaki=new Okul("pembe",550);
        Okul keskinIlkOkulu=new Okul("beyaz", 450,45);
        System.out.println(veyselTiryaki.kapasite);
        veyselTiryaki.kapasiteKontrol();
        System.out.println(veyselTiryaki.renk);
        System.out.println(keskinIlkOkulu.kapasite);
        System.out.println(keskinIlkOkulu.renk);
        keskinIlkOkulu.kapasiteKontrol();


    }



}

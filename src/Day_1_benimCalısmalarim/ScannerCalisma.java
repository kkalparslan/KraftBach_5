package Day_1_benimCalısmalarim;

import java.util.Scanner;

public class ScannerCalisma {
    //dışardan kimya dersi için alin'nin quiz,yarıfinal ve final notlarını alınız
    //Ortalamayı: quiz %20, yarı final notu %30, final notu ise %50
    // etkilediğine göre yıl sonu kimya notu nedir?
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a="alparslan";
        System.out.println("lütfen adınızı giriniz");
        String b=scan.nextLine();
        boolean c=a.equals(b); // string değerlerde eşitlik kontrolü == operatörü
                               // ile yapılmaz equals() metodu ile kontrol edilir...
        System.out.println(c);
//        System.out.println("lütfen kimya notlarınızı giriniz");
//        System.out.print("quiz: ");
//        double quizNotu= scan.nextDouble();
//        System.out.print("yarı final: ");
//        double yariFinalNotu=scan.nextDouble();
//        System.out.print("final: ");
//        double finalNotu=scan.nextDouble();
//        double ortalama= ((quizNotu)*0.2)+(yariFinalNotu*0.3)+(finalNotu*0.5);
//        System.out.println("ortalama = " + ortalama);

//        Örnek: Ali fizik dersinden 92, kimya dersinden 55, matematik dersinden 89
//        almıştır. Bu değerleri konsoldan kullanıcıya girdirin.
//        1-Ortalama sınıf geçme notu 80 ve üzeri olduğuna göre Ali’nin sınıfı geçti ise
//        ekrana true geçmedi ise false yazdırın.
//        2-Ali’nin ortalama notu 80 ise ekrana true değil ise false yazdırın.
//        3-Ali’nin ortalama notu 80'e eşit değil ise false eşit ise true yazdırın.
//        ***** maddeler birbirine benziyor iki işlem kontrol ettirdim *****
//        System.out.println("fizik, kimya ve matematik ders notlarını giriniz");
//        System.out.print("fizik: ");
//        int fizik=scan.nextInt();
//        System.out.print("kimya: ");
//        int kimya=scan.nextInt();
//        System.out.print("matematik: ");
//        int matematik=scan.nextInt();
//        boolean sinifGecme=(fizik+kimya+matematik)/3>=80;
//        System.out.println("1- sinifGecme = " + sinifGecme);
//        boolean aliOrt=(fizik+kimya+matematik)/3==80;
//        System.out.println("2- aliOrt = " + aliOrt);


        // Örnek: Kullanıcıdan 2 sayı alın biribirine eşit ise true değil ise false yazdırın.
//        System.out.println("ilk sayıyı giriniz");
//        int a=scan.nextInt();
//        System.out.println("ikinci sayıyı giriniz");
//        int b=scan.nextInt();
//        boolean c=a==b;
//        System.out.println(c);

//        Örnek: Kullanıcıdan 2 sayı alın ilk sayı 2. sayıdan büyük ve eşit ise true değil
//        ise false yazdırın.
//        System.out.println("ilk sayıyı giriniz");
//        int a=scan.nextInt();
//        System.out.println("ikinci sayıyı giriniz");
//        int b=scan.nextInt();
//        boolean c=(a>=b);
//        System.out.println(c);
//        int max=(a>=b)? a: b;
//        System.out.println(max);




//        Ödev: Scanner sınıfını kullanarak kullanıcıdan 10 ile 100 arasında bir rakam aldırın;
//        Bu sayıyı operatör kullanarak 5 ile çarpın;
//        Çıkan sonucu operatör kullanarak 2 ye bölün;
//        Çıkan sonucu operatör kullanarak 1 arttırın;
//        Çıkan sonucu operatör kullanarak 4 e göre modunu alın;
//        Çıkan sonucu operatör kullanarak 1 azaltın;
//        Çıkan sonucu ekrana yazdırın









//        Ödev:
//        Kullanıcıdan double araba fiyatı ,KDV , ÖTV oranını alın. Araba fiyatı üzerinden KDV miktarını
//        hesaplayın . Hesapladığınız toplam tutar (araba +KDV miktarı) üzerinden ÖTV oranındaki artışı
//        toplam tutara ekleyerek hesaplayın. Çıkan sonuç 700.000 ve üzeri ile 1.000.000 (bir milyon)
//        arasında ise ekrana true yazdırın;


//        Ödev:
//        Scanner sınıfını kullanarak kullanıcıdan önce String türünde kullanıcının ismini alın ardından
//        double türünde 0-100 arasında 3 sayı alın ;
//        Bu verileri kullanarak
//        1. Ortalama 70 ile 80 arasında ise ekrana true;
//        2. Ortalama 80 ve üzeri ile 90 arasında ise false;
//        3. 90 ve üzeri 100 arasında ise true;
//        4. Tam 100 ise ekrana false yazdırın


    }

}

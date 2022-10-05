package Day_17_Class_And_Object;

import java.util.Random;
import java.util.Scanner;

public class Banka {
    int hesapNo;
    String musteriAdSoyad;
    double paraMiktari;
    boolean mobilBankacilik;


    public void hesapAc() {
        Scanner scan = new Scanner(System.in);
        System.out.print("isim: ");
        musteriAdSoyad = scan.nextLine();
        Random random = new Random();
        hesapNo = random.nextInt(100000);
        System.out.println(musteriAdSoyad + " " + hesapNo + " nolu hesabınız başarı ile oluşturulmuştur.");

    }

    public void mobilBankacilikOnay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("mobil bankacılık kullanmak için lütfen evet yazınız");
        String onay= scan.next();
        if(onay.equals("evet")|| onay.equals("Evet")|| onay.equals("EVET")){
            mobilBankacilik=true;
            System.out.println("sayın "+ musteriAdSoyad+ " mobil bankacılığı kullanabilirsiniz.");
        }else{
            System.out.println(" sayın "+musteriAdSoyad+ " mobil bankacılığa giriş yapamazsınız");
        }
    }
    public void paraYatir(double para){
        paraMiktari+=para;
    }
    public void hesapOzeti(){
        System.out.println(musteriAdSoyad+" "+hesapNo+ " nolu hesabınızda "+paraMiktari+ " dolar vardır");
    }



    }








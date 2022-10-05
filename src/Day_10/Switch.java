package Day_10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        /*System.out.println("kaçıncı ay");
        int numOfMonth = scan.nextInt();

        switch (numOfMonth) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("böyle bir ay yoktur");
        }


        System.out.println("hangi gün");
        int numOfDay = scan.nextInt();

        switch (numOfDay) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
            default:*/

        //int a = scan.nextInt();
        /*System.out.println("kaç beden istiyorsun");

        int num= scan.nextInt();
        switch(num){
            case 38:
                System.out.println("bir small bedendir");
                break;
            case 40:
                System.out.println("bir small bedendir");
                break;
            case 42:
                System.out.println("bir small bedendir");
                break;
            case 44:
                System.out.println("bu bir medium bedendir");
                break;
            case 46:
                System.out.println(" bu bir medium bedendir");
                break;
            case 48:
                System.out.println("bu bir medium bedendir");
                break;
            case 50:
                System.out.println("bu bir large bedendir");
                break;
            case 52:
                System.out.println("bu bir large bedendir");
                break;
            case 54:
                System.out.println("bu bir large bedendir");
                break;
            default:
                System.out.println("bu boy bedenimiz yoktur");

        Scanner scan = new Scanner(System.in);
        System.out.println("Hesap makinesi hazır");

        int num1 = scan.nextInt();
        scan.nextLine();
        String aritmetik = scan.nextLine();
        int num2 = scan.nextInt();

        int sonuc = 0;

        switch (aritmetik) {
            case "+":
                sonuc = num1 + num2;
                System.out.println("sonuc :" + sonuc);
                break;
            case "-":
                sonuc = num1 - num2;
                System.out.println("sonuc :" + sonuc);
                break;
            case "*":
                sonuc = num1 * num2;
                System.out.println("sonuc :" + sonuc);
                break;
            case "/":
                sonuc = num1 / num2;
                System.out.println("sonuc :" + sonuc);
                break;
            default:
        System.out.println(" girdiğiniz işlem yanlıştır");

        }*/

        /*3 katlı bir motel in
        1. katında Resepsion, Güvenlik ve Oda hizmetler var.
        2 katında Yemekhane, Dinlenme salonu ve Room1,Room2
        3.katında ise Room3,Room4,Room5,Room6 vardır.
                Bir switch yapısı ile otel katlarını ve oda isimlerini girerek tanıtım alacagınız bir program(nested
        switch) yazın. Tanıtım bilgileri için aşağıdakileri kullanabilirsiniz.
                message 1 : lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.
        message 2 : 1.kat : Resepsion-Güvenlik-Oda hizmetleri
        2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
        3.kat : Room3-Room4-Room5-Room6
        Resepsion : tüm işlemleriniz için bekleriz
        Güvenlik : profosyonel bir hizmettir
        Oda hizmetleri : temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz
        Yemekhane : Kahvaltı 08-11
        Öğle yemeği 12-15
        Akşam yemeği 18-21
        Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir
        Room1,Room2 : ekonomik oda
        Room3,Room4 : standart oda
        Room5,Room6 : özel oda*/

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.");
        System.out.println("1.kat : Resepsion-Güvenlik-Oda hizmetleri\n2.kat : Yemekhane-Dinlenme salonu-Room1-Room2\n3.kat : Room3-Room4-Room5-Room6 ");

        int kat = scan.nextInt();
        scan.nextLine();
        String secim = scan.nextLine();

        switch (kat) {
            case 1:
                switch (secim) {
                    case "Resepsiyon":
                        System.out.println("tüm işlemleriniz için bekleriz");
                        break;
                    case "Güvenlik":
                        System.out.println("profosyonel bir hizmettir");
                        break;
                    case "Oda hizmetleri":
                        System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                        break;
                    default:
                        System.out.println("bu katta böyle bir odamız bulunmamaktadır");
                }
                break;

            case 2:
                switch (secim) {
                    case "Yemekhane":
                        System.out.println("Kahvaltı 08-11\nÖğle yemeği 12-15\nAkşam yemeği 18-21");
                        break;
                    case "Dinlenme salonu":
                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case "Room1":
                        System.out.println("ekonomik oda");
                        break;
                    case "Room2":
                        System.out.println("ekonomik oda");
                        break;
                    default:
                        System.out.println("bu katta böyle bir odamız bulunmamaktadır");
                }
                break;
            case 3:
                switch (secim) {
                    case "Room3":
                        System.out.println("ekonomik oda");
                        break;
                    case "Room4":
                        System.out.println("ekonomik oda");
                        break;
                    case "Room5":
                        System.out.println("özel oda");
                        break;
                    case "Room6":
                        System.out.println("özel oda");
                        break;
                    default:
                        System.out.println("bu katta böyle bir odamız bulunmamaktadır");
                        }
                break;
            default:
                System.out.println("otelimiz üç katlıdır");


        }


    }
}

































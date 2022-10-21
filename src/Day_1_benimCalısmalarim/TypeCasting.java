package Day_1_benimCalısmalarim;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {


//        int a=10;
//        int b=20;
//        String str = "Hİ";
//        String str2 = "";
//
//        System.out.println(a+b+str);
//        System.out.println("--------------");
//        System.out.println(str+a+b);
//        System.out.println("--------------");
//        System.out.println(a+str2+b);
//        System.out.println("--------------");
//        System.out.println(str2+b+a);
//        System.out.println("--------------");
//        System.out.println(b+a+b+str2);


        // 300 fahrenheit kaç celsius dur( c=(f-32)/1.8
        // C=(f-32)/1.8
        // C= (300-32)/1.8
        // C= 268/1.8

//        double fahrenheit=300;
//        double celcius=(fahrenheit-32)/1.8;
//
//        System.out.println("celcius = " + celcius);

        // otel sorusu:-------benim çözüm. her dış case in bir break i ve bir default u var.
        // iç case lerin ise break leri var. // mesajlar ve konsol girdileri hariç tüm bilgiler
        // dış switchin içinde..// dış case lerin herbirinin altında da seçim yaptıran bir iç switch var..
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat \n numarası girin ve oda adı seçin");
        System.out.println("1.kat : Resepsion-Güvenlik-Oda hizmetleri,\n2.kat : Yemekhane-Dinlenme salonu-Room1-Room2," +
                "\n3.kat : Room3-Room4-Room5-Room6");
        int katNo = scan.nextInt();
        scan.nextLine();
        String secim = scan.nextLine();




        switch (katNo) {
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
            case 2: // ,  ve
                switch (secim) {
                    case "Yemekhane":
                        System.out.println("Kahvaltı 08-11\n" +
                                "//        Öğle yemeği 12-15\n" +
                                "//        Akşam yemeği 18-21");
                        break;
                    case "Dinlenme salonu":
                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case "Room1,Room2":
                        System.out.println("ekonomik oda");
                        break;
                    default:
                        System.out.println("bu katta böyle bir odamız bulunmamaktadır");
                }
                break;
            case 3:
                switch (secim) {
                    case "Room3,Room4":
                        System.out.println("standart oda");
                        break;
                    case "Room5,Room6":
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



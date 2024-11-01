package Day_1_BenimCalismalarim;

import java.util.*;

public class InterviewSorulari {
    public static void main(String[] args) {


        //String str= "samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',20916,samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995,samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970,samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A DAMPER SHOCK',29981,samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000,samsung,'Samsung DC97-16991A Assembly Filter',13000";
        /*String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2," +
                "WA48J7700AW/AA',20916,samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With" +
                "WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995,samsung, 'SAMSUNG Washing Machine Spring" +
                "Hanger, DC61-01257M', 22970,samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A" +
                "DAMPER SHOCK',29981,samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe" +
                "-MP#GH4498 349Y49HBRG9109150',52000,samsung,'Samsung DC97-16991A Assembly Filter',13000";
        String[] s = str.split("samsung,'");
        System.out.println("s.length = " + s.length);
        Map<String, String>map=new TreeMap<>();

        for (int i = 1; i < s.length; i++) {
            String[] s1=s [i].split("',");
            map.put(s1[1].replace(",",""), s1[0]);
        }
        map.forEach((k,v)-> System.out.println(v+" "+k));

/*
String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916," +
                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995," +
                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
                "samsung,'Samsung DC97-17022B Assy Detergent', 32959," +
                "samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981," +
                "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000," +
                "samsung,'Samsung DC97-16991A Assembly Filter', 13000";


                String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916," +
                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995," +
                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
                "samsung,'Samsung DC97-17022B Assy Detergent', 32959," +
                "samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981," +
                "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000," +
                "samsung,'Samsung DC97-16991A Assembly Filter', 13000";

                String strArray[]=str.split("samsung,'");
        Map<Integer,String> strMap=new TreeMap<>();

        for (int i = 1; i < strArray.length ; i++) {
            String[]  array=strArray[i].split("',");
            strMap.put(Integer.parseInt(array[1].replace(",","").replace(" ","")),array[0]);
        }

        strMap.forEach((k,v)-> System.out.println("samsung,'"+v+"' "+k*1.25));

        int x=10;
        int y=20;
       // int z=x;
        x=y;
       // y=z;
        System.out.println(x+" "+y);
*/














       /* Problem statement:-

                Input string( it is a single string, you can take input as param , from file or any possible way):-

                samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2,
                WA48J7700AW/AA',20916,samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With
                WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995,samsung, 'SAMSUNG Washing Machine Spring
                Hanger, DC61-01257M', 22970,samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A
                 DAMPER SHOCK',29981,samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe
                 -MP#GH4498 349Y49HBRG9109150',52000,samsung,'Samsung DC97-16991A Assembly Filter',13000


        Output ( output is sorted by price. Console output/file output anything will works):-

                samsung,'Samsung DC97-16991A Assembly Filter',13000
        samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2,
        WA48J7700AW/AA',20916
        samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970
        samsung,'Samsung DC66-00470A DAMPER SHOCK',29981
        samsung,'Samsung DC97-17022B Assy Detergent',32959
        samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000
        samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4,
        WA52M7750AW, WA52M7750AW/A4',91995


        İnput da verilen string içerisindeki bilgiyi handle edilerek (ücret bilgisine göre sıralayacaksınız) output daki
         çıktıyı vermeniz bekleniyor


         Yurt dışı firmalarında İnterview den önce size java ve otomasyon dan oluşan 10 soru soruluyor (firmalara göre
         değişiyor ) 4-5 adet çoktan seçmeli kolaydan zora 2-3 adet java 2-3 adet otomasyon 1-2 adet sdlc sorusu. Toplam
         süre 1-1,5 saat . Buradaki başarı derecenize göre geri dönüş yapıyorlar. Dönüş yaptıktan sonra size otomasyon
         için farklı bir task veriyor. Bu taskın süresi 2 ila 4 gün arasında değişiyor. Sonrasında hazırladığınız
         framework’ü sunmak adına interview planlanıyor. Bu interview’e göre bazı firmalar bir üst yetkili ile tanışma
         toplantısı yapılıyor. Sonrasında ise offer alıyorsunuz.  kursun sonlarında ne demek istediğimi daha iyi
         anlayacaksınız. Bu soruda bu tür sorulardan biri. Kısacası bu soru için max süre 30 dk. 14.10.2022 17:00 a
         kadar cevapları bekliyorum


         hocanın cevabı aşağıda;



         String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916," +
                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995," +
                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
                "samsung,'Samsung DC97-17022B Assy Detergent', 32959," +
                "samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981," +
                "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000," +
                "samsung,'Samsung DC97-16991A Assembly Filter', 13000";


        String strArray[]=str.split("samsung,'");
        Map<Integer,String> strMap=new TreeMap<>();

        for (int i = 1; i < strArray.length ; i++) {
            String[]  array=strArray[i].split("',");
            strMap.put(Integer.parseInt(array[1].replace(",","").replace(" ","")),array[0]);

        }

        strMap.forEach((k,v)-> System.out.println("samsung,'"+v+"' "+k*1.25));


    }

        */






    }
}

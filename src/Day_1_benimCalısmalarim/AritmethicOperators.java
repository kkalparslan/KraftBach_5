package Day_1_benimCalısmalarim;

public class AritmethicOperators {
    public static void main(String[] args) {
        // sıra, koltuk, bos koltuk, vs sorusu;

        int sira=15;
        int koltuk=12;
        int kisi=113;
        int kapasite=sira*koltuk;
        System.out.println("kapasite = " + kapasite);
        int bosKoltuk=kapasite-kisi;
        System.out.println("bosKoltuk = " + bosKoltuk);

        int count=0;
        for (int i = 1; i <=113 ; i++) {
            if(i%12==0){
                count++;
            }
        }
        System.out.println("count = " + count);
        int siraAdet=count+1;
        System.out.println("siraAdet = " + siraAdet);
        int tamamenBos=sira-siraAdet;
        System.out.println("tamamenBos = " + tamamenBos);
        int oturulanSiradaBosKoltuk=12-(kisi%koltuk);
        System.out.println("oturulanSiradaBosKoltuk = " + oturulanSiradaBosKoltuk);

        System.out.println("------------------------------------");

        // 31502 saniye kaç sat kaç dakika kaç saniyedir?
        int toplamSaniye=31502;
        int saat=toplamSaniye/3600;
        System.out.println("saat = " + saat);
        int dakika=(toplamSaniye-saat*3600)/60;
        System.out.println("dakika = " + dakika);
        int saniye=toplamSaniye-((saat*3600)+(dakika*60));
        System.out.println("saniye = " + saniye);

        System.out.println("--------------------------------------");





    }

}

package day_48_Exception_Example;

public class Throws_Example {
    public static void main(String[] args) {
    }
    private static void a_metodu(){  // bir exception söz konusu ise ya
        // handle edilmeli yada declare (throw) edilmelidir. throw edilince bu metodu kullanan sınıf handle etmelidir.
        // aksi takdirde kendi eksiklikleri giderilmiş olsa da handle edilene kadar hata vermeye devam edecektir.
        b_metodu();
    }
    private static void b_metodu(){
        try {
            c_metodu();
        }catch (Exception e){
            e.printStackTrace();
        }
        }
    private static void c_metodu() throws InterruptedException {
        d_metodu();
    }
    private static void d_metodu() throws InterruptedException {
        Thread.sleep(3000);
    }
}

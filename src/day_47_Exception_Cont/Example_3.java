package day_47_Exception_Cont;

public class Example_3 {
    public static void main(String[] args) {
        // personel işlerini tutan bir array tanımlayın ve içerisine 5
        // adet integer türünde id gönderin. bu id lerin içerisinde 0 var ise
        // illegal argümant exception hatası döndürün. bunu bir checkArrayId
        // metodunun içerisinde yapın. true veya false return edebilir yada 0
        // veya 1 döndürebilirsinizsiniz

        int arr []={5, 3, 5, 8, 10};
      //  System.out.println(checkArrayId(arr)); // aşağıdaki try bloğu olmadan da sadece
        //  metodu çağırarak işlem yapabiliriz. ancak try catch bloğu il handle etmiş oluyoruz.

        try {
            System.out.println(checkArrayId(arr));
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("uygun olmayan personel ıd tespit edildi");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("bilinmeyen hata taspit edildi");
        }
        System.out.println("programa devam ediliyor");

    }
    public static boolean checkArrayId(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                throw new IllegalArgumentException("personel ID 0 olamaz");
            }
        }return true;
    }




}

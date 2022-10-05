package day_32_Constructor_Cont;

public class Pencil {
//    Örnek-2
//    Pencil adında bir class oluşturun, color, lenght, haveEraser adında fields tanımlayın,
//            constructors (4 adet) , write ve delete metodları oluşturarak main metodunda bu class dan
//bir obje oluşturun.(this() metodu kullanılacak)
    public String color;
    public int length;
    public boolean haveEraser;

    public Pencil (){
        }
    public Pencil (String color){
        this.color=color;
    }
    public Pencil (String color, int length){
        this.color=color;
        this.length=length;
    }
    public Pencil (String color, int length, boolean haveEraser){
        this.color=color;
        this.length=length;
        this.haveEraser=haveEraser;
    }
    public void write(){
        System.out.println("kalem yazmaya başladı");
    }
    public void delete(){
        if(this.haveEraser){
            System.out.println("silme işlemi başarılı");
        }else{
            System.out.println("silme işlemi başarısız");
        }
    }

}

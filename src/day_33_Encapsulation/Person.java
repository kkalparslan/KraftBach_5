package day_33_Encapsulation;

public class Person {
    public String name;
    public int id;

    // CONSTRUCTOR:
    // 1. ismi sınıf ismi ile aynı olmalıdır
    // 2. return type yok
    // 3. oluşturulmaz ise boş olarak atama yapıyor
    // 4. sınıfın özel bir metodudur
    // 5. ilk oluşturma esnasında consructor çağırılır

    private Person(){
        this.id=5000;
    }
    public Person(String name){
        this();
        this.name=name;
    }

}

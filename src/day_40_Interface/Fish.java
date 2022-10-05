package day_40_Interface;

public class Fish implements Animal, Food{  // multi inheritance
// Animal classına implement olmasa bile her
// iki metodu da implement yapmak zorundadır.
// çünkü hıyerarşik olarak bağlı
    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}
    class Chicken implements Food {  // chicken classı hiyerarşik olarak
    // iki interface e de
    // bağlı olduğu için tüm abstract metotların
    // implementasyonlarını yapmak zorunda kaldı
    @Override
    public void meal() {

    }

    @Override
    public void hunt() {

    }
}


package day_32_Constructor_Cont;

public class Day_32_Main {
    public static void main(String[] args) {
//        Square square_1=new Square();
//        square_1.sideLength=5;
//        System.out.println(square_1.calculateArea());
//        System.out.println(square_1.calculatePerimeter());
//        System.out.println(".............................");
//        Square square_2=new Square(8);
//        System.out.println(square_2.calculateArea());
//        System.out.println(square_2.calculatePerimeter());
//        System.out.println(Square.calculatePerimeter(15));
//        System.out.println(Square.calculateArea(15));

//        Pencil benimKalemim=new Pencil("sari",7, false);
//        System.out.println(benimKalemim.length);
//        System.out.println(benimKalemim.haveEraser);
//        System.out.println(benimKalemim.color);
//        benimKalemim.write();
//        benimKalemim.delete();


//        Cat efe=new Cat("yeşil","sokak kedisi", true, false);
//        Cat minnos=new Cat("mavi","ankara",false,true);
//        Cat pamuk=new Cat("kahverengi", "van", false, true);
//        System.out.println(pamuk.eyeColor);
//        System.out.println(pamuk.food());
//        System.out.println(pamuk.run());
//        pamuk.sleep();
//        System.out.println(minnos.eyeColor);
//        System.out.println(minnos.isFat);
//        minnos.sleep();
//        System.out.println(minnos.food());


        KraftBankCustomer enes=new KraftBankCustomer(852369,"Enes Yaman",true);
//        System.out.println(enes.customerToken);
//        System.out.println(enes.customerAccount);
//        enes.addMoney(2000);
//        System.out.println(enes.customerAccount);
//        System.out.println(enes.customerFullName);
//        System.out.println(enes.customerId);
//        System.out.println(enes.isSms);
//        enes.addMoney(1700);
//        System.out.println(enes.customerAccount);
//        changeFullName(enes, "enes yılmaz");
//        System.out.println(enes.customerFullName);
        String [] str= changeFullName(enes,"enes kömür").split(" ");
        System.out.println("kullanıcının soy ismi: "+str[1]);
        System.out.println("kullanıcının full ismi: "+enes.customerFullName);

    }
//    public static KraftBankCustomer changeFullName(KraftBankCustomer kraftBankCustomer, String fullName){
//        kraftBankCustomer.customerFullName=fullName;
//        return kraftBankCustomer;
//    }
    public static String changeFullName(KraftBankCustomer kraftBankCustomer, String fullName) {
        kraftBankCustomer.customerFullName = fullName;
        return fullName;
    }


}

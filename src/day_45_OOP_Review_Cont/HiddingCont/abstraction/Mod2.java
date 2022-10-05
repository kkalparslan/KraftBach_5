package day_45_OOP_Review_Cont.HiddingCont.abstraction;
public class Mod2 extends D3Print{
    public Mod2(String model, String fileFormat) {
        super(model, fileFormat);
        extrude();
        System.out.println(fileFormatCheck());
        if (fileFormat.equals("OBJ")){
            polish();
        }else {
            fileFormatCheck();
        }
    }
    @Override
    public void extrude() {
        System.out.println("printing a "+model+ " with "+fileFormat+" file format");
    }
    @Override
    public void polish() {
        System.out.println(model+" is polishing");
    }
}

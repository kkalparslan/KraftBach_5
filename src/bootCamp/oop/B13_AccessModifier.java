package bootCamp.oop;

public class B13_AccessModifier {
    // private: visible/reachable only within class
    // protected: visible/reachable in same package
         // and reachable outside if there is inheritance
    // default: reachable in same package
    // public: reachable everywhere

    // **private constructor role**
    // you can create the instance out of class..bir classtan
    // nesne üretilmesini istemiyorsak constructoru private yapmalıyız
   // Restricted s=new Restricted(); you can not create an object from private constructor
}
class Restricted{
    private Restricted(){

    }
}

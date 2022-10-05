package day_42_OOP_Review;
public class Daire {
    private static final double PI=3.14;
    private double radius;
    Daire(){}
    Daire(int radius){
       this.radius=radius;
    }
        public void setRadıus(double radius){
        if(radius>0){
            this.radius=radius;
        }else {
            System.out.println("radius 0 ve 0 dan küçük olamaz");
        }
    }
    public double getRadius(){
        return this.radius;
    }
    public double alan(){
        return PI*Math.pow(radius,2);
    }
    public double cevre(){
        return 2*PI*this.radius;
    }
    public static double alan(double radius){
        return PI*radius*radius;
    }
    public static double cevre(double radius){
        return 2*PI*radius;
    }
}

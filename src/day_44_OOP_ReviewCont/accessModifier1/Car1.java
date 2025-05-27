package day_44_OOP_ReviewCont.accessModifier1;

public class Car1 {
    String model;
    public int year;
    private int door;
    protected double engine;

    void method1() {
    }

    public void method2() {
    }

    private void method3() {
    }

    protected void method4() {
    }

    @Override  // override üzerine yazmak demek
    public String toString() {
        return "Car1{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }

    public Car1() {
    }

    public Car1(String model, int year, int door, double engine) {
        this.model = model;
        this.year = year;
        this.door = door;
        this.engine = engine;
    }
}

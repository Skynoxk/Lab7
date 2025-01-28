package Ex1;

public abstract class Shape {
    double area;
    abstract double calculateArea();
    void display(){
        System.out.println("Area: " + area);
    }
    void testing() {
        System.out.println("Testing");
    }
}

package Ex1;

public class Circle extends Shape {
    int radius;
    Circle (int radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea (){
        area = 3.1415 * radius * radius;
        return area ;
    }
   @Override
    void display(){
        System.out.println( "The area of circle is : " + area);
    }
}
package Ex1;

public class rectangle extends Shape {
    int width;
    int height;
    rectangle ( int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea (){
        area = width * height ;
        return area;
    }
    @Override
    void display() {
        System.out.println("THis is the area of rectangle : " + area);
    }
    
}
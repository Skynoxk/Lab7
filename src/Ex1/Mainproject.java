package Ex1;

public class Mainproject {
    public static void main(String[] args) {
        // List<Shape> list = new ArrayList<>();
        Circle myshape = new Circle(4);
        // list.add(myshape);
        // list.add(new Circle(12));
        // for (Shape shape : list ){
        //     shape.calculateArea();
        //     shape.display();
        // }
        myshape.calculateArea();
        myshape.display();

        Shape r = new rectangle(32, 32);
        r.calculateArea();
        r.display();
    }
}
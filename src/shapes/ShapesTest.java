package shapes;
//Modify your ShapesTest class, use it to:
//
//        declare a variable of the type Measurable named myShape.
//        Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and circumference.

public class ShapesTest {

    public static void main(String[] args) {
        Measurable box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
//
        Measurable myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());



//        Rectangle box1 = new Rectangle(5, 4);
//        //Rectangle dimensionsOf = new Rectangle(4,10);
//        System.out.println(box1.toString());
//
//        Rectangle box2 = new Square(5);
////        Rectangle areaOf = new Rectangle(4, 10);
//        System.out.println(box2.toString());

    }
}

package shapes;

import org.w3c.dom.css.Rect;

//import java.util.Scanner;
public class Rectangle {

    //Rectangle has to 2 fields
        protected int length;
        protected int width;


    // the Rectangle class has one constructor
    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;

    }

    // the Rectangle class has two methods
    public int getArea()
    {
        return length * width;
    }

    public int getPerimeter()
    {
         return 2 * length + 2 * width;
    }


    // toString() method to print info of Rectangle
    public String toString()
    {
        return("Area of rectangle is: "+ getArea() + "\n" +
                "Perimeter of rectangle is:" + getPerimeter());

    }
// Extend class
//    class Square extends Rectangle {
//    //Override perimeter
//        public int getPerimeter() {
//        return 4 * side;
//    }
//    //Override area
//        public int getArea() {
//        return  side ^ 2;
//        }
//
//        // the Square subclass adds one more field
//        protected int side;
//
//        // the MountainBike subclass has one constructor
//        public Square(int side)
//        {
//            // invoking base-class(Rectangle) constructor
//            super(side, side);
//            this.side = side;
//        }
//
//        public String toString()
//        {
//            return (super.toString()+
//                    "\n side "+ this.side);
//        }
//    }

//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        //Rectangle dimensionsOf = new Rectangle(4,10);
//        System.out.println(box1.toString());
//
//        Rectangle box2 = new Rectangle(5,5);
////        Rectangle areaOf = new Rectangle(4, 10);
//        System.out.println(box2.toString());
//
//    }
}
//    create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//In the Square class, override the getArea and getPerimeter methods with the following definitions for a square

////        perimeter = 4 x side
////        area = side ^ 2
////        Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
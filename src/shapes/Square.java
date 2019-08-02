package shapes;
//
//// derived class

import shapes.Rectangle;
//Change your existing Square class to extend Quadrilateral.
//
//        Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.

    public class Square extends Quadrilateral {
        public Square(double side) {
            super(side, side);
        }

        //@Override
        public void setLength() {

        }

        //@Override
        public void setWidth() {

        }

    @Override
    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }
}
//        //Override perimeter
//        public int getPerimeter() {
//            return 4 * side;
//        }
//
//        //Override area
//        public int getArea() {
//            return side * side;
//        }
//
//        // the Square subclass adds one more field
//        protected int side;
//
//        // the Square subclass has one constructor
//        public Square(int side) {
//            // invoking base-class(Rectangle) constructor
//            super(side, side);
//            this.side = side;
//        }
//
//        public String toString() {
//            return ("Area of square is: " + getArea() + "\n" +
//                    "Perimeter of square is:" + getPerimeter());
//        }
//    }




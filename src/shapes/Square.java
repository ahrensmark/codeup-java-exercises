package shapes;
//
//// derived class

import shapes.Rectangle;

    class Square extends Rectangle {
        //Override perimeter
        public int getPerimeter() {
            return 4 * side;
        }
        //Override area
        public int getArea() {
            return  side ^ 2;
        }

        // the Square subclass adds one more field
        protected int side;

        // the MountainBike subclass has one constructor
        public Square(int side)
        {
            // invoking base-class(Rectangle) constructor
            super(side, side);
            this.side = side;
        }

        public String toString()
        {
            return (super.toString()+
                    "\n side "+ this.side);
        }
    }




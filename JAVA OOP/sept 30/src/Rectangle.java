public class Rectangle extends Shape {
    private double length;
    private double width;


    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + " which is also a Rectangle";
    }


    public static class Square extends Rectangle {

        private final double side;
        public Square(double side,String color){
            super(color);
            this.side=side;


        }

        public double area() {
            return side*side;
        }

        public double perimeter() {
            return side*4;
        }



        public String toString() {
            return super.toString() + " which is also a Square";
        }
    }

}
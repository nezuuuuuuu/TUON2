public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(double a, double b, String color) {
        super(color);
        this.a =a;
        this.b = b;
    }

    public Ellipse(String color) {
        super(color);
    }

    public double area() {
        return 3.14159*(a*b);
    }
    public double perimeter() {
        return 3.14159*(3*(a+b)-Math.sqrt((a+3*b)*(b+3*a)));
    }

    public String toString() {
        return super.toString() + " which is also an Ellipse";
    }



    public static class Circle extends Ellipse {
        private final double r;
        public Circle(double r,String color){
            super(color);
            this.r=r;

        }

        public double area() {
            return 3.14159*(r*r);
        }
        public double perimeter() {
            return 2*(3.14159)*r;
        }
        public String toString() {
            return super.toString() + " which is also a Circle";
        }





        // TODO implement Circle
    }
}
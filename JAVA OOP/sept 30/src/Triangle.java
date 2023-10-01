public class Triangle extends Shape {
    private double base;
    private double height;
    private double c;
    private double a;

    public Triangle(double a,double base,double c, double height,String color){
        super(color);
        this.a=a;
        this.c=c;
        this.base=base;
        this.height=height;

    }
    public Triangle(String color) {
        super(color);
    }
    public double area()
    {
        return 1*1.0/2*(base*height);
    }
    public double perimeter()
    {
        return a+base+c;
    }
    public String toString() {
        return super.toString() + " which is also a Triangle";
    }


    public static class EquilateralTriangle extends Triangle {
        private double side;
        public EquilateralTriangle(double side,String color) {
            super(color);
            this.side=side;
        }
        public EquilateralTriangle(String color) {
            super(color);
        }
        public double perimeter()
        {
            return side*3;
        }
        public double area(){
            return (Math.sqrt(3)/4)*(side*side);
        }
        public String toString() {
            return super.toString() + " which is also an Equilateral Triangle";
        }

    }
}
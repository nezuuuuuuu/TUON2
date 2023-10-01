import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner sc = new Scanner(System.in);
        int i=0;
        String option;
        List<Shape> shapes = new ArrayList<>();
        do {
            System.out.print("Enter shape: ");
            option = sc.nextLine();
            switch (option) {
                case "Rectangle":
                    System.out.print("Enter length: ");
                    double len = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double wid = sc.nextDouble();
                    // This nextLine is to rid the next line made by the previous scan
                    // Do this in the future as well, before getting a String input
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String color = sc.nextLine();
                    shape = new Rectangle(len, wid, color);
                    shapes.add(shape);
                    break;
                case "Square":
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Rectangle.Square(side,color);
                    shapes.add(shape);
                    break;
                case "Circle":
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Ellipse.Circle(r,color);
                    shapes.add(shape);
                    break;
                case "Ellipse":
                    System.out.print("Enter a: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter b: ");
                    double b = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Ellipse(a,b,color);
                    shapes.add(shape);
                    break;
                case "Triangle":
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();

                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    System.out.print("Enter a: ");
                    a = sc.nextDouble();
                    System.out.print("Enter c: ");



                    double c = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Triangle(a,base,c,height,color);
                    shapes.add(shape);
                    break;
                case "Equilateral Triangle":
                    System.out.print("Enter side: ");
                    side = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Triangle.EquilateralTriangle(side,color);
                    shapes.add(shape);
                    break;
            }
        } while (!option.equals("DONE"));
        List<Shape> shapes2=shapes;
        do {
            System.out.print("Sort by: ");
            option = sc.nextLine();



            switch (option) {
                case "DONE":
                    break;
                case "Color":

                    for (Shape s : shapes) {
                        for (Shape r : shapes2) {
                            i=i+ s.compareTo(r);
                        }
                    }
                    if(i==0)
                    {
                        shapes.sort(new Shape.AreaComparator());
                    }
                    else{
                        shapes.sort(new Shape.colorComparator());
                    }




                    for (Shape s : shapes) {
                        System.out.print("Area of " + s + ": ");
                        System.out.format("%.2f\n", s.area());
                    }
                    break;
                case "Area":
                    shapes.sort(new Shape.AreaComparator());
                    for (Shape s : shapes) {
                        System.out.print("Area of " + s + ": ");
                        System.out.format("%.2f\n", s.area());
                    }
                    break;
                case "Perimeter":
                    shapes.sort(new Shape.PerimComparator());
                    for (Shape s : shapes) {
                        System.out.print("Perimeter of " + s + ": ");
                        System.out.format("%.2f\n", s.perimeter());
                    }
                    break;
            }
        } while (!option.equals("DONE"));
    }
}
//
//import java.util.Comparator;
//
//public abstract class Shape implements Comparable<Shape> {
//    String color;
//
////
////    public Shapes(String color) {
////        this.color = color;
////    }
//
//    @Override
//    public String toString() {
//        return "A shape that is color " + color;
//    }
//    @Override
//    public int compareTo(Shape other) {
//        return this.color.compareTo(other.color);
//    }
//
//
//    public abstract double area();
//    public abstract double perimeter();
//
//    public static class colorComparator implements Comparator<Shape> {
//
//        public int compare(Shape o1, Shape o2) {
//            return o1.color.compareTo(o2.color);
//        }
//    }
//
//
//    public static class PerimComparator implements Comparator<Shape> {
//
//
//        public int compare(Shape o1, Shape o2) {
//            return Double.compare(o2.perimeter(),o1.perimeter());
//        }
//
//
//    }
//    public static class AreaComparator implements Comparator<Shape> {
//
//
//        public int compare(Shape o1, Shape o2) {
//            return Double.compare(o2.area(),o1.area());
//        }
//
//
//    }
//
//
//
//
//
//
//}
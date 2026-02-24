class Shape {
    // Rectangle area
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Circle area
    double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class ShapeOverload{
    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.printf("Area of Rectangle: %.2f%n", s.area(5, 4));
        System.out.printf("Area of Circle: %.2f%n", s.area(5));
    }
}

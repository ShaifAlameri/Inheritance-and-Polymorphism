import java.util.Scanner;
public class TestCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***Cylinder***");
        System.out.println("=====================");
        System.out.print("Please enter the cylinder's base radius: ");
        double radius = input.nextDouble();
        System.out.println("=====================");
        System.out.print("Please enter the cylinder's height: ");
        double height = input.nextDouble();
        System.out.println("=====================");

        Cylinder cy1 = new Cylinder(radius, height);
        System.out.println("Cylinder information: " + cy1);
    }
}
class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "radius=" + radius + " ,color=" + color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseArea() {
        return super.getArea();
    }

    public double getArea() {
        return 2 * Math.PI * super.getRadius() * height + 2 * getBaseArea();
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    public String toString() {
        return "base " + super.toString() + " ,height=" + height + " ,base area=" + getBaseArea()
                + " ,Surface area=" + getArea() + " ,volume=" + getVolume();
    }
}


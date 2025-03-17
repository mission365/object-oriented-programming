package abstraction.basicWithInterface;

public class Driver {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        Rectangle rect = new Rectangle(2.0, 5.2);

        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}

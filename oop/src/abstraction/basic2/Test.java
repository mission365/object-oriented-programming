package abstraction.basic2;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 3.3);
        Shape s2 = new Rectangle("Yellow", 2,5);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}

package abstraction.basicWithInterface2;

public class Driver {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();

        bicycle.changeGear(2);
        bicycle.speedUp(4);
        bicycle.applyBreaks(2);

        System.out.println("Bicycle Present State: ");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(5);
        bike.speedUp(10);
        bike.applyBreaks(5);

        System.out.println("Bike Present State: ");
        bike.printStates();
    }
}

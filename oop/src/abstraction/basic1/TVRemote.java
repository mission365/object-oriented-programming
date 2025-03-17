package abstraction.basic1;

public class TVRemote extends Geeks{
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

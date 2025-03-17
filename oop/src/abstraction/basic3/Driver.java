package abstraction.basic3;

public class Driver {
    public static void main(String[] args) {
        Animal myDog = new Dog("Doggy");
        Animal myCat = new Cat("Billi");

        myDog.makeSound();
        myCat.makeSound();
    }
}

package abstraction.basic3;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(getName() + " meows");
    }
}

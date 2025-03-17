package abstraction.basic3;

abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    abstract void makeSound();

    public String getName() {
        return name;
    }

}

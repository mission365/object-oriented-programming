package abstraction.basic2;

abstract class Shape {
    String color;

    abstract double area();

    public abstract String toString();

    public Shape(String color){
        System.out.println("Shape constructor Called");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}

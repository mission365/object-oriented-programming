package encapsulation.basic;

public class Gfg {
    public static void main(String args[])
    {
        Employee e = new Employee();
        e.set_id(78);
        e.set_name("John");

        System.out.println("Employee id: " + e.get_id());
        System.out.println("Employee Name: "
                + e.get_name());
    }
}

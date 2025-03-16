package encapsulation.basic;

public class Employee {
    private int empid;
    private String ename;

    // Setter methods
    public void set_id(int empid) {
        this.empid = empid;
    }

    public void set_name(String ename)
    {
        this.ename = ename;
    }

    // Getter methods
    public int get_id() {
        return empid;
    }

    public String get_name() {
        return ename;
    }
}

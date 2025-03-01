public class Volunteer extends StaffMember{
    private double salary;

    public Volunteer(int _id, String _name, String _address){
        id = _id;
        name = _name;
        address = _address;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public double pay() {
        return 0;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

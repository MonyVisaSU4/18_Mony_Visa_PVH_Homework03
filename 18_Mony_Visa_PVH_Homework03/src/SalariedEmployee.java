public class SalariedEmployee extends StaffMember{
    private double salary;
    private double bonus;

    public SalariedEmployee(int _id, String _name, String _address, double _salary, double _bonus){
        id = _id;
        name = _name;
        address = _address;
        salary = _salary;
        bonus = _bonus;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                ", bonus=" + bonus +
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

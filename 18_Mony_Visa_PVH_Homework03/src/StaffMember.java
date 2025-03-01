public abstract class StaffMember {
    protected int id;
    protected String name;
    protected String address;

    public StaffMember(int _id, String _name, String _address){
        id = _id;
        name = _name;
        address = _address;
    }

    public StaffMember(){

    }

    public abstract double pay();

    @Override
    public String toString() {
        return "StaffMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
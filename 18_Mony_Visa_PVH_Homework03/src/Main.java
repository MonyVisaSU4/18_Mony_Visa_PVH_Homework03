import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public int serielId=0;
    public Table t = new Table(1);
    public Table t1 = new Table(9);
    public Table t3 = new Table(4);
    public Collection<String> arrayList = new ArrayList<String>();
    public Scanner ConsoleReadline = new Scanner(System.in);
    public void choiceType(){
        t3.addCell("1. Volunteer");
        t3.addCell("2. Salaries Employee");
        t3.addCell("3. Hourly Employee");
        t3.addCell("4. Back");
        System.out.println(t3.render());
    }
    public void initailValue(){
        serielId++;
        arrayList.add("Volunteer");
        arrayList.add(String.valueOf(serielId));
        arrayList.add("Mr. Kouern Doch");
        arrayList.add("Preah Vihear");
        arrayList.add("$999.00");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("$999.00");
        serielId++;
        arrayList.add("Salaries Employee");
        arrayList.add(String.valueOf(serielId));
        arrayList.add("Mr. Tan Dara");
        arrayList.add("Siem Reap");
        arrayList.add("$777.00");
        arrayList.add("$50.00");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("$827.00");
        serielId++;
        arrayList.add("Hourly Employee");
        arrayList.add(String.valueOf(serielId));
        arrayList.add("Mr. Chea MengLim");
        arrayList.add("Phnom Penh");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("100");
        arrayList.add("$100");
        arrayList.add("$10000.00");
        serielId++;
        arrayList.add("Hourly Employee");
        arrayList.add(String.valueOf(serielId));
        arrayList.add("Ms. Sopheap Tola");
        arrayList.add("Phnom Penh");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("50");
        arrayList.add("$40");
        arrayList.add("$2000.00");
        serielId++;
        arrayList.add("Salaried Employee");
        arrayList.add(String.valueOf(serielId));
        arrayList.add("Mr. Vannak Chet");
        arrayList.add("Siem Reap");
        arrayList.add("$650.00");
        arrayList.add("$100.00");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("$65000.00");
        serielId++;
        arrayList.add("Volunteer");
        arrayList.add(String.valueOf(serielId));
        arrayList.add("Ms. Sreyneang Keo");
        arrayList.add("Battambang");
        arrayList.add("$1500.00");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("$1500.00");
        serielId++;
        arrayList.add("Hourly Employee");
        arrayList.add(String.valueOf(serielId));
        arrayList.add("Mr. Dara Sok");
        arrayList.add("Kampot");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("150");
        arrayList.add("$15");
        arrayList.add("$2250.00");
        serielId++;
        arrayList.add("Salaried Employee");
        arrayList.add(String.valueOf(serielId));
        arrayList.add("Ms. Sophea Ly");
        arrayList.add("Preah Sihanouk");
        arrayList.add("$790.00");
        arrayList.add("$70");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("$55300.00");
    }
    public void headerTable(){
        t1.addCell("TYPE");
        t1.addCell("ID");
        t1.addCell("NAME");
        t1.addCell("ADDRESS");
        t1.addCell("SALARY");
        t1.addCell("BONUS");
        t1.addCell("HOUR");
        t1.addCell("RATE");
        t1.addCell("PAY");
        System.out.println(t1.render());
    }
    public void display(){
        t.addCell("STAFF MANAGEMENT SYSTEM");
        t.addCell("1. Insert Employee");
        t.addCell("2. Update Employee");
        t.addCell("3. Display Employee");
        t.addCell("4. Remove Employee");
        t.addCell("5. Exit");
        System.out.println(t.render());
        System.out.println("-------------------");
        System.out.print("-> Choose an option(): ");
        int op = ConsoleReadline.nextInt();
        switch (op){
            case 1:
                insert();
                break;
            case 2:
                update();
                break;
            case 3:
                show();
                break;
            case 4:
                delete();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    public void insert(){
        System.out.println("==========* Insert Employee *==========");
        System.out.println("Choose Type:");
        choiceType();
        System.out.print("=> Enter Type Number: ");
        int typeOp = ConsoleReadline.nextInt();
        switch (typeOp){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                display();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    public void volunteerInsert(){
        System.out.print("=> Enter Name: ");
        System.out.print("=> Enter Address: ");
        System.out.print("=> Enter Salary: ");
    }
    public void hourlyEmpInsert(){
        System.out.print("=> Enter Name: ");
        System.out.print("=> Enter Address: ");
        System.out.print("=> Enter HoursWorked: ");
        System.out.print("=> Enter Rate: ");
    }
    public void salaryEmpInsert(){
        System.out.print("=> Enter Name: ");
        System.out.print("=> Enter Address: ");
        System.out.print("=> Enter Salary: ");
        System.out.print("=> Enter Bonus: ");
    }
    public void show(){
        headerTable();
        arrayList.forEach(n->{t1.addCell(n);});
        System.out.println(t1.render());
    }
    public void delete(){

    }
    public void update(){

    }
    public static void main(String[] args) {
//        try{
//            Main m1 = new Main();
//            m1.display();
//        }
//        catch (Exception ex){
//            System.out.println("Catch: " + ex);
//        }
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
    }
}
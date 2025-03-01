import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public Table t = new Table(1);
    public Table t1 = new Table(9);
    public Table t3 = new Table(4);
    public Collection<String> arrayList = new ArrayList<String>();
    public Scanner ConsoleReadline = new Scanner(System.in);
//    public Main m = new Main();
    public void choiceType(){
        t3.addCell("1. Volunteer");
        t3.addCell("2. Salaries Employee");
        t3.addCell("3. Hourly Employee");
        t3.addCell("4. Back");
        System.out.println(t3.render());
    }
    public void initailValue(){

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
import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int serielId=0,count=0,count1=0,count2=0;
    public Table t = new Table(1);
    public Table t1 = new Table(9);
    public Table t2 = new Table(9);
    public Table t3 = new Table(4);
    public ArrayList<String> arrayList = new ArrayList<String>();
    public Scanner ConsoleReadline = new Scanner(System.in);
    public void choiceType(){
        t3.addCell("1. Volunteer");
        t3.addCell("2. Salaries Employee");
        t3.addCell("3. Hourly Employee");
        t3.addCell("4. Back");
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
    }
    public void display(){
        System.out.println();
        if(count==0){
            initailValue();
        }
        if(count==0){
            t.addCell("STAFF MANAGEMENT SYSTEM");
            t.addCell("1. Insert Employee");
            t.addCell("2. Update Employee");
            t.addCell("3. Display Employee");
            t.addCell("4. Remove Employee");
            t.addCell("5. Exit");
        }
        count=1;
        System.out.println(t.render());
        System.out.println("-------------------");
        System.out.print("-> Choose an option(): ");
        int op = Integer.parseInt(ConsoleReadline.nextLine());
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
        System.out.println();
        System.out.println("==========* Insert Employee *==========");
        System.out.println("Choose Type:");
        if(count2==0){
            choiceType();
        }
        count2=1;
        System.out.println(t3.render());
        System.out.print("=> Enter Type Number: ");
        int typeOp = Integer.parseInt(ConsoleReadline.nextLine());
        switch (typeOp){
            case 1:
                volunteerInsert();
                break;
            case 2:
                salaryEmpInsert();
                break;
            case 3:
                hourlyEmpInsert();
                break;
            case 4:
                display();
                break;
            default:
                System.out.println("Invalid Input");
                display();
                break;
        }
    }
    public void volunteerInsert(){
        Volunteer volunteer = new Volunteer(0,"","");
        serielId++;
        System.out.println("Id: " + serielId);
        System.out.print("=> Enter Name: ");
        volunteer.name = ConsoleReadline.nextLine();
        System.out.print("=> Enter Address: ");
        volunteer.address = ConsoleReadline.nextLine();
        System.out.print("=> Enter Salary: ");
        volunteer.setSalary(Double.parseDouble(ConsoleReadline.nextLine()));
        arrayList.add("Volunteer");
        arrayList.add(String.valueOf(serielId));
        arrayList.add(volunteer.name);
        arrayList.add(volunteer.address);
        arrayList.add(String.valueOf(volunteer.getSalary()));
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add(String.valueOf(volunteer.getSalary()));
        System.out.println("* You add " + volunteer.name + " to type of Volunteer successfully *");
        System.out.println();
        display();
    }
    public void hourlyEmpInsert(){
        HourlySalaryEmployee hourlySalaryEmployee = new HourlySalaryEmployee(0,"","",0,0.00);
        serielId++;
        System.out.println("Id: " + serielId);
        System.out.print("=> Enter Name: ");
        hourlySalaryEmployee.name = ConsoleReadline.nextLine();
        System.out.print("=> Enter Address: ");
        hourlySalaryEmployee.address = ConsoleReadline.nextLine();
        System.out.print("=> Enter HoursWorked: ");
        hourlySalaryEmployee.setHourWorked(Integer.parseInt(ConsoleReadline.nextLine()));
        System.out.print("=> Enter Rate: ");
        hourlySalaryEmployee.setRate(Double.parseDouble(ConsoleReadline.nextLine()));
        arrayList.add("Hourly Employee");
        arrayList.add(String.valueOf(serielId));
        arrayList.add(hourlySalaryEmployee.name);
        arrayList.add(hourlySalaryEmployee.address);
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add(String.valueOf(hourlySalaryEmployee.getHourWorked()));
        arrayList.add(String.valueOf(hourlySalaryEmployee.getRate()));
        arrayList.add(String.valueOf(hourlySalaryEmployee.getHourWorked() * hourlySalaryEmployee.getRate()));
        System.out.println("* You add " + hourlySalaryEmployee.name + " to type of Hourly Employee successfully *");
        System.out.println();
        display();
    }
    public void salaryEmpInsert(){
        SalariedEmployee salariedEmployee = new SalariedEmployee(0,"","",0.00,0.00);
        serielId++;
        System.out.println("Id: " + serielId);
        System.out.print("=> Enter Name: ");
        salariedEmployee.name = ConsoleReadline.nextLine();
        System.out.print("=> Enter Address: ");
        salariedEmployee.address = ConsoleReadline.nextLine();
        System.out.print("=> Enter Salary: ");
        salariedEmployee.setSalary(Double.parseDouble(ConsoleReadline.nextLine()));
        System.out.print("=> Enter Bonus: ");
        salariedEmployee.setBonus(Double.parseDouble(ConsoleReadline.nextLine()));
        arrayList.add("Salaries Employee");
        arrayList.add(String.valueOf(serielId));
        arrayList.add(salariedEmployee.name);
        arrayList.add(salariedEmployee.address);
        arrayList.add(String.valueOf(salariedEmployee.getSalary()));
        arrayList.add(String.valueOf(salariedEmployee.getBonus()));
        arrayList.add("---");
        arrayList.add("---");
        arrayList.add(String.valueOf(salariedEmployee.getSalary() + salariedEmployee.getBonus()));
        System.out.println("* You add " + salariedEmployee.name + " to type of Salaries Employee successfully *");
        System.out.println();
        display();
    }
    public void show(){
        System.out.println();
        if(count1==0){
            headerTable();
        }
        arrayList.forEach(n->t1.addCell(n));
        count1=1;
        System.out.println(t1.render());
        display();
    }
    public void delete(){

    }
    public void update(){
        System.out.println();
        System.out.println("==========* Update Employee *==========");
        System.out.print("=> Enter or Search ID to Update: ");
        int sch = Integer.parseInt(ConsoleReadline.nextLine());
        int i = arrayList.indexOf(String.valueOf(sch));
        System.out.println();
        t2.addCell(arrayList.get(i-1));
        t2.addCell(arrayList.get(i));
        t2.addCell(arrayList.get(i+1));
        t2.addCell(arrayList.get(i+2));
        t2.addCell(arrayList.get(i+3));
        t2.addCell(arrayList.get(i+4));
        t2.addCell(arrayList.get(i+5));
        t2.addCell(arrayList.get(i+6));
        t2.addCell(arrayList.get(i+7));
        System.out.println(t2.render());
        System.out.println();
        System.out.println("Choose one column to update: ");
        System.out.println("1.Name \t 2.Address \t 3.Salary \t 0.Cancel");
        System.out.print("=> Select Column Number: ");
        int sel = Integer.parseInt(ConsoleReadline.nextLine());
        switch (sel){
            case 1:
                System.out.print("Change Name To: ");
                String name = ConsoleReadline.nextLine();
                arrayList.set(i+1,name);
                System.out.println("* Name has updated successfully *");
                break;
            case 2:
                System.out.print("Change Address To: ");
                String address = ConsoleReadline.nextLine();
                arrayList.set(i+2,address);
                System.out.println("* Address has updated successfully *");
                break;
            case 3:
                System.out.print("Change Salary To: ");
                String salary = ConsoleReadline.nextLine();
                arrayList.set(i+3,salary);
                System.out.println("* Salary has updated successfully *");
                break;
            case 0:
                display();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        display();
    }
    public static void main(String[] args) {
        try{
            Main m1 = new Main();
            m1.display();
        }
        catch (Exception ex){
            System.err.println("Catch: " + ex);
        }
    }
}
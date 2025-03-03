import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public int serielId=0,count=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0;
    public Table t = new Table(1);
    public Table t1 = new Table(9);
    public Table t2 = new Table(9);
    public Table t3 = new Table(4);
    public Table t4 = new Table(9);
    public Table t5 = new Table(9);
    public Table t6 = new Table(9);
    public Table t7 = new Table(9);
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
        System.out.println("Do you want to order all or specific type: ");
        System.out.println("1. Show all \t 2. Specific Type");
        System.out.print("Choose one: ");
        int ch = Integer.parseInt(ConsoleReadline.nextLine());
        switch (ch){
            case 1:
                if(count1==0){
                    headerTable();
                }
                arrayList.forEach(n->t1.addCell(n));
                count1=1;
                System.out.println(t1.render());
                break;
            case 2:
                System.out.println();
                System.out.println("Choose one of these Type: ");
                System.out.println("1. Volunteer \t 2. Salaried Employee \t 3. HourlySalary Employee \t 4. Cancel");
                System.out.print("Please type: ");
                int ty = Integer.parseInt(ConsoleReadline.nextLine());
                switch (ty){
                    case 1:
                        if(count5==0){
                            t5.addCell("TYPE");
                            t5.addCell("ID");
                            t5.addCell("NAME");
                            t5.addCell("ADDRESS");
                            t5.addCell("SALARY");
                            t5.addCell("BONUS");
                            t5.addCell("HOUR");
                            t5.addCell("RATE");
                            t5.addCell("PAY");
                        }
                        count5=1;
                        for(int u=0;u<arrayList.size();u++){
                            if(arrayList.get(u).equals("Volunteer")){
                                for (int c=u;c<u+9;c++){
                                    t5.addCell(arrayList.get(c));
                                }
                            }
                        }
                        System.out.println(t5.render());
                        break;
                    case 2:
                        if(count6==0){
                            t6.addCell("TYPE");
                            t6.addCell("ID");
                            t6.addCell("NAME");
                            t6.addCell("ADDRESS");
                            t6.addCell("SALARY");
                            t6.addCell("BONUS");
                            t6.addCell("HOUR");
                            t6.addCell("RATE");
                            t6.addCell("PAY");
                        }
                        count5=1;
                        for(int u=0;u<arrayList.size();u++){
                            if(arrayList.get(u).equals("Salaries Employee")){
                                for (int c=u;c<u+9;c++){
                                    t6.addCell(arrayList.get(c));
                                }
                            }
                        }
                        System.out.println(t6.render());
                        break;
                    case 3:
                        if(count7==0){
                            t7.addCell("TYPE");
                            t7.addCell("ID");
                            t7.addCell("NAME");
                            t7.addCell("ADDRESS");
                            t7.addCell("SALARY");
                            t7.addCell("BONUS");
                            t7.addCell("HOUR");
                            t7.addCell("RATE");
                            t7.addCell("PAY");
                        }
                        count5=1;
                        for(int u=0;u<arrayList.size();u++){
                            if(arrayList.get(u).equals("Hourly Employee")){
                                for (int c=u;c<u+9;c++){
                                    t7.addCell(arrayList.get(c));
                                }
                            }
                        }
                        System.out.println(t7.render());
                        break;
                    case 4:
                        show();
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        display();
    }
    public void delete(){
        System.out.println("==========* Remove Employee *==========");
        System.out.print("=> Enter ID to Remove: ");
        String rm = ConsoleReadline.nextLine();
        int index = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(rm)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("* ID: " + rm + " not found! *");
        } else {
            for (int i = 0; i < 9; i++) {
                arrayList.remove(index-1);
            }
            System.out.println("* ID: " + rm + " has been removed successfully! *");
        }
        display();
    }
    public void update(){
        System.out.println();
        System.out.println("==========* Update Employee *==========");
        System.out.print("=> Enter or Search ID to Update: ");
        String sch = ConsoleReadline.nextLine();
        if(sch.isEmpty()){
            display();
        }
        int i = arrayList.indexOf(sch);
        System.out.println();
        if(count3==0){
            t2.addCell("TYPE");
            t2.addCell("ID");
            t2.addCell("NAME");
            t2.addCell("ADDRESS");
            t2.addCell("SALARY");
            t2.addCell("BONUS");
            t2.addCell("HOUR");
            t2.addCell("RATE");
            t2.addCell("PAY");
        }
        count3=1;
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
        int index=arrayList.indexOf("Volunteer");
        int index2=arrayList.indexOf("Salaries Employee");
        int index3=arrayList.indexOf("Hourly Employee");
        while (true){
            if(arrayList.get(i-1).equals("Volunteer")){
                System.out.println("Choose one column to update: ");
                System.out.println("1.Name \t 2.Address \t 3.Salary \t 0.Cancel");
                System.out.print("=> Select Column Number: ");
                int sel = Integer.parseInt(ConsoleReadline.nextLine());
                if(sel==0){
                    break;
                }
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
                        update();
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                System.out.println();
                if(count4==0){
                    t4.addCell("TYPE");
                    t4.addCell("ID");
                    t4.addCell("NAME");
                    t4.addCell("ADDRESS");
                    t4.addCell("SALARY");
                    t4.addCell("BONUS");
                    t4.addCell("HOUR");
                    t4.addCell("RATE");
                    t4.addCell("PAY");
                }
                count4=1;
                t4.addCell(arrayList.get(i-1));
                t4.addCell(arrayList.get(i));
                t4.addCell(arrayList.get(i+1));
                t4.addCell(arrayList.get(i+2));
                t4.addCell(arrayList.get(i+3));
                t4.addCell(arrayList.get(i+4));
                t4.addCell(arrayList.get(i+5));
                t4.addCell(arrayList.get(i+6));
                t4.addCell(arrayList.get(i+7));
                System.out.println(t4.render());
                System.out.println();
            }
            else if(arrayList.get(i-1).equals("Salaries Employee")){
                System.out.println("Choose one column to update: ");
                System.out.println("1.Name \t 2.Address \t 3.Salary \t 4.Bonus \t 0.Cancel");
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
                    case 4:
                        System.out.print("Change Bonus To: ");
                        String bonus = ConsoleReadline.nextLine();
                        arrayList.set(i+4,bonus);
                        System.out.println("* Bonus has updated successfully *");
                        break;
                    case 0:
                        update();
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                System.out.println();
                if(count4==0){
                    t4.addCell("TYPE");
                    t4.addCell("ID");
                    t4.addCell("NAME");
                    t4.addCell("ADDRESS");
                    t4.addCell("SALARY");
                    t4.addCell("BONUS");
                    t4.addCell("HOUR");
                    t4.addCell("RATE");
                    t4.addCell("PAY");
                }
                count4=1;
                t4.addCell(arrayList.get(i-1));
                t4.addCell(arrayList.get(i));
                t4.addCell(arrayList.get(i+1));
                t4.addCell(arrayList.get(i+2));
                t4.addCell(arrayList.get(i+3));
                t4.addCell(arrayList.get(i+4));
                t4.addCell(arrayList.get(i+5));
                t4.addCell(arrayList.get(i+6));
                t4.addCell(arrayList.get(i+7));
                System.out.println(t4.render());
                System.out.println();
            }
            else{
                System.out.println("Choose one column to update: ");
                System.out.println("1.Name \t 2.Address \t 3.HourWorked \t 4.Rate \t 0.Cancel");
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
                        String hour = ConsoleReadline.nextLine();
                        arrayList.set(i+5,hour);
                        System.out.println("* HourWorked has updated successfully *");
                        break;
                    case 4:
                        System.out.print("Change Salary To: ");
                        String rate = ConsoleReadline.nextLine();
                        arrayList.set(i+6,rate);
                        System.out.println("* Rate has updated successfully *");
                        break;
                    case 0:
                        update();
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                System.out.println();
                if(count4==0){
                    t4.addCell("TYPE");
                    t4.addCell("ID");
                    t4.addCell("NAME");
                    t4.addCell("ADDRESS");
                    t4.addCell("SALARY");
                    t4.addCell("BONUS");
                    t4.addCell("HOUR");
                    t4.addCell("RATE");
                    t4.addCell("PAY");
                }
                count4=1;
                t4.addCell(arrayList.get(i-1));
                t4.addCell(arrayList.get(i));
                t4.addCell(arrayList.get(i+1));
                t4.addCell(arrayList.get(i+2));
                t4.addCell(arrayList.get(i+3));
                t4.addCell(arrayList.get(i+4));
                t4.addCell(arrayList.get(i+5));
                t4.addCell(arrayList.get(i+6));
                t4.addCell(arrayList.get(i+7));
                System.out.println(t4.render());
                System.out.println();
            }
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
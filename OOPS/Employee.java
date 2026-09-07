package OOPS;

public class Employee {
    String name;
    int empid;
    double salary;

    Employee(String name,int empid,double salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    void displaydetails(){
        System.out.println("Name:" +name);
        System.out.println("Empid:" +empid);
        System.out.println("Salary:" +salary);
    }
    void IncreaseSalary(double percentage){
        salary+=salary*percentage/100;
        System.out.println("Updated Salary:" +salary);
    }
    public class main{
        public static void main(String[] args){
            Employee e1=new Employee("Suchita", 2, 4000);
            e1.displaydetails();
            e1.IncreaseSalary(80);

            System.out.println("After salary increment");
            e1.displaydetails();
        }
    }
}

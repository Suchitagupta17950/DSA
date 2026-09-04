package OOPS;

public class StudentMgmt {
    String name;
    int rollno;
    int marks;

    StudentMgmt(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }

    void displaydetails(){
        System.out.println("Name:" +name);
        System.out.println("Roll No:" +rollno);
        System.out.println("Marks:" +marks);
    }

    void grade(){
        if(marks>=90){
            System.out.println("Grade: A");
        }else if(marks>=75){
            System.out.println("Grade:B");
        }else if(marks>=65){
            System.out.println("Grade:C");
        }else{
            System.out.println("Grade:E");
        }
    }
}
public class main{
    public static void main(String[] args) {
        StudentMgmt student1=new StudentMgmt(SUchita, 178, 87);
        student1.displaydetails();
        student1.grade();
    }
}

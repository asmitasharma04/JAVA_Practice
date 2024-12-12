class Employee{  //cannot write  public class employee because there is only one public for class
    int id;
    String name;
    int salary;
    public int getsalary(){
        return salary;
    }
}

public class class_oop{
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry=new Employee();
        //setting properties
        harry.id=12;
        harry.name="harry";
        harry.salary=12000000;
        System.out.println(harry.id);
        System.out.println(harry.name);
        int sal=harry.getsalary();
        System.out.println(sal);
    }
}
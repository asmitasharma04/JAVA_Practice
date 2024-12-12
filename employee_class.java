class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}

//class phone
class phone{
    public void ring(){
        System.out.println("ringing....");
    }
    public void vib(){
        System.out.println("vibrating....");
    }
}
public class employee_class {
    public static void main(String[] args) {
        Employee harry=new Employee();
        harry.setname("asmita");
        harry.salary=200000000;
        System.out.println(harry.getsalary());
        System.out.println(harry.getname());


        phone apple=new phone();
        apple.ring();
        apple.vib();
    }
}

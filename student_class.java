class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //Nonparametrised constructor
//     public Student(){
//         System.out.println("Constructor called");
//     }
// }




//parameterised constructor
// public Student(String name, int age){
//     this.name=name;
//     this.age=age;
// }




//copy constructor
Student(Student s2){
    this.name=s2.name;
    this.age=s2.age;
}
Student(){

}
}
public class student_class {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="asmita";
        s1.age=24;
        Student s2=new Student(s1);
        s2.printinfo();
        s1.printinfo();
    }
}

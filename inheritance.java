//INHERITANCE BASIC WE USE THE KEYWORD extends
// class Shape{
//     String color;
// }
// class Triangle extends Shape{
    
// }





//SINGLE LEVEL
class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
//Multilevel
class Equilateral extends Triangle{
    public void area(int l,int h){
        super.area();//calling upper class 
        System.out.println(0.5*l*h);
    }
}
//hierarchical
class Circle extends Shape{
    public void area(int r){
        super.area();
        System.out.println((3.14)*r*r);
    }
}
public class inheritance {
  public static void main(String[] args) {
    //INHERITANCE BASICS
    // Triangle t1=new Triangle();
    // t1.color="red";
    // System.out.println(t1.color);;


//SINGLE
   Circle t1=new Circle();
    t1.area(5);
  }  
}

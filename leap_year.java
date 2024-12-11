import java.util.*;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       
       if((a%2000!=0)&&(a%400==0)||(a%100!=0)&&(a%4==0)){
        System.out.println("leap");
       }else{
        System.out.println("no leap");
       }
}
}

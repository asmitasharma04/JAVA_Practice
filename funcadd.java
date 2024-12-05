// public class funcadd {
//     public static int add(int a, int b){
//         return a+b;

//     }
//     public static void main(String[] args) {
//         int sum=add(5,3);
//         System.out.println(sum);
//     }
// }
import java.util.Scanner;
public class funcadd {
    public static int add(int a, int b){
        return a+b;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.println(sum);
    }
}
import java.util.*;
public class class3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        int roll_no=sc.nextInt();
        boolean married=sc.nextBoolean();
        sc.nextLine();//// Consume the leftover newline character
        String country=sc.nextLine();
        System.out.println("name "+name);
        System.out.println("age "+age);
        System.out.println("roll no "+roll_no);
        System.out.println("married "+married);
        System.out.println("country "+country);

    }
}

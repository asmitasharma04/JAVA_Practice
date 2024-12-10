import java.util.*;

public class class4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user and read input values
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume leftover newline
        
        System.out.print("Enter your gender: ");
        String gender = sc.nextLine();
        
        System.out.print("Enter your roll number: ");
        double roll_no = sc.nextDouble();
        sc.nextLine(); // Consume leftover newline
        
        System.out.print("Enter your country: ");
        String country = sc.nextLine();
        
        System.out.print("Are you married (true/false): ");
        boolean married = sc.nextBoolean();
        sc.nextLine(); // Consume leftover newline
        
        System.out.print("Enter your group: ");
        int group = sc.nextInt();
        sc.nextLine(); // Consume leftover newline
        
        System.out.print("Enter your fees: ");
        double fees = sc.nextDouble();
        
        sc.close();
        
        // Print the input values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Country: " + country);
        System.out.println("Married: " + married);
        System.out.println("Group: " + group);
        System.out.println("Fees: " + fees);
    }
}


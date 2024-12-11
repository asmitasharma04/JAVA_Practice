// import java.util.*;
// public class prime1 {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if(n<=1){
//         System.out.println("false");
//        } else{
//        for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//             System.out.println("false");
//             break;
//         }
//     }
//     System.out.println("true");
        
//         }
       
    
//        }
       

//     }

import java.util.*;

public class prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 1) {
            System.out.println("false");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

      
    }
}

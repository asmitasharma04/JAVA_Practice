public class factorial {
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid");
            return;
        }
        int fact=1;
        for(int i=n;i>1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        printFactorial(9);
    }
}

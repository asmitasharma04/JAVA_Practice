public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int newnum=n;
        int sum=0;
       while(n>0){
        int rem=n%10;
        n/=10;
        sum+=rem*rem*rem;
       }
       if(sum==newnum){
        System.out.println("Number is Armstrong");
       }else{
        System.out.println("Number is not Armstrong");
       }

    }
}

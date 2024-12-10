import java.util.*;

public class update_bit_mask {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        Scanner sc=new Scanner(System.in);  
        int operation=sc.nextInt(); 
        if(operation==1){
            int newnum=bitmask|n;
            System.out.println(newnum);
        }else{
            int not=~bitmask;
            int num=not&n;
            System.out.println(num);
        }
    }
}

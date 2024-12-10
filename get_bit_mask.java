public class get_bit_mask {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        if((bitmask&n)==0){
            System.out.println("zero");
        }else{
            System.out.println("one");
        }
    }
}

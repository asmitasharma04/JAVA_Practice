public class clear_bit_mask {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int not=~(bitmask);
        int newnumber=not&n;
        System.out.println(newnumber);

    }
}

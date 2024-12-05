public class reverse_array {
    public static void main(String[] args) {
        int [] marks={99,98,97,96};
        for(int i=0;i<=marks.length-1;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        for(int i=marks.length-1;i>=0;i--){
            System.out.print(marks[i]+" ");
        }
    }
}

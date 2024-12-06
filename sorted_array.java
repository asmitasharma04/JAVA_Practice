public class sorted_array {
   public static boolean sorted(int []arr){
    for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1])
        return false;
    }
    return true;
   }
   public static void main(String[] args) {
    int []arr={78,9,30,87};
    if(sorted(arr)){
        System.out.println("array is sorted");
    }else{
        System.out.println("not sorted");
    }
   }
}

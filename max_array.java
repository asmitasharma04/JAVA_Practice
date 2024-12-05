public class max_array {
    public static void main(String[] args) {
        int[] arr = {99, 101, 4, 679, 9000, 1000 , 340};
        int max = arr[0];
        
        for (int i = 0; i <= arr.length-1; i++) { // Start from the second element
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        
        System.out.println("The maximum value in the array is: " + max);
    }
}

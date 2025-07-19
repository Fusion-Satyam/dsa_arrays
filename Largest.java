package dsa_arrays;

public class Largest {

    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
    
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }System.out.println("Minimum in the array "+min);
        return max;
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 10, 2, 8, 6};
        System.out.println("Largest element is " + largest(arr));
        
    }
}
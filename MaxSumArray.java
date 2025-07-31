package dsa_arrays;

public class MaxSumArray {
    public static void maxSumArray(int []arr){
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {

            for(int j = i ;j<arr.length;j++){
                currentSum= 0;
                // Calculate the sum of the subarray from index i to j
                // This is a nested loop to consider all subarrays
                for(int k =i;k<=j;k++){
                    currentSum += arr[k];
                }
                // Print the current subarray and its sum
                System.out.println(currentSum + " ");
                // Update the maximum sum if the current sum is greater
                if (currentSum > max){
                    max = currentSum;
               }
            }

        }System.out.println(" Max sum of subarray is: " + max);
    }
    public static void main(String[] args) {
        
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
         maxSumArray(arr);
       // System.out.println("Maximum sum of subarray is: " + max);
    }
    
}

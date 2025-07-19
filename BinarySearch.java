package dsa_arrays;

public class BinarySearch {

    public static int binarySearch(int []arr , int target) {
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){
             int mid = low +(high-low)/2;
            if(arr[mid]==target){ //FOUND AT THE END BECAUSE WE ARE DOING IT IN A WHILE LOOP 
                 return mid;     // AND WE ONLY LEFT WITH THE KEY INDEX AFTER CONTINUOUS DIVISIONS 
            }if (arr[mid]<target) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[]  = {10, 20, 30, 40, 50, 60, 70};
        int target = 30;
        System.out.println("Index of the target element is " + binarySearch(arr, target));
    }
}

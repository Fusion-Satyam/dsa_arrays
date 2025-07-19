package dsa_arrays;
public class LinearSearch {
    public static int search(int[] arr, int target) {
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]==target){
                return i;
                
            }
        }return -1;
    
}
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 5;
    int result = search(arr, target);
    if(result == -1){
        System.out.println("Element not found");
    }
    else{
        System.out.println("Element found at index "+result);
    }
}

}


import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }   
    
    // Sorting
    static void sorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxNo = getMaxNo(arr, 0, lastIndex);
            swap(arr, maxNo, lastIndex);
        }
    }
    // swap
    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    //Max no
    static int getMaxNo(int[] arr, int start, int end){
        int max = start;
        for(int i = 0; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

}
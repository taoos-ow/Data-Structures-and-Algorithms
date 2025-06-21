import java.util.Arrays;

public class ReverseOfAnArray {
    public static void main(String[] args) {
        
        int[] arr = {12, 35, 1, 10, 34, 1};

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            if (arr[start] > arr[end]){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));        
    }
}

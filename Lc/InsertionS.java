import java.util.Arrays;

public class InsertionS {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr){
        for (int i = 0; i <= (arr.length - 2) ; i++){
            for (int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j - 1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp; 
    }
}

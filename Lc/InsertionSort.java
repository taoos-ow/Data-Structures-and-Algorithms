import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        insertionS(arr);
        System.out.println(Arrays.toString(arr));
    }

    // sort
    static void insertionS(int[] arr){
        for(int i = 0; i <= (arr.length - 2); i++){
            for (int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    // swap
    static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

    // find min
    // static int getMin(int[] arr, int start, int end){
    //     int min = end;
    //     for (int i = end; i >= start; i--){
    //         if(arr[i] < arr[min]){
    //             min = i;
    //         }
    //     }
    //     return min;
    // }
}

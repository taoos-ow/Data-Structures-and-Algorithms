import java.util.Arrays;

public class CyclicSortt{
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // sorting
    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                // swap(arr, i, correct);
                int temp = arr[i];
                arr[i] = arr[correct]; 
                arr[correct] = temp;
            }else{
                i++;
            }
        }
    }

    // static void swap(int[] arr, int st, int end){
    //     int temp = arr[st];
    //     arr[st] = arr[end]; 
    //     arr[end] = temp;
    // }

}
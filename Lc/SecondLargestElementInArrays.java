import java.util.Arrays;

/*Second Largest Element in an Array
Last Updated : 10 Feb, 2025
Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

Note: If the second largest element does not exist, return -1.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element. */

public class SecondLargestElementInArrays {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(secondMax(arr));
    }

    static int secondMax(int[] arr){
        int secondMax = -1;
        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i] != arr[i - 1]){
                secondMax = i - 1;
                break;
            }
        }
        return secondMax;
    }

    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j<arr.length; j++){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    static void swap(int[] arr, int first, int sec){        
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(thirdLargestEmement(arr));
    }

    static int thirdLargestEmement(int[] arr){     
        if(secondLargestEmement(arr) == -1){
            return secondLargestEmement(arr);
        }else{
            for(int i = secondLargestEmement(arr); i > 0; i++){
                if(arr[i] != arr[i - 1]){
                    return arr[i - 1];
                }
            }
        }
        return -1;
    }

    static int secondLargestEmement(int[] arr){
        sort(arr);
        int secondLargest = -1;
        for (int i = arr.length - 1;  i > 0; i--){
            if(arr[i] != arr[i - 1]){
                secondLargest = i - 1;
                break;
            }
        }
        return secondLargest;
    }

    static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j- 1 , j);
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

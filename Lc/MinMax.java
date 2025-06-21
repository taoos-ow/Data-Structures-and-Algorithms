public class MinMax {
    public static void main(String[] args) {
        int[] arr = {12, 43, 63, 2, 53, 366};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr){
        int minVal = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[minVal]){
                minVal =  i;
            }
        }
        return arr[minVal];
    }

    static int max(int[] arr){
        int maxVal = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[maxVal]){
                maxVal = i;
            }
        }
        return arr[maxVal];
    }
}

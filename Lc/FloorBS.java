public class FloorBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int target = 3;
        System.out.println(floorBS(arr, target));
    }

    static int floorBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1; 
            }else if(target < arr[mid]){
                end = mid -1 ;
            }else{
                return arr[mid];
            }
        }

        return arr[end];
    }
}

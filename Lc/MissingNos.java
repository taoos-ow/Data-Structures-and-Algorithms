import java.util.Arrays;

public class MissingNos {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1};
        System.out.println(missingNum(arr));
    }

    static int missingNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct]; 
                arr[correct] = temp;
            }else{
                i++;
            }

        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!= index ){
                return index;
            }
        }
        return arr.length;
    }
}

import java.util.ArrayList;
import java.util.List;


public class DisappearedNo{
    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNo(numbers);
        System.out.println(result);
    }

    public static List<Integer> findDisappearedNo(int[] nums){
        int i = 0;
        while(i <= nums.length - 1){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index <= nums.length - 1; index++){
            if(nums[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }

    public static void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findAllTheDuplicates(nums);
        System.out.println(result);
    }

    public static List<Integer> findAllTheDuplicates(int[] nums){
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
                ans.add(nums[index]);
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

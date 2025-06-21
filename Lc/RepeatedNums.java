public class RepeatedNums {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.print(findRepeatedNums(nums));
    }

    public static int findRepeatedNums(int[] nums){
        int i = 0;
        while(i <= nums.length - 1){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 4, 4, 4, 4, 4, 5,7};
        int target = 4;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean firstStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end -start) / 2;
            if(target < nums[start]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(firstStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

public class NoOfEvens1 {
    public static void main(String[] args) {
        int[] nums = {12, 653, 6784, 8, 953};
        System.out.println(findNumbers(nums));        
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int index = 0; index < nums.length; index++){
            if(isEven(nums[index])){
                count++;
            }
        }
        return count;
    }

    //Check whether the no is even or not
    static boolean isEven(int num){
        if(digits(num) % 2 == 0){
            return true;
        }
        return false;
    }

    //Get the no of digits
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}

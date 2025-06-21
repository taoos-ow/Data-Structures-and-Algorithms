public class NoOfEvens {
    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(num));
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

    static boolean isEven(int num){
        if(digits(num) % 2 == 0){
            return true;
        }
        return false;
    }

    //count the number of digits
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}

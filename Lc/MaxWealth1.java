public class MaxWealth1 {
    public static void main(String[] args) {
        int[][] acc = {{1, 2, 3},{3, 4, 5},{4, 2, 2},{5, 2, 5}};
        
        System.out.println(maximumWealth(acc));
    } 

    static int maximumWealth(int[][] nums){
        int max = Integer.MIN_VALUE;
        for(int customer = 0; customer < nums.length; customer++){
            int sum = 0;
            for(int account = 0; account<nums[customer].length; account++){
                sum = sum + nums[customer][account];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}

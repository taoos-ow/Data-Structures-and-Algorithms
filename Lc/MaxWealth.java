public class MaxWealth {
    public static void main(String[] args) {
        int[][] acc2 = {{1,5},{7,3},{3,5}};

        System.out.println(maximumWealth(acc2));
    }
    
    static int maximumWealth(int[][] arr){
        
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++){
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            if(sum > max){
                max = sum;
            }
        }  
        return max;
    }
}

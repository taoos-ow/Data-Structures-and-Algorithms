import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][3];
        
        for(int row = 0; row <= arr.length - 1; row++){
            for(int col = 0; col <= arr[row].length - 1; col++){
                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col]+ "\t");
            }
            System.out.println();
        }

                
    }
}

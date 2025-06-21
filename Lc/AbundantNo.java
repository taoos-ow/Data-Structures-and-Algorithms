import java.util.Scanner;

/* Abundant Numbers
Definition: A number whose sum of proper divisors is greater than the number itself.

Example:

12 → Divisors: 1, 2, 3, 4, 6 → 1 + 2 + 3 + 4 + 6= 16 > 12 */

public class AbundantNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int sum = 0;
            
        for(int i = 1; i <= n/2; i++){
            for(int j = 1; j <= n; j++){
                if(i * j == n){
                    sum = sum + i;
                }
            }
        }

        System.out.println(sum);
        if(sum > n){
            System.out.print(n + " is abundant number.");
        }else{
            System.out.print(n + " is not an abundant no.");
        }    
    }
    // static int length(int n){
    //     int count = 0;
    //     int rem;
        
    //     while(n != 0){
    //         rem = n % 10;
    //         n = n / 10;
    //         count++;
    //     }

    //     return count;
    // }
}

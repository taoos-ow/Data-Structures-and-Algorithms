import java.util.Scanner;

/* Deficient Numbers
Definition: A number whose sum of proper divisors is less than the number.
Example: 8 → Divisors: 1, 2, 4 → 1 + 2 + 4 = 7 < 8  */

public class DeficientNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int i;
        int j;

        // while(i <= n/2){
        //     while(j <= n){
        //         if(i * j == n){
        //             sum = sum + i;
        //         }
        //         j++;
        //     }
        //     i++;
        // }

        for(i = 1; i<=n/2; i++){
            for(j = 1; j <= n; j++){
                if(i * j == n){
                    sum = sum + i;
                }
            }
        }

        System.out.println(sum);

        if(sum < n){
            System.out.println(n + " is a deficient no.");
        }else{
            System.out.println(n + " is not a deficient no.");
        }
    }
}

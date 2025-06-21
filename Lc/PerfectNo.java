import java.util.Scanner;

//Definition: A number equal to the sum of all its proper positive divisors, excluding itself.
// Example:

// 28 → Divisors: 1, 2, 4, 7, 14 → 1 + 2 + 4 + 7 + 14 = 28

public class PerfectNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int rem;
        int sum = 0;
        if(n<=0){
            System.out.print("Enter a positive value");
        }

        // while(n != 0){
        //     rem = n % 10;
        for(int c = 1; c <= n/2; c++){
            for(int i = 1; i <= n; i++){
                if(c * i == n){
                    sum = sum + c;
                }
            }
        }
        // }
        System.out.println(sum);
        if(sum == n){
            System.out.print(n + " is a perfect no.");
        }else{
            System.out.print(n + " is not a perfect no");
        }
    }
    // static int length(int n){
    //     int count = 0;
    //     int rem;
        
    //     while( n != 0){
    //         rem = n % 10;
    //         n = n / 10;
    //         count++;
    //     }

    //     return count;
    // }
}

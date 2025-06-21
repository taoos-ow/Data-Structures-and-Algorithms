import java.util.Scanner;

public class NumType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int sum = 0;
        if(n <= 0){
            System.out.println("Enter a positive number.");
        }else{
            for(int i = 1; i <= n / 2; i++){
                    if( n % i == 0){
                        sum = sum + i;
                    }
                }
                System.out.println(sum);
                
                if(sum > n){
                    System.out.print(n + " is an abundant number.");
                }else if(sum < n){
                    System.out.print(n + " is a deficient number.");
                }else{
                System.out.print(n + " is a perfect number");
            }
        }
        
        
    }
}
// for(int i = 1; i <= n / 2; i++){
//     for(int j = 1; j <= n; j++){
//         if( i * j == n){                 Incorrect way
//             sum = sum + i;
//         }
//     }
// }

import java.util.Scanner;

/*Niven Numbers
Definition: A number divisible by the sum of its digits.
Example: 18 → 1 + 8 = 9 and 18 ÷ 9 = 2
*/

public class NivenNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int sum = 0;
        int rem;
        int newN = n;
        while(newN > 0){
            rem = newN % 10;
            sum = sum + rem;
            newN = newN / 10;                        
        }

        if(n % sum == 0 ){
            System.out.println(n + " is a niven no.");
        }else{
            System.out.println(n + " is not a niven no");
        }
    }
}

/*Palindromic Numbers
Definition: Numbers that read the same backward and forward.
Examples: 121, 1331, 12321 */

import java.util.Scanner;

public class PalindromicNums{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int rem;
        int ans = 0;
        int newN = n;

        while(newN > 0){
            rem = newN % 10;
            ans = ans * 10 + rem;
            newN = newN / 10; 
        }

        if(ans == n){
            System.out.print(n + " is the palindromic number.");
        }else{
            System.out.print(n + " is not the palindromic number.");
        }
    }
}
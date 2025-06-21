import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        
        Scanner in = new Scanner(System.in);
        int res = 1;
        int n = in.nextInt();

        if(n <= 0){
            System.out.print("Enter a positive number.");
        }

        int temp = n;

        int rem = 0;
        int sum = 0;
        while(temp != 0){
            rem = temp % 10;
            for(int i = 1; i <= length(n); i++){
                res = res * rem;
            }
            int newRes = res;
            res = 1;
            sum = sum + newRes;
            temp = temp / 10;
        }

        if(n == sum){
            System.out.print(n + " is an armstrong number.");
        }else{
            System.out.print(n + " is not an armstrong number");
        }
    }

    static int length(int n){

        int rem = 0;
        int count = 0;
        
        while( n != 0){
            rem = n % 10;
            n = n / 10;
            count++;
        }
        return count;
    }
}

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();
        int rem;
        int evenSum = 0;
        int oddSum = 0;

        if(n < 0){
            System.out.println("Invalid input");;
        }

        while(n != 0){
            rem = n % 10;
            if(rem % 2 == 0){
                evenSum = evenSum + rem;
            }else{
                oddSum = oddSum + rem;
            }
            n = n / 10;
        }

        System.out.println( "Sum of odd no: " + oddSum);
        System.out.println( "Sum of even no: " + evenSum);
    }
}

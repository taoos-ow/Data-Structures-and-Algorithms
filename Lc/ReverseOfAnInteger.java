import java.util.Scanner;

public class ReverseOfAnInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a val: ");
        int num = in.nextInt();
        int rem = 0;
        int reverse = 0;

        while(num != 0){
            rem = num % 10;
            reverse = (reverse * 10) + rem; 
            num = num / 10;
        }
        System.out.print(reverse);
    }
}

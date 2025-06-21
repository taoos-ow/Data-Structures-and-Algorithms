import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a val: ");
        int num = in.nextInt();

        int count = 0;
        int rem = 0;

        while(num != 0){
            rem = num % 10;
            if(rem == 8){
                count++;
            }
            num = num / 10; 
        }
        System.out.print(count);
    }
}

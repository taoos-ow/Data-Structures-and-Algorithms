import java.util.Scanner;

public class BasePower {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = in.nextInt();
        System.out.print("Enter power: ");
        int power = in.nextInt();
        int res = 1;

        for(int i = 1; i <= power; i++){
            res = res * (base);
        }
        System.out.print(res);
    }
}

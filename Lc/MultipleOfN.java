import java.util.Scanner;

public class MultipleOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.println("-----");
        for(int i = 1; i < 11; i++){
            System.out.println(i * n);
        }

    }
}

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salary in ₹: ");
        int salary = in.nextInt();

        if(salary > 9999){
            salary = salary + 2000;
        }
        if(salary < 10000){
            salary = salary + 1000;
        }

        System.out.print(salary);

    }
}

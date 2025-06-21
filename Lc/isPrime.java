import java.util.Scanner;

public class isPrime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = in.nextInt();

        boolean prime = true;

        if(num <= 1){
            prime = false;
        }

        for(int count = 2; count <= num/2; count++){
            
            if(num % count == 0){
                prime = false;
                break;
            }else{
                prime = true;
            }
        }

        if(prime){
            System.out.println("Prime NO");
        }else{
            System.out.print(" Not a PRIME NO");
        }
        
    }
}
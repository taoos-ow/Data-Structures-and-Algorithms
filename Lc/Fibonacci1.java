public class Fibonacci1 {
    public static void main(String[] args) {
        int p = 0;
        int i = 1;
        int count = 2;
        while(count <= 10){
            int temp = i;
            i = i + p;
            p = temp;
            count++;
            System.out.print(i + " ");
        }
    }
}
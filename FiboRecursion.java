public class FiboRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(7));   
    }

    public static int fibo(int n){
        //base condition
        if(n < 2){
            return n;
        }
        
        //recursive call
        return fibo(n - 1) + fibo(n - 2);
        
        //This is not the tail recursion because two functions are called
    }
}

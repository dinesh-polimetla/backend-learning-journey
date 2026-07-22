import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        }else{
            System.out.println(n + " is not a Prime Number.");
        }
        scanner.close();
    }
    public static boolean isPrime(int n){
        boolean isTrue = true;

        if(n < 2){
            return isTrue = false;
        }else{
            for(int i = 2;i <= n/2;i++){
                if(n % i == 0){
                    isTrue = false;
                }
            }
        }
        return isTrue;
    }
}

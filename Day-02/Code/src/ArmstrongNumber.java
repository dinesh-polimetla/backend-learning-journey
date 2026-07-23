import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if(isArmstrong(n)){
            System.out.println(n + " is an Armstrong Number");
        }else{
            System.out.println(n + " is not an Armstrong Number");
        }

        scanner.close();
    }
    // check whether the given number is Armstrong or not
    public static boolean isArmstrong(int n){
        int count = 1;
        int temp = n;
        while(temp >= 10){
            temp /= 10;
            count++;
        }
        temp = n;
        int sum = 0;
        for(int i = 0; i<count ; i++){
            int digit = temp % 10;
            sum += (int) Math.pow(digit,count);
            temp /= 10;
        }
        return sum == n;
    }
}

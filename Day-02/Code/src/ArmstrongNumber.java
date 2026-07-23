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
        int temp1 = n;
        while(temp1 >= 10){
            temp1 /= 10;
            count++;
        }
        int[] nums = new int[count];
        int temp2 = n;
        for(int i = 0; i<count ; i++){
            nums[i] = temp2 % 10;
            temp2 /= 10;
        }
        int sum = 0;
        for(int i = 0; i<count ; i++){
            sum += (int) Math.pow(nums[i],count);
        }
        return sum == n;
    }
}

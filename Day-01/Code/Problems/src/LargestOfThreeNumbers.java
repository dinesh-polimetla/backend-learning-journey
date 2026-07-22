import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " is the largest Number");
        }else if(n2 > n1 && n2 > n3){
            System.out.println(n2+" is the largest Number");
        }else{
            System.out.println(n3 +" is the largest Number");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter first number: ");
        num1 = in.nextInt();
        System.out.println("Enter second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
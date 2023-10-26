import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            System.out.print("Enter " +i+ "th index element: ");
            arr[i] = in.nextInt();
        }

        System.out.print(Arrays.toString(arr)f+ " ");
    }
}

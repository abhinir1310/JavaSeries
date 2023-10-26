import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int min, temp = 0;
        for (int i = 0; i<arr.length; i++){
            min = i;
            for (int j = i+1; j <arr.length; j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
                temp = arr[i];
                arr[i] = arr[min];
                arr[min]= temp;
            }
        }
        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

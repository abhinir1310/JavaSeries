import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i =0; i<n; i++){
            arr[i]=in.nextInt();
        }
        int temp, j;
        for (int i =0; i<arr.length; i++){
            temp = arr[i];
            j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = temp;
        }
        for (int i = 0; i <n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

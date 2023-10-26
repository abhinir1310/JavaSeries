import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        String[] arr = new String[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i< n; i++){
            arr[i] = in.next();
        }
        String temp;
        int j;
        for (int i = 1; i<arr.length; i++){
            temp = arr[i];
            j=i;
            while (j>0 && arr[j-1].compareTo(temp)>0){
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j]= temp;
        }
        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

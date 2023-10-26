import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        String[] arr = new String[n];
        System.out.print("Enter the elements: ");
        for (int i =0; i <n; i++){
            arr[i]=in.next();
        }
        int min;
        String temp = "";
        for (int i = 0; i<arr.length; i++){
            min = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[j].compareTo(arr[min])<0){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i]= arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        String[] arr = new String[n];
//        in.nextLine();
        System.out.print("The elements are: ");
        for (int i = 0; i<n; i++){
            arr[i] = in.next();
        }
        for (int i = 0; i<arr.length; i++){
            int flag = 0;
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j].compareTo(arr[j+1])>0){
                    String temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = 1;
                }
            }
            if (flag ==0){
                break;
            }
        }
        for (int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

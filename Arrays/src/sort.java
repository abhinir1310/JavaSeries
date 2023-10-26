import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i =0; i<arr.length; i++){
            int flag = 0;
            for (int j = 0; j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = 1;
                }
            }
            if (flag ==0){
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

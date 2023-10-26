import java.util.*;
public class nikhil {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        String[] str=new String[n];
        System.out.println("Enter String" );
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
        System.out.println("Strings are: ");
        for(int j=0;j<str.length;j++){
            System.out.println(str[j]);
        }
    }
}

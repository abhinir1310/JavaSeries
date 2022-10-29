import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//        int num = (int) (65.25f);
//        System.out.println(num);

//        int a = 257;
//        byte b = (byte)(a);
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b /c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int number = 'A';
//        System.out.println(3 * 5.65);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}

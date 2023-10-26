import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(25);
//        list.add(654);
//        list.add(6645);
//        list.add(6743);
//        list.add(997895);
//        list.add(5648);

//        System.out.println(list.contains(67543));
//        System.out.println(list);
//
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i< 5; i++){
            list.add(in.nextInt());
        }
        for (int i =0; i<5; i++){
            System.out.println(list.get(i));
        }

//        System.out.println(list);
    }
}

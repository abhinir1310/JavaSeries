import java.util.Arrays;

public class Passing {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12,16};
        System.out.println(Arrays.toString(nums));
        chane(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void chane(int[] arr){
        arr[0] = 99;
    }
}

package Com.Array;
import java.util.Arrays;
public class changefun {
    public static void main(String[] args) {
        int[] num = {2,3,4,53,3};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
     static void change(int[] num){
        num[3]= 88;
     }
}

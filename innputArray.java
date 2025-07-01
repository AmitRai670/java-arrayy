package Com.Array;

import java.util.Scanner;
import java.util.Arrays;

public class innputArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int[] arr = new int[5];
       arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // System.out.println(arr[0]);


        // input using for loops
//
//        for(int i=0;i<arr.length;i++){
//           arr[i] = sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));

//        for(int i=0;i<arr.length;i++){
//           System.out.print(arr[i]);
//        }

        // for String
        String[] str =new String[4];
        for(int i = 0; i<str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));


    }
}

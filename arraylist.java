package Com.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(33);
//        list.add(44);
//        list.add(55);
//        list.add(66);
//        list.add(77);
//        list.add(88);
//        list.add(99);
//        list.add(99);
//        list.add(99);
//        list.set(0, 44);
//        list.remove(3);

        for(int a=0;a<5;a++){
            list.add(sc.nextInt());
        }
        //get item at any index
        for(int a=0;a<5;a++){
           System.out.println(list.get(a));
        }
            System.out.println(list);
    }
}

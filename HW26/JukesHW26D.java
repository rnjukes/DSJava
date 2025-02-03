//Ryan Jukes
//1-31-25
//AT Java HW26 D

import java.util.Arrays;
import java.util.ArrayList;

public class JukesHW26D {
    public static void swap(ArrayList<Integer> list, int x, int y) {
        if (x >= 0 && x < list.size() && y >= 0 && y < list.size()) {
            int z = list.get(x);
            list.set(x, list.get(y));
            list.set(y, z);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(8,6,7,5,3,0,9));
        System.out.println("Pre-swap array: "+list2);
        swap(list2, 2, 4);
        System.out.println("Post-swap array: "+list2);
    }
}

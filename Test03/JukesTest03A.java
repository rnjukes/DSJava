//Ryan Jukes
//1-21-25
//AT JAva Test Practical Part A

import java.util.Arrays;

public class JukesTest03A {

    public static void swap(int numb1, int numb2, int[] array){
        if (numb1 >= 0 && numb1 < array.length && numb2 >= 0 && numb2 < array.length) {
            int x = array[numb1];
            array[numb1] = array[numb2];
            array[numb2] = x;
        }
    }
 public static void main(String[] args) {
        int [] numbers ={0,1,2,3,4,5,6,7,8,9};
        swap(2, 7, numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
   

package solutions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution004 {
    //Revers Int mass
    public static void main(String[] args) {
        int[] array = {3, 3, 5, 8, 2, 7, 1, 3, 4, 22, 5};
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++){
            int prev = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = prev;
        }

        for (int x : array) {
            System.out.println(x);
        }
    }
}

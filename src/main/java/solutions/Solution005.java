package solutions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution005 {
    public static void main(String[] args) throws IOException {
        //Longest Sequence Int
        ArrayList<Integer> list = new ArrayList(Arrays.asList(2, 4, 4, 4, 8, 8, 4, 12, 12, 14));
        ArrayList<Integer> listSimilar = new ArrayList<>();
        int count = 0;
        int max = Integer.MIN_VALUE;
        //System.out.println(max);
        for (int i = 1; i < 10; i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                count++;
            } else count = 1;
            if (max < count) {
                max = count;
            }
        }
        System.out.println(max);
    }
}


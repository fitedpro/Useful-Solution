/*
    Minimum value with different number input values
 */


public class Solution002 {
    public static int min(int a, int b) {
        int min = 0;
        if ((a < b) & (a != b)) {
            min = a;
        }
        else min = b;
        return min;
    }

    public static int min(int ... v) {
        int minF = 0;
        minF = min(v[0], v[1]);
        for (int i = 0; i < v.length; i++){
            minF = min(minF, v[i]);
        }
        return minF;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}


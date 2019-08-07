public class Solution001 {
    /*
        Calculate the length of the entered number INT
     */

    static int numlength(int n)
    {
        if (n == 0) return 1;
        int l;
        n=Math.abs(n);
        for (l=0;n>0;++l)
            n/=10;
        return l;
    }

    public static void main(String[] args) {
        System.out.println("Everything is OK!");
    }
}

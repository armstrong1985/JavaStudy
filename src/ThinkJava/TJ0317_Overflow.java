package thinkjava;

public class TJ0317_Overflow {
    public static void main() {
        int big = Integer.MAX_VALUE;
        System.out.println("большое = " + big);
        int bigger = big * 4;
        System.out.println("еще больше = " + bigger);
    }
}

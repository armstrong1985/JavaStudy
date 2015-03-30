package ThinkJava;

import java.util.Random;

/**
 * Created by Администратор on 29.03.2015.
 */
public class TJ0309_Bool {
    public static void main() {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        // Treating an int as a boolean is not legal Java:
        //! print("i && j is " + (i && j));
        //! print("i || j is " + (i || j));
        //! print("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) is "
                + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is "
                + ((i < 10) || (j < 10)));
    }
}

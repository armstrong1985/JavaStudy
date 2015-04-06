package thinkjava;
import options.F;
import options.S;

import static utils.Print.*;

public class TJ0314_TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }
    static int standardIfElse(int i) {
        if(i < 10)
            return i * 100;
        else
            return i * 10;
    }
    public static void main() {
        print("ternary(9) = " + ternary(9));
        for(int i = 0; i<1000000; i++){
            ternary(9);
        }
        F.inish();S.tart();

        print("standardIfElse(9) = " + standardIfElse(9));
        for(int i = 0; i<1000000; i++){
            standardIfElse(9);
        }
        F.inish();S.tart();

        print("ternary(10) = " + ternary(10));
        for(int i = 0; i<1000000; i++){
            ternary(10);
        }
        F.inish();S.tart();

        print("standardIfElse(10) = " + standardIfElse(10));
        for(int i = 0; i<1000000; i++){
            standardIfElse(10);
        }
    }
}

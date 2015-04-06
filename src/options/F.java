package options;

public class F {
    public static void inish(){
        String resTime = "Programm run time is " + (System.currentTimeMillis() - S.tartTime) + " ms";
        String sepString = "";
        for (int i=0 ; i<(4+resTime.length()); i++)
            sepString += S.ymbol;
        System.out.println(sepString);
        System.out.println(S.ymbol + " " + resTime + " " + S.ymbol);
        System.out.println(sepString);
    }
}

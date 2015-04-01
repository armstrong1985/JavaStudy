import ThinkJava.*;
import Work.BoolArrayToBytes;

public class JavaStudy {

    public static void main(String[] args){
        long start = System.currentTimeMillis();
        //TJ0312_URShift.main();
        boolean[] b = new boolean[64];
        //b[0]=true; b[1]=true; b[2]=true; b[3]=true; b[4]=true; b[5]=true; b[6]=true; b[7]=true;
        //b[8]=true; b[9]=true; b[10]=true; b[11]=true; b[12]=true; b[13]=true; b[14]=false; b[15]=false;

        //byte[] B = BoolArrayToBytes.boolArrayToBytes(b);
        for (int j = 0; j < 1000; j++)
            for (int k = 0; k < 1000; k++)
                BoolArrayToBytes.boolArrayToBytes(b);
//        System.out.println("byte[] B is:");
//        for (int i=0; i<B.length ; i++)
//            System.out.println("B["+i+"] = " + Byte.toString(B[i]));
            System.out.println("Run time is " + (System.currentTimeMillis() - start) + " ms");
    }
}

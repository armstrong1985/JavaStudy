import ThinkJava.*;
import Work.BoolArrayToBytes;

public class JavaStudy {

    public static void main(String[] args){
        /** Комментарий к классу TJ0201_HelloDate */
        //TJ0312_URShift.main();
        boolean[] b = new boolean[23];
        //b[0]=true; b[1]=true; b[2]=true; b[3]=true; b[4]=true; b[5]=true; b[6]=true; b[7]=true;
        //b[8]=true; b[9]=true; b[10]=true; b[11]=true; b[12]=true; b[13]=true; b[14]=false; b[15]=false;
        //byte[] B = new byte[ ((b.length)/8 + ((b.length%8==0)?0:1) ) ];
        byte[] B = BoolArrayToBytes.boolArrayToBytes(b);

        System.out.println("byte[] B is:");
        for (int i=0; i<B.length ; i++)
            System.out.println("B["+i+"] = " + Byte.toString(B[i]));
    }
}

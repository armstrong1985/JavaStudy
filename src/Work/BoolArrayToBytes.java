package Work;

public class BoolArrayToBytes {
    public static byte[] boolArrayToBytes(boolean[] boolArr){
        // Calculate size and create array of bytes
        byte[] byteArr = new byte[( (boolArr.length)/8 + ((boolArr.length%8==0)?0:1) )];

        // Calculate value of corresponding bits and "insert" it to byte (using rule 2^b0+2^b1+..2^b7)
        for (int i=0; i<boolArr.length; i++)
                byteArr[(i/8)] += ( (boolArr[i]) ? ((byte)Math.pow(2,(i%8))) : 0 );     // This part can be optimized using SHIFT and LOGICAL OR operation

        return byteArr;
    }
}

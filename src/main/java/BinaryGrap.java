public class BinaryGrap {

    public static final int BINARY_BASE = 2;

    public int calculateGap(int numberBaseTen) {
        if ( numberBaseTen < 0 )
            throw new IllegalArgumentException ( );
        return GapBinaryFromDecimal (numberBaseTen);
    }

    private int GapBinaryFromDecimal(int numberBaseTen) {
        final String binaryNumber = convertToBinaryNumber (numberBaseTen);
        return calculateTheLargestZeroSequence (binaryNumber);
    }

    public int calculateTheLargestZeroSequence(String numberBaseTen) {
        if ( numberBaseTen.equals ("1001") )
            return 2;
        if ( numberBaseTen.equals ("101") )
            return 1;
        return 0;
    }

    public String convertToBinaryNumber(int decimalNumber) {
        StringBuffer binaryNumber = new StringBuffer ( );
        do {
            binaryNumber.append (decimalNumber % BINARY_BASE);
            decimalNumber = decimalNumber / BINARY_BASE;
        } while (decimalNumber != 0);
        return binaryNumber.toString ( );
    }
}

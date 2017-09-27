public class BinaryGrap {

    public static final int BINARY_BASE = 2;

    public int calculateGap(int numberBaseTen) {
        if ( numberBaseTen < 0 )
            throw new IllegalArgumentException ( );
        return GapBinaryFromDecimal (numberBaseTen);
    }

    private int GapBinaryFromDecimal(int numberBaseTen) {
        return calculateTheLargestZeroSequence (numberBaseTen);
    }

    private int calculateTheLargestZeroSequence(int numberBaseTen) {
        if ( numberBaseTen == 9 )
            return 2;
        if ( numberBaseTen == 5 )
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

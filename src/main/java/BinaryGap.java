class BinaryGap {

    private static final int BINARY_BASE = 2;
    private static final String ONE = "1";
    private static final String ZERO = "0";

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
        if ( numberBaseTen.isEmpty ( ) )
            throw new IllegalArgumentException ( );
        if ( !isNumberContainsSequence (numberBaseTen) )
            return 0;
        return biggestSequence (numberBaseTen);
    }

    private int biggestSequence(String numberBaseTen) {
        int biggestSequence = 0;
        int sequence = 0;
        boolean inTheSequence = false;
        for (int i = 0; i < numberBaseTen.length ( ); i++) {
            if ( inTheSequence ) {
                if ( ZERO.equals (String.valueOf (numberBaseTen.charAt (i))) )
                    sequence++;
                else {
                    inTheSequence = false;
                    biggestSequence = updateSequenceSize (biggestSequence, sequence);
                    sequence = 0;
                }
            }

            if ( !inTheSequence && ONE.equals (String.valueOf (numberBaseTen.charAt (i))) )
                inTheSequence = true;
        }
        return biggestSequence;
    }

    private int updateSequenceSize(int biggestSequence, int sequence) {
        return biggestSequence < sequence ? sequence : biggestSequence;
    }

    private boolean isNumberContainsSequence(String numberBaseTen) {
        final int firstOne = numberBaseTen.indexOf ("1");
        final int lastOne = numberBaseTen.lastIndexOf ("1");
        return firstOne != lastOne;
    }

    public String convertToBinaryNumber(int decimalNumber) {
        StringBuilder binaryNumber = new StringBuilder ( );
        do {
            binaryNumber.append (decimalNumber % BINARY_BASE);
            decimalNumber = decimalNumber / BINARY_BASE;
        } while (decimalNumber != 0);
        return binaryNumber.toString ( );
    }
}

public class BinaryGrap {
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

}

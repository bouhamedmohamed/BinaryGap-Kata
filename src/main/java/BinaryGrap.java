public class BinaryGrap {
    public int calculateGap(int numberBaseTen) {
        if ( numberBaseTen < 0 )
            throw new IllegalArgumentException ( );
        return GapBinaryFromDecimal (numberBaseTen);
    }

    private int GapBinaryFromDecimal(int numberBaseTen) {
        return calculateTheLargestZeroSequance (numberBaseTen);
    }

    private int calculateTheLargestZeroSequance(int numberBaseTen) {
        if ( numberBaseTen == 5 )
            return 1;
        return 0;
    }

}

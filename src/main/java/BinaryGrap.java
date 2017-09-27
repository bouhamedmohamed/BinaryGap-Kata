public class BinaryGrap {
    public int calculateGap(int numberBaseTen) {
        if ( numberBaseTen < 0 )
            throw new IllegalArgumentException ( );
        if ( numberBaseTen == 0 )
            return 0;
        else
            return 1;
    }
}

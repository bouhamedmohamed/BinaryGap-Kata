import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void setUp() throws Exception {
        binaryGap = new BinaryGap ( );
    }

    @Test
    public void should_return_0_in_case_of_0() {
        Assert.assertEquals (0, binaryGap.calculateGap (0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_raise_exception_when_negative_number() {
        binaryGap.calculateGap (-1);
    }

    @Test
    public void should_return_1_in_case_of_5() {
        Assert.assertEquals (1, binaryGap.calculateGap (5));
    }

    @Test
    public void should_return_0_in_case_of_1() {
        Assert.assertEquals (0, binaryGap.calculateGap (1));
    }

    @Test
    public void should_return_2_in_case_of_9() {
        Assert.assertEquals (2, binaryGap.calculateGap (9));
    }
}

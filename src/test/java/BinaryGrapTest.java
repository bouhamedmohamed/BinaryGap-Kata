import org.junit.Assert;
import org.junit.Test;

public class BinaryGrapTest {
    @Test

    public void should_0_return_0() {
        final BinaryGrap binaryGrap = new BinaryGrap ( );
        Assert.assertEquals (0, binaryGrap.calculateGrap (0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_raise_exception_when_negative_number() {
        final BinaryGrap binaryGrap = new BinaryGrap ( );
        binaryGrap.calculateGrap (-1);
    }
}

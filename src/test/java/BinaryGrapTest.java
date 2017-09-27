import org.junit.Assert;
import org.junit.Test;

public class BinaryGrapTest {
    @Test

    public void should_0_return_0() {
        final BinaryGrap binaryGrap = new BinaryGrap ( );
        Assert.assertEquals (0, binaryGrap.calculateGrap (0));
    }
}

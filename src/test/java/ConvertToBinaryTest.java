import org.junit.Assert;
import org.junit.Test;

public class ConvertToBinaryTest {
    @Test

    public void should_return_0_when_0() {
        Assert.assertEquals ("0", new BinaryGrap ( ).convertToBinaryNumber (0));
    }
}

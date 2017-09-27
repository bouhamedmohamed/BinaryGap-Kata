import org.junit.Assert;
import org.junit.Test;

public class CalculateTheLargestZeroSequenceTest {
    @Test
    public void should_return_zero_case_of_0() throws Exception {
        Assert.assertEquals (0, new BinaryGrap ( ).calculateTheLargestZeroSequence ("0"));
    }
}

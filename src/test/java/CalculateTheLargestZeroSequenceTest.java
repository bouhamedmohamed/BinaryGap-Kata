import org.junit.Assert;
import org.junit.Test;

public class CalculateTheLargestZeroSequenceTest {
    @Test
    public void should_return_zero_case_of_0() throws Exception {
        Assert.assertEquals (0, new BinaryGrap ( ).calculateTheLargestZeroSequence ("0"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void should_raise_exception_when_empty_string() throws Exception {
         new BinaryGrap ( ).calculateTheLargestZeroSequence ("");
    }
}

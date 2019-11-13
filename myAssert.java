import org.junit.Test;
import java.util.function.BooleanSupplier;

public class myAssert {

    @Test(expected = AssertionError.class)
    public void perform() {
        assertThat(() -> 2 * 2 == 5);
    }

    public void assertThat(BooleanSupplier assertion) {
        if (!assertion.getAsBoolean()) {
            throw new AssertionError();
        }
    }



}
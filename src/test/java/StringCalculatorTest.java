import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    @Test
    public void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            StringCalculator.add("-1,5");
        });

        String expectedMessage = "Negatives not allowed";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void whenNumberGreaterThan1000IsUsedThenItIsIgnored() {
        assertEquals(1, StringCalculator.add("1,1000"));
    }
}

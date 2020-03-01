import gitlab.foxminded.task5.Formatter;
import gitlab.foxminded.task5.WordsCounter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class FormatterTest {
    WordsCounter counterSpy = Mockito.spy(WordsCounter.class);
    private Formatter formatter = new Formatter();
    private final String expectedStandart = "a 1\n" +
            "c 2\n" +
            "d 1\n";

    @Test
    public void standartTest() {
        Mockito.when(counterSpy.count("acdc")).thenReturn(Stream.of(
                new AbstractMap.SimpleEntry<>('a', 1),
                new AbstractMap.SimpleEntry<>('c', 2),
                new AbstractMap.SimpleEntry<>('d', 1))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
        String actual = formatter.symbolsCount(counterSpy.count("acdc"));
        assertEquals(expectedStandart, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNullsPassed() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.symbolsCount(null);
        });
        final String expectedMessage = "should be String parameter";
        final String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }


}

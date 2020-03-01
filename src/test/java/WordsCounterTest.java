import gitlab.foxminded.task5.WordsCounter;
import org.junit.jupiter.api.Test;
import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class WordsCounterTest {

    private WordsCounter counter = new WordsCounter();
    private Map<Character, Integer> expectedMap = Stream.of(
            new AbstractMap.SimpleEntry<>('a', 1),
            new AbstractMap.SimpleEntry<>('c', 2),
            new AbstractMap.SimpleEntry<>('d', 1))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    @Test
    public void standartTest() {
        Map actual = counter.count("acdc");
        assertEquals(expectedMap, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNullsPassed() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            counter.count(null);
        });
        final String expectedMessage = "should be String parameter";
        final String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }


}

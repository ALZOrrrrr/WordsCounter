import gitlab.foxminded.task5.WordsCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class WordsCounterTest {

        WordsCounter counter = new WordsCounter();
        private final String expectedStandart = "H 1\n" +
                "e 1\n" +
                "l 2\n" +
                "o 1\n";

        @Test
        public void standartTest() {
            counter.count("Hello");
           String actual = counter.getCounts("Hello");
            assertEquals(expectedStandart, actual);
        }

        @Test
        public void nullTest() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                counter.count(null);
            });

            final String expectedMessage = "should be String parameter";
            final String actualMessage = exception.getMessage();

            assertTrue(actualMessage.contains(expectedMessage));
        }



}

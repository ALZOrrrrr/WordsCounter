import gitlab.foxminded.task5.Formatter;
import gitlab.foxminded.task5.WordsCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class WordsCounterTest {

        private WordsCounter counter = new WordsCounter();
        private Formatter formatter = new Formatter();
        private final String expectedStandart = "a 1\n" +
                "c 2\n" +
                "d 1\n";

        @Test
        public void standartTest() {
            counter.count("acdc");
           String actual = formatter.format(counter.count("acdc"));
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

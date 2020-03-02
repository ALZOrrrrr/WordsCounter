package gitlab.foxminded.task5;


import java.util.Map;

public class Formatter {

    private String SPACE = " ";

    public String format(Map<Character, Integer> symbolsCount) {
        StringBuilder output = new StringBuilder();
        for (char key : symbolsCount.keySet()) {
            output.append(key + SPACE + symbolsCount.get(key) + "\n");
        }
        return output.toString();
    }
}

package gitlab.foxminded.task5;


import java.util.Map;

public class Formatter {

    private String SPACE = " ";

    public String symbolsCount(Map<Character, Integer> myMap) {
        StringBuilder output = new StringBuilder();
        for (char key : myMap.keySet()) {
            output.append(key + SPACE + myMap.get(key) + "\n");
        }
        return output.toString();
    }
}

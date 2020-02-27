package gitlab.foxminded.task5;


import java.util.Map;

public class Formatter {

    private String SPACE = " ";
    public String format(Map<Character, Integer> myMap) {
        StringBuilder strb = new StringBuilder();

        for (char key : myMap.keySet()) {
            strb.append(key + SPACE + myMap.get(key) + "\n");
        }
        return strb.toString();
    }
}

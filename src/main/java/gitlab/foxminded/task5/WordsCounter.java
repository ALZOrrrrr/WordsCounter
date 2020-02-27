package gitlab.foxminded.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordsCounter {

    private HashMap<String, HashMap<Character, Integer>> mapOfMaps = new HashMap<>();
    private Formatter formatter = new Formatter();

    private void validate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("should be String parameter");
        }
    }

    public String count(String input) {

        String output;

        if (mapOfMaps.containsKey(input)) {
            output = formatter.getCounts(input, mapOfMaps);
            return output;
        } else {
            validate(input);

            char[] myCharArray = input.toCharArray();
            List<Character> chars = new ArrayList<>();

            for (char a : myCharArray) {
                chars.add(a);
            }

            HashMap<Character, Integer> myMap = new HashMap<>();

            for (char a : myCharArray) {
                int count = 0;
                for (int i = 0; i < chars.size(); i++) {
                    if (chars.get(i) == null) {
                    } else if (a == chars.get(i)) {
                        count++;
                        chars.set(i, null);
                    }
                }
                if (count != 0) {
                    myMap.put(a, count);
                }

            }
            mapOfMaps.put(input, myMap);
            output = formatter.getCounts(input, mapOfMaps);
            return output;
        }
    }
}
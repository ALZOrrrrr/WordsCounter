package gitlab.foxminded.task5;

import java.util.*;

public class WordsCounter {

    private Map<String, Map<Character, Integer>> cache = new HashMap<>();

    private void validate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("should be String parameter");
        }
    }

    public Map count(String input) {


        validate(input);

        if (cache.containsKey(input)) {

            return cache.get(input);
        } else {


            char[] myCharArray = input.toCharArray();

            List<Character> chars = new ArrayList<>();

            for (char a : myCharArray) {
                chars.add(a);
            }

            Map<Character, Integer> returnMap = new HashMap<>();

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
                    returnMap.put(a, count);
                }

            }
            cache.put(input, returnMap);
            return returnMap;
        }
    }
}
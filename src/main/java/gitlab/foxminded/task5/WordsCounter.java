package gitlab.foxminded.task5;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;

public class WordsCounter {

    private HashMap<String, HashMap> mapOfMaps = new HashMap<>();

    private void validate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("should be String parameter");
        }
    }

    public void count(String input) {

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
    }

    public String getCounts(String str) {
        StringBuilder strb = new StringBuilder();

        if (mapOfMaps.containsKey(str)) {

            HashMap map = mapOfMaps.get(str);
            char[] charArray = str.toCharArray();
            List<Character> keysList = new ArrayList<>();
            for (char a : charArray) {
                if (!keysList.contains(a)) {
                    keysList.add(a);
                }
            }
            for (char a : keysList) {
                strb.append(a + " " + map.get(a) + "\n");
            }
        } else {
            System.out.println("no such String");
        }
        return strb.toString();
    }
}
package gitlab.foxminded.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Formatter {

    public String getCounts(String str, HashMap<String, HashMap<Character, Integer>> mapOfMaps) {
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

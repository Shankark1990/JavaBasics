package interview_programs;

import java.util.Map;
import java.util.TreeMap;

public class CountOccurenceInString {
    public static void main(String[] args) {
        String str = "AutomationTesting";
        Map<Character, Integer> map = new TreeMap<>();

        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            if (map.containsKey(ch)) {

                int value=map.get(ch)+1;
                map.put(ch, value);
//                map.put(ch, (map.get(ch)) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map.toString());
    }
}

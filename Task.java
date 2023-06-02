import java.util.HashMap;
import java.util.Map;

public class Task{
    static String firstNonRepeated(String str){
        Map<Character, Integer> map = new HashMap<>();
        //find the number of occurrences of each character
        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //find and return the first character with occurrence count 1
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                return String.valueOf(c);
            }
        }
        //return empty string if not found
        return "";
    }

    public static void main(String[] args) {
        //expected output: "h"
        System.out.println(firstNonRepeated("hello"));
        //expected output: "b"
        System.out.println(firstNonRepeated("aabcc"));
        //expected output: ""
        System.out.println(firstNonRepeated("aabbcc"));
    }
}

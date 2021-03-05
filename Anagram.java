import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        String [] StringArray = new String[] {"kita", "atik", "tika", "aku", "kia", "makan", "kua"};
        groupAnagrams(StringArray);
    }

    static void groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> keyMap = new ArrayList<>();
        for (String str : strs) {
        	char[] strChar = str.toCharArray();
        	Arrays.sort(strChar);
        	String key = new String(strChar);
        	List<String> value = map.getOrDefault(key, new ArrayList<String>());
        	value.add(str);
        	map.put(key, value);
        	if (!keyMap.contains(key)) {
        		keyMap.add(key);
        	}
        }
        
        for(String key : keyMap) {
        	System.out.println(map.get(key));
        }
    }
}

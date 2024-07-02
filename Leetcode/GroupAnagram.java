package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        // Capture the result of the groupAnagramCategorizeByFrequency method
        List<List<String>> result = groupAnagramCategorizeByFrequency(strs);

        // Print the result to verify the output
        for (List<String> group : result) {
            System.out.println(group);

        }
    }

    public static List<List<String>> groupAnagramCategorizeByFrequency(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        //
        GroupAnagram instance = new GroupAnagram();
        for (String str : strs) {
            String key = instance.getFrequencyString(str);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(key, strList);
            }
        }
        return new ArrayList<>(map.values());
    }

    private String getFrequencyString(String str) {
        // frequancy bucket
        int[] freq = new int[26];
        // iterates over each character
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        // Start creating frequency string
        StringBuilder frequencyString = new StringBuilder("");
       // iterates over each bucket
        char c = 'a';
        // iterates over each bucket
        for (int i : freq) {
            frequencyString.append(c);
            frequencyString.append(i);
            c++;

        }
        return frequencyString.toString();
    }
}

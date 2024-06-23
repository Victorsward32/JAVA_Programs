package DSA.ArrayList.Collections.HashMAp;

import java.util.*;

public class CountCharacters {

    private static final String InputString = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        CharacterCount(name);
        sc.close();
    }

    public static void CharacterCount(String name) {
        // Creating a HashMap to store the character and its count
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        // Storing the characters in the array
        char[] arr = name.toCharArray();
        // Iterating through the array and adding the characters to the HashMap
        for (char c : arr) {
            // If the character is already present in the HashMap, then increment the count by 1
            if (charCountMap.containsKey(c)) {
                // If the character is not present in the HashMap, then add the character and its count as 1
                charCountMap.put(c, charCountMap.get(c) + 1);
                // If the character is present in the HashMap, then increment the count by 1
            } else {
                // If the character is not present in the HashMap, then add the character and its count as 1
                charCountMap.put(c, 1);
            }
        }
        // Printing the charCountMap
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}

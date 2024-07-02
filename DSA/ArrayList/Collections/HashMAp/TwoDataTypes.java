package DSA.ArrayList.Collections.HashMAp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TwoDataTypes {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("Key1", Arrays.asList("Value1", "Value2"));
        map.put("Key2", Arrays.asList("Value3", "Value4"));

        System.out.println(map.get("Key1"));

        HashMap<String, List<LinkedList<String>>> map2 = new HashMap<>();
        map2.put("key", Arrays.asList(new LinkedList<String>(Arrays.asList("value1", "value2")),
                new LinkedList<String>(Arrays.asList("value3", "value4"))));
        System.out.println(map2.get("key"));

        HashMap<String, List<Stack<String>>> map3 = new HashMap<>();
        List<Stack<String>> stacks = new ArrayList<>();
        stacks.add(new Stack<>());
        stacks.add(new Stack<>());
        stacks.add(new Stack<>());
        stacks.get(0).push("aa");
        stacks.get(1).push("bb");
        map3.put("key", stacks);
        System.out.println(map3.get("key"));

        // HashMap<String,> map4 = new HashMap<>();


    }
    
}

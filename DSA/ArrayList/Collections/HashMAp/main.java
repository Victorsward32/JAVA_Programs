package DSA.ArrayList.Collections.HashMAp;

import java.util.HashMap;

class main{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Jhon", 11);
        map.put("Jane", 12);
        // map.remove("Jane");
        map.put("Jane", 13);
    
        System.out.println(map);
    }
}
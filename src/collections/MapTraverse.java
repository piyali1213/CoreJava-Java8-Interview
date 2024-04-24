package collections;

import java.util.HashMap;
import java.util.Map;

public class MapTraverse {
    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(2, "two");
        hashmap.put(5, "five");
        hashmap.put(1, "one");
        hashmap.put(10, "ten");
        traverseMap(hashmap);
    }
    public static void traverseMap(Map<Integer,String> map)
    {
        map.forEach((k,v)-> System.out.println("key : "+ k +" value : " +v));
    }
}

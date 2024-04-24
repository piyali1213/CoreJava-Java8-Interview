package collections;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapKey {
    public static void main(String[] args) {

        Map<Integer, String> map= new HashMap<>();
        map.put(111, "piyali");
        map.put(222, "ali");
        map.put(444, "piya");
        map.put(333, "Arghya");
        //sortMapKey(map);

    }
//   public  static void sortMapKey(Map<Integer,String> map) {
//        Map<Integer, String> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
//                .collect(Collectors.toMap((Entry::getKey, Entry::getValue), (x, y) -> x, LinkedHashMap::new);
//        System.out.println(sortedMap);
//    }
}

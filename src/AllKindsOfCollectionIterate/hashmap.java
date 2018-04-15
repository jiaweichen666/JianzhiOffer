package AllKindsOfCollectionIterate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("China","中国");
        hashMap.put("Japan","日本");
        hashMap.put("America","美国");
        String s = hashMap.getOrDefault("England","英国");
        String ss = hashMap.putIfAbsent("England","英国");
        System.out.println(s);
        Iterator<Map.Entry<String,String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            String key =(String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}

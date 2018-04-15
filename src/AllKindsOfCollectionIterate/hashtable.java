package AllKindsOfCollectionIterate;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("China","中国");
        hashtable.put("Japan","日本");
        hashtable.put("America","美国");
        Iterator<Map.Entry<String,String>> iterator = hashtable.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}

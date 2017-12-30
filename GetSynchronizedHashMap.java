import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Map;

public class GetSynchronizedHashMapExample{
    public static void main(String[] args){
        
        HashMap<String, String> map = new HashMap<String, String>();
        
        //If multiple threads access a hash map concurrently, and at least one of the threads modifies the map structurally, it must be synchronized externally to avoid an inconsistent view of the contents.
        Map<String, String> syncMap = Collections.synchronizedMap(map);
        
        syncMap.put("ONE", "AAA");
        syncMap.put("TWO", "BBB");
        syncMap.put("THREE", "CCC");
        syncMap.put("FOUR", "DDD");
        syncMap.put("FIVE", "EEE");
        
        Set<Entry<String, String>> entrySet = syncMap.entrySet();
        
        for(Entry<String, String> entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }
}

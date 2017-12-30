import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class RemoveKeyValuePairExample{
    public static void main(String[] args){
        
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        
        map.remove("TWO");
        
        map.remove("FIVE", "CCC"); //Nothing will be removed - as no Value 'CCC' corresponding to Key 'FIVE'
        
        Set<Entry<String, String>> entrySet = map.entrySet();
        
        for(Entry<String, String> entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }
}

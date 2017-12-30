import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class ReplaceKeyValuePairExample{
    public static void main(String[] args){
        
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        
        map.replace("TWO", "222");
        map.replace("THREE", "AAA", "333"); //Replace Value with '333' for Key 'THREE' if current Value of Key 'THREE' is 'AAA' - Therefore in this case, the value associated with 'THREE' will not be changed.
        
        Set<Entry<String, String>> entrySet = map.entrySet();
        
        for(Entry<String, String> entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }
}

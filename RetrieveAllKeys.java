import java.util.HashMap;
import java.util.Set;

public class RetrieveAllKeysExample{
    public static void main(String[] args){
        
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        
        map.put(1, "AAA");
        map.put(2, "BBB");
        map.put(3, "CCC");
        map.put(4, "DDD");
        map.put(5, "EEE");
        
        Set<Integer> keySet = map.keySet();
        
        for(Integer key : keySet){
            System.out.println(key);
        }
    }
}

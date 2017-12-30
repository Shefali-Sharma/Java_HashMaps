import java.util.HashMap;
import java.util.Collection;

public class RetrieveAllValuesExample{
    public static void main(String[] args){
        
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        
        map.put(1, "AAA");
        map.put(2, "BBB");
        map.put(3, "CCC");
        map.put(4, "DDD");
        map.put(5, "EEE");
        
        Collection<String> valueSet = map.values();
        
        for(String value : valueSet){
            System.out.println(value);
        }
    }
}

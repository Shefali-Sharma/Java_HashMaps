import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//Java Hashmaps are un-ordered - items are not retrieved in the order in which they were added to the collection
public class AddKeyValuePairsExample{
    public static void main(String[] args){
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        //Inserting key-value pairs to map using put()
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        map.put("FIVE", 5);
        
        //--------------------------------------------------------
        
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        
        System.out.println();
        
        //-----------------Same can be done as below---------------
        
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        
        for(Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        System.out.println();
        
        //--------------------------------------------------------
        //Creating another HashMap
        HashMap<String, Integer> anotherMap = new HashMap<String, Integer>();
        
        anotherMap.put("SIX", 6);
        anotherMap.put("SEVEN", 7);
        
        //Inserting key-value pairs of map to anotherMap
        anotherMap.putAll(map);
        
        entrySet = anotherMap.entrySet();
        
        for(Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }
}

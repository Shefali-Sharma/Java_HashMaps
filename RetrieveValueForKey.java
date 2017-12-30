import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RetrieveValueForGivenKeyExample{
    public static void main(String[] args){
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        //Inserting key-value pairs to map using put()
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        
        int value = map.get("TWO");
        
        System.out.println(value);
        
    }
}

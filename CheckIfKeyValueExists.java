import java.util.HashMap;

public class CheckIfKeyValuePiarExistsExample{
    public static void main(String[] args){
        
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        
        map.put(1, 1.1);
        map.put(2, 2.2);
        map.put(3, 3.3);
        map.put(5, 5.5);
        
        System.out.println(map.containsKey(3));     //Returns 'true'
        System.out.println(map.containsValue(3.3)); //Returns 'true'
        
        System.out.println(map.containsKey(4));     //Returns 'false'
        System.out.println(map.containsValue(4.4)); //Returns 'false'
        
    }
}

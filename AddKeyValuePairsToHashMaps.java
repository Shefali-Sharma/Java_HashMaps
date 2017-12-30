import java.util.HashMap;

public class ExampleCreateHashMaps{
    public static void main(String[] args){
        
        //Create HashMap with default initial capacity and load factor
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        
        //Create HashMap with 30 as initial capacity
        HashMap<String, Integer> map2 = new HashMap<String, Integer>(30);
        
        //Create HashMap with 30 as initial capacity and 1.5 as load factor
        HashMap<String, Integer> map3 = new HashMap<String, Integer>(30, 1.5f);
        
        //Create HashMap by copying another HashMap
        HashMap<String, Integer> map4 = new HashMap<String, Integer>(map1);
    }
}

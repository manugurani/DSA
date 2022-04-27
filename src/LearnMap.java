import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
       // Map<Integer,String> mp=new HashMap<>();
        Map<Integer,String> mp=new TreeMap<>();
        mp.put(1,"Manoj");
       // mp.put(2,"Manoj");
        mp.put(4,"Manoj");
        mp.put(5,"Manoj");
        mp.put(6,"Manoj");
        mp.put(7,"Manoj");
        mp.putIfAbsent(2,"raju");
        System.out.println(mp.containsValue("maonj"));
        System.out.println(mp.isEmpty());
        for(Map.Entry<Integer,String> e:mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            if(e.getKey()>2){
                System.out.println(e);
                break;
            }
        }
        for(Integer key:mp.keySet()){
            System.out.println(key);
        }
        for(String val:mp.values()){
            System.out.println(val);
        }
    }

}
/*
onnly difference is between the hashmap and treemap is tree map strores the values based on key sorted order...
but hashmap strores based on keys but in random order... this is the majoir difference between the hashmap and treemap...
it is very important  data structure to use in daily coidng...!
 */
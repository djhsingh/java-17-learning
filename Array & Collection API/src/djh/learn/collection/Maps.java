import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Maps {
    public static void main(String[] args) {
        System.out.println("Maps learning........");
        HashMap<Integer,String> maps = new HashMap();
        maps.put(1,"Deepak");
        maps.put(3,"Ajay");
        maps.put(5,"Rahul");
        System.out.println(maps);
        System.out.println(maps.containsValue("Deepak"));
        System.out.println(maps.containsKey(3));
        Set<Entry<Integer,String>> entry  = maps.entrySet();
        for (Entry ent: entry){
            System.out.println(ent);
        }
        
        Map<String,String> mapz = Map.of("India","Delhi","Pak","IslamaBad");
        TreeMap<String,String>  tMap = new TreeMap<String,String> (mapz);
        System.out.println(tMap); 


    }
}

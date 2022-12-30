package gt.learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapLearning {
    public void learnHashMap(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("name","Godwin");
        map.put("age","30");
        map.put("lastname","Theophilus");
        map.put("prof","S.E");

        System.out.println(map);
        System.out.println(map.keySet());
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
        System.out.println(map.entrySet());
        map.entrySet().forEach(data -> {
            System.out.println(data.getKey() + " , " + data.getValue());
        });
        map.forEach((x,y) -> {
            System.out.println(x);
            System.out.println(y);
        });
    }
}

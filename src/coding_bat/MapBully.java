package coding_bat;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
/*
Modify and return the given map as follows:
if the key "a" has a value, set the key "b" to have that value,
and set the key "a" to have the value "". Basically "b" is a bully,
taking the value and replacing it with the empty string.
 */
    public static void main(String[] args) {
        Map<String, String> bullyMap = new HashMap<>();
        bullyMap.put("a", "candy" );
        bullyMap.put("b", "dirt" );
        MapBully mapB = new MapBully();

        System.out.println(mapB.mapBully(bullyMap));
    }

    public Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

}

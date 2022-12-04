import java.util.HashMap;
import java.util.Map;

public class ClassMap {

    //Обьявление Map
    Map<Integer, String> people = new HashMap<>();

    public void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void addValueMap(Map<Integer, String> map, Integer inn, String name) {
        map.put(inn, name);
    }

    public void getObjectMap(Map<Integer, String> map, Integer key) {
        System.out.println("Объект " + map.get(key) + " найден");
    }

    public void removeObjectMap(Map<Integer, String> map, Integer key) {
        System.out.println("Объект " + map.remove(key) + " удалён");
    }
}

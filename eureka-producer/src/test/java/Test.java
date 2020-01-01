import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liurui
 * @date 2020/1/1 22:31
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 12);
        map.put(2, 12);
        map.put(3, 12);

        //get map values
        Collection<Integer> collection = map.values();
        //foreach map values
        collection.forEach(System.out::println);


    }
}

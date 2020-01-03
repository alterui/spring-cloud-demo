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

        Integer put1 = map.put(1, 12);
        Integer put2 = map.put(1, 12);
        Integer put3 = map.put(1, 123);

        System.out.println(put1);
        System.out.println(put2);
        System.out.println(put3);

    }
}

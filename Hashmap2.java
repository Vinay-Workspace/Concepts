
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap2 {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "Hello");
        hm.put(1, "Frank");
        hm.put(42, "Serria");
        hm.put(3, "Gilbert");
        System.out.println(hm.get(42));
        hm.remove(42);
        System.out.println(hm.get(42));

        Set<Entry<Integer, String>> entrySet = hm.entrySet();
        Iterator<Entry<Integer, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

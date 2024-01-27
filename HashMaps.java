import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs
        ages.put("Markinson Industries", 25);
        ages.put("Hector Ent", 22);
        ages.put("Mankind Industries", 22);

        // Accessing values using keys
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

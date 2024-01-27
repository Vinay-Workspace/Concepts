import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {

    public static void hashset() {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("albert", 25);
        hashMap.put("Foxtrot", 30);
        hashMap.put("serria", 22);

        // Accessing values
        int ageOfAlice = hashMap.get("albert");
        System.out.println("Age of albert: " + ageOfAlice);

        // Iterating through the HashMap
        for (String name : hashMap.keySet()) {
            System.out.println(name + ": " + hashMap.get(name));
        }
    }

    public static void main(String[] args) {
        // Creating a Hashtable

        hashset();
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put("albert", 25);
        hashtable.put("Foxtrot", 30);
        hashtable.put("serria", 22);

        // Accessing values
        int age = hashtable.get("albert");
        System.out.println("Age of albert: " + age);

        // Iterating through the Hashtable
        for (String name : hashtable.keySet()) {
            System.out.println(name + ": " + hashtable.get(name));
        }
    }
}

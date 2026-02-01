
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// ===================== HashMap Demo =====================
public class L02_HashMapDemo {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // ===================== 1. Put (Add) =====================
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(4, "Orange");

        // Overwrites value for key 2
        map.put(2, "Grapes");

        // ===================== 2. Get =====================
        System.out.println("Value for key 3: " + map.get(3));

        // ===================== 3. Contains =====================
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value Apple? " + map.containsValue("Apple"));

        // ===================== 4. Delete (Remove) =====================
        map.remove(1);
        System.out.println("After deleting key 1: " + map);

        // ===================== 5. Size =====================
        System.out.println("Size of HashMap: " + map.size());

        // ===================== 6. Print All (Entry Set) =====================
        System.out.println("Print all key-value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ===================== 7. Print Keys =====================
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // ===================== 8. Print Values =====================
        Collection<String> values = map.values();
        System.out.println("Values: " + values);

        // ===================== 9. Iterator =====================
        System.out.print("Using Iterator: ");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}

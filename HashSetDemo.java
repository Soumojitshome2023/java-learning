
import java.util.HashSet;
import java.util.Iterator;

// ===================== HashSet Demo =====================
public class HashSetDemo {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // ===================== 1. Add =====================
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20); // duplicate, will be ignored

        // ===================== 2. Contains =====================
        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Contains 50? " + set.contains(50));

        // ===================== 3. Delete (Remove) =====================
        set.remove(30);
        System.out.println("After deleting 30: " + set);

        // ===================== 4. Size =====================
        System.out.println("Size of HashSet: " + set.size());

        // ===================== 5. Print All =====================
        System.out.print("Print all elements: ");
        for (int val : set) {
            System.out.print(val + " ");
        }
        System.out.println();

        // ===================== 6. Iterator =====================
        System.out.print("Using Iterator: ");
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}

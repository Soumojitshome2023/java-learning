// File Name: L02_Collections.java
// Topic: Collections Framework in Java

import java.util.*;

public class L02_Collections {

    // Main method: program starts here
    public static void main(String[] args) {

        // ===================== LIST INTERFACE =====================
        ArrayList<Integer> arrayList = new ArrayList<>();

        // add()
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("ArrayList: " + arrayList);

        // add at index
        arrayList.add(1, 15);
        System.out.println("After add at index 1: " + arrayList);

        // get()
        System.out.println("Element at index 2: " + arrayList.get(2));

        // set()
        arrayList.set(0, 100);
        System.out.println("After set index 0: " + arrayList);

        // remove by index
        arrayList.remove(2);
        System.out.println("After remove index 2: " + arrayList);

        // remove by object
        arrayList.remove(Integer.valueOf(15));
        System.out.println("After remove element 15: " + arrayList);

        // contains()
        System.out.println("Contains 20? " + arrayList.contains(20));

        // size()
        System.out.println("Size: " + arrayList.size());

        // isEmpty()
        System.out.println("Is empty? " + arrayList.isEmpty());

        // clear()
        arrayList.clear();
        System.out.println("After clear(): " + arrayList);

        // ===================== SET INTERFACE =====================
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("\nHashSet: " + set);

        // remove()
        set.remove(20);
        System.out.println("After remove 20: " + set);

        // contains()
        System.out.println("Contains 10? " + set.contains(10));

        // size()
        System.out.println("Size: " + set.size());

        // ===================== MAP INTERFACE =====================
        HashMap<String, Integer> map = new HashMap<>();

        // put()
        map.put("India", 140);
        map.put("USA", 330);
        map.put("Japan", 125);

        System.out.println("\nHashMap: " + map);

        // get()
        System.out.println("Population of India: " + map.get("India"));

        // containsKey()
        System.out.println("Contains key USA? " + map.containsKey("USA"));

        // containsValue()
        System.out.println("Contains value 125? " + map.containsValue(125));

        // remove()
        map.remove("Japan");
        System.out.println("After remove Japan: " + map);

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ===================== COLLECTIONS CLASS METHODS =====================
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 2, 8, 1));

        // sort()
        Collections.sort(nums);
        System.out.println("\nSorted: " + nums);

        // reverse()
        Collections.reverse(nums);
        System.out.println("Reversed: " + nums);

        // max & min
        System.out.println("Max: " + Collections.max(nums));
        System.out.println("Min: " + Collections.min(nums));

        // shuffle()
        Collections.shuffle(nums);
        System.out.println("Shuffled: " + nums);
    }
}

// Manual HashMap implementation (array + linked list chaining)

import java.util.*;

public class L03_MyHashMapCode {

    static class ManualHashMap<K, V> { // generics

        // ===================== Node =====================
        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes
        private int N; // number of buckets
        private LinkedList<Node>[] buckets;

        // ===================== Constructor =====================
        @SuppressWarnings("unchecked")
        public ManualHashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // ===================== Hash Function =====================
        private int hashFunction(K key) {
            return Math.abs(key.hashCode()) % N;
        }

        // ===================== Search in LinkedList =====================
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        // ===================== Rehash =====================
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;

            N = N * 2;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // ===================== Put =====================
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else { // key exists
                buckets[bi].get(di).value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // ===================== Get =====================
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            }
            return buckets[bi].get(di).value;
        }

        // ===================== Contains Key =====================
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            return searchInLL(key, bi) != -1;
        }

        // ===================== Remove =====================
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            }

            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
        }

        // ===================== Key Set =====================
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // ===================== Is Empty =====================
        public boolean isEmpty() {
            return n == 0;
        }
    }

    // ===================== Main =====================
    public static void main(String[] args) {

        ManualHashMap<String, Integer> map = new ManualHashMap<>();

        System.out.println("---- Adding Elements ----");
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);
        map.put("UK", 70);

        System.out.println("\n---- Printing All Key-Value Pairs ----");
        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("\n---- Updating Value ----");
        map.put("India", 195); // overwrite
        System.out.println("India -> " + map.get("India"));

        System.out.println("\n---- Contains Key Check ----");
        System.out.println("Contains China? " + map.containsKey("China"));
        System.out.println("Contains Japan? " + map.containsKey("Japan"));

        System.out.println("\n---- Removing Element ----");
        map.remove("China");
        System.out.println("China after removal: " + map.get("China")); // null

        System.out.println("\n---- Final Map State ----");
        keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("\n---- Is Map Empty? ----");
        System.out.println(map.isEmpty());
    }

}

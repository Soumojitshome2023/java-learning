public class L10_SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 40, 20, 50, 30};
        int first = arr[0], second = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest = " + second);
    }
}

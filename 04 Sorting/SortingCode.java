// File Name: SortingCode.java
// Topic: Sorting in Java (Bubble, Selection, Insertion, Merge, Quick)

import java.util.Scanner;

public class SortingCode {

    // ===================== MAIN METHOD =====================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Input ----------
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create copies for each sorting algorithm
        int[] bubbleArr = arr.clone();
        int[] selectionArr = arr.clone();
        int[] insertionArr = arr.clone();
        int[] mergeArr = arr.clone();
        int[] quickArr = arr.clone();

        // ---------- Bubble Sort ----------
        bubbleSort(bubbleArr);
        System.out.println("\nBubble Sort:");
        printArray(bubbleArr);

        // ---------- Selection Sort ----------
        selectionSort(selectionArr);
        System.out.println("\nSelection Sort:");
        printArray(selectionArr);

        // ---------- Insertion Sort ----------
        insertionSort(insertionArr);
        System.out.println("\nInsertion Sort:");
        printArray(insertionArr);

        // ---------- Merge Sort ----------
        mergeSort(mergeArr, 0, mergeArr.length - 1);
        System.out.println("\nMerge Sort:");
        printArray(mergeArr);

        // ---------- Quick Sort ----------
        quickSort(quickArr, 0, quickArr.length - 1);
        System.out.println("\nQuick Sort:");
        printArray(quickArr);

        sc.close();
    }

    // ===================== BUBBLE SORT =====================
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ===================== SELECTION SORT =====================
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // ===================== INSERTION SORT =====================
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    // ===================== MERGE SORT =====================
    // si = Starting Index
    // ei = Ending Index
    static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    static void merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (int idx = 0; idx < temp.length; idx++) {
            arr[si + idx] = temp[idx];
        }
    }

    // ===================== QUICK SORT =====================
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ===================== PRINT ARRAY =====================
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

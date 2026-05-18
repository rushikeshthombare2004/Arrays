import java.util.*;

void insertionSort(int arr[]) {

    int n = arr.length;

    for (int i = 1; i < n; i++) {

        int key = arr[i];
        int j = i - 1;

        // Shift elements greater than key
        while (j >= 0 && arr[j] > key) {

            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }
}

void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size:");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter array elements:");

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    insertionSort(arr);

    System.out.println("Sorted Array:");

    for (int num : arr) {
        System.out.print(num + " ");
    }
}

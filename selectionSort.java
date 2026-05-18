import java.util.*;

void selectionSort(int arr[]) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

        int minIndex = i;

        // Find minimum element
        for (int j = i + 1; j < n; j++) {

            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // Swap
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
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

    selectionSort(arr);

    System.out.println("Sorted Array:");

    for (int num : arr) {
        System.out.print(num + " ");
    }
}

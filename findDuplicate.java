import java.util.*;

int findDuplicate(int[] arr) {

    Arrays.sort(arr);

    for (int i = 0, j = i + 1; i < arr.length - 1; i++, j++) {

        if (arr[i] == arr[j]) {
            return arr[i];
        }
    }

    return -1;
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

    int ans = findDuplicate(arr);

    System.out.println("Duplicate element: " + ans);
}

import java.util.*;

int pivot_index(int arr[]) {

    int total = 0;

    // Calculate total sum
    for (int num : arr) {
        total += num;
    }

    int left = 0;

    for (int i = 0; i < arr.length; i++) {

        int right = total - left - arr[i];

        if (left == right) {
            return i;
        }

        left += arr[i];
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

    int ans = pivot_index(arr);

    System.out.println("Pivot Index: " + ans);
}

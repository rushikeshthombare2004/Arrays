import java.util.*;

int search(int[] nums, int target) {

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        else if (nums[mid] < target) {
            left = mid + 1;
        }

        else {
            right = mid - 1;
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

    System.out.println("Enter the search element:");
    int k = sc.nextInt();

    int ans = search(arr, k);

    if (ans >= 0) {
        System.out.println("Element found at index: " + ans);
    }

    else {
        System.out.println("Element not found");
    }
}

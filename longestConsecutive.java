import java.util.*;

int longestConsecutive(int arr[]) {

    if (arr.length == 0) {
        return 0;
    }

    Arrays.sort(arr);

    int max = 1;
    int count = 1;

    for (int i = 1; i < arr.length; i++) {

        if (arr[i - 1] == arr[i]) {
            continue;
        }

        if (arr[i] - arr[i - 1] == 1) {
            count++;
        }

        else {
            count = 1;
        }

        max = Math.max(max, count);
    }

    return max;
}

void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array:");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter array elements:");

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int ans = longestConsecutive(arr);

    System.out.println("Longest Consecutive Length: " + ans);
}

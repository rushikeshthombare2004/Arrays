import java.util.*;

int missingNumber(int[] arr) {

    Arrays.sort(arr);

    if (arr[0] != 0) {
        return 0;
    }

    for (int i = 1; i < arr.length; i++) {

        if (arr[i] - arr[i - 1] > 1) {
            return arr[i - 1] + 1;
        }
    }

    return arr.length;
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

    int ans = missingNumber(arr);

    System.out.println("Missing Number: " + ans);
}

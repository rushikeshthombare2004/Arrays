import java.util.*;

int maxsubArray(int arr[]) {

    int current = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {

        current = Math.max(arr[i], current + arr[i]);

        max = Math.max(max, current);
    }

    return max;
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

    int ans = maxsubArray(arr);

    System.out.println("Maximum SubArray Sum: " + ans);
}

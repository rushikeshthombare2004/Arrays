import java.util.*;

int Kthlargestelement(int arr[], int k) {

    if (k > arr.length || k <= 0) {
        return -1;
    }

    Arrays.sort(arr);

    return arr[arr.length - k];
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

    System.out.println("Enter k:");
    int k = sc.nextInt();

    int ans = Kthlargestelement(arr, k);

    if (ans == -1) {
        System.out.println("Invalid k value");
    } else {
        System.out.println(k + "th Largest Element: " + ans);
    }
}

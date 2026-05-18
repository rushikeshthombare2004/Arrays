import java.util.*;
void main(){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of array:");
  int n = sc.nextInt();
  System.out.println("Enter the Rotation:");
  int k = sc.nextInt();

  int arr [] = new int[n];

  System.out.println("Enter the array element: ");
  for(int i = 0 ; i<n ;i++)
      arr[i]=sc.nextInt();

      for (int i = 0; i < k; i++) {

              int temp = arr[arr.length - 1];

              for (int j = arr.length - 2; j >= 0; j--) {
                  arr[j + 1] = arr[j];
              }

              arr[0] = temp;
          }

    System.out.println("After Rotation:");
    for(int a : arr)
      System.out.print(a +" ");



}

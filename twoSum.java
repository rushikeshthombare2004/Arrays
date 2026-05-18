import java.util.*;

 int[] twoSum(int[] nums, int target) {
       for (int i = 0, j = i +1; i < nums.length; i++,j++) {

               if (nums[i] + nums[j] == target) {
                   return new int[]{i, j};
               }

       }

       return new int[]{-1, -1};
   }

void main(){
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the size:");
  int n = sc.nextInt();

  int arr[] = new int[n];

  System.out.println("Enter the target element:");
  int tar = sc.nextInt();
  System.out.println("Enter array elements:");

  for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
  }

  int ans[] = twoSum(arr, tar);

      System.out.println("Indices: " + ans[0] + " " + ans[1]);

}

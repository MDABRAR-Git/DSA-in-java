import java.util.Arrays;

class Solution {

    public static void getElements(int[] arr, int n) {
          
        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1);  
            return;
        }
  
        Arrays.sort(arr);
  
        int small = arr[1];
  
        int large = arr[n - 2];

         
        System.out.println("Second smallest is " + small);
        System.out.println("Second largest is " + large);
    }
}

public class Main {

    public static void main(String[] args) {
        
        
        int[] arr = {1, 2, 4, 6, 7, 5};
        
         
        int n = arr.length;
        
         
        Solution.getElements(arr, n);
    }
}

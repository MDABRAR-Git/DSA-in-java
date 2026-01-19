class Solution {
    public void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;    

        int temp;
        int j;

        
        j = n - 1;
        for (int i = 0; i < j; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

         
        j = k - 1;
        for (int i = 0; i < j; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

         
        j = n - 1;
        for (int i = k; i < j; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}

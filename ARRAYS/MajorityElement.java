import java.util.*;

class Solution {

    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int el1 = 0, el2 = 0;

        int n = nums.length;
        List<Integer> ls = new ArrayList<>();

        // Step 1: Find potential candidates
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != nums[i]) {
                el1 = nums[i];
                cnt1 = 1;
            } else if (cnt2 == 0 && el1 != nums[i]) {
                el2 = nums[i];
                cnt2 = 1;
            } else if (nums[i] == el1) {
                cnt1++;
            } else if (nums[i] == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        // Step 2: Verify counts
        cnt1 = 0;
        cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        int min = (n / 3) + 1;

        if (cnt1 >= min) ls.add(el1);
        if (cnt2 >= min && el2 != el1) ls.add(el2);

        return ls;
    }

    // Main function for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1};
        int[] nums3 = {1, 2};
        int[] nums4 = {1, 1, 1, 3, 3, 2, 2, 2};

        System.out.println(sol.majorityElement(nums1)); // [3]
        System.out.println(sol.majorityElement(nums2)); // [1]
        System.out.println(sol.majorityElement(nums3)); // [1, 2]
        System.out.println(sol.majorityElement(nums4)); // [1, 2]
    }
}

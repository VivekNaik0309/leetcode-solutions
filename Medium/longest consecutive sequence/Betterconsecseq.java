import java.util.*;
public class Betterconsecseq {
    public static int longestSuccessiveElements(int[] nums) {

        if (nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int n = nums.length;
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = nums[i];
            }

            else if (lastSmaller != nums[i]) {
                cnt = 1;
                lastSmaller = nums[i];
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {102, 4, 100, 101, 3, 2, 1, 1};

        System.out.println(longestSuccessiveElements(nums));
    }
}


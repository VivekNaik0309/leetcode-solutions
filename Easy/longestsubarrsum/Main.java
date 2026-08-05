import java.util.*;

public class Main optimallargest {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 4, 2, 3};
        int k = 3;

        HashMap<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Exact equivalent of: preSumMap[sum] = i;
            preSumMap.put(sum, i);
        }

        System.out.println(maxLen);
    }
}
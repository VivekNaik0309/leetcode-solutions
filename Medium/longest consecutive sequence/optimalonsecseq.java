import java.util.*;
public class optimalonsecseq {



    public static int longestSuccessiveElements(int[] a) {

        int n = a.length;

        if (n == 0)
            return 0;

        int longest = 1;

        HashSet<Integer> st = new HashSet<>();

        // Insert all elements into HashSet
        for (int i = 0; i < n; i++) {
            st.add(a[i]);
        }

        // Check every element
        for (int it : st) {

            // Check if it is the start of a sequence
            if (!st.contains(it - 1)) {

                int cnt = 1;
                int x = it;

                while (st.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] a = {102, 4, 100, 101, 3, 2, 1, 1};

        System.out.println(longestSuccessiveElements(a));
    }
}


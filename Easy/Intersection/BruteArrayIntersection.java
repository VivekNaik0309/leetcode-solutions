import java.util.*;
public class BruteArrayIntersection {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 3, 4};
        int[] B = {2, 2, 3, 3};

        ArrayList<Integer> ans = new ArrayList<>();

        int n = A.length;
        int m = B.length;

        int[] vis = new int[m]; // all elements are 0 by default

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (A[i] == B[j] && vis[j] == 0) {
                    ans.add(A[i]);
                    vis[j] = 1;
                    break;
                }

                if (B[j] > A[i]) {
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
import java.util.ArrayList;

public class OptimalArrayIntersection {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 3, 4};
        int[] B = {2, 2, 3, 3};

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < A.length && j < B.length) {

            if (A[i] < B[j]) {
                i++;
            } 
            else if (B[j] < A[i]) {
                j++;
            } 
            else {
                ans.add(A[i]);
                i++;
                j++;
            }
        }

        System.out.println(ans);
    }
}
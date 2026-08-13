import java.util.*;

public class nextpermutation {
    public static void main(String[] args) {

        int[] A = {2, 1, 5, 4, 3, 0, 0};
        int n = A.length;

        int ind = -1;

        // Step 1: Find the breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no breakpoint, reverse entire array
        if (ind == -1) {
            
            int start = 0;
            int end = n - 1;

            while (start < end) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;

                start++;
                end--;
            }
        }
        else {

            // Step 3: Find element greater than A[ind]
            for (int i = n - 1; i > ind; i--) {

                if (A[i] > A[ind]) {

                    int temp = A[i];
                    A[i] = A[ind];
                    A[ind] = temp;

                    break;
                }
            }

            // Step 4: Reverse the part after ind
            int start = ind + 1;
            int end = n - 1;

            while (start < end) {

                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;

                start++;
                end--;
            }
        }

        // Print result
        System.out.println(Arrays.toString(A));
    }
}
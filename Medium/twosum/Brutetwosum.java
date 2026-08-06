import java.util.*;

public class Brutetwosum {
    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int n = arr.length;

        boolean found = false;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i >= j)
                    continue;

                if (arr[i] + arr[j] == target) {

                    System.out.println("Indices: " + i + " " + j);
                    System.out.println("Values : " + arr[i] + " " + arr[j]);

                    found = true;
                    break;
                }
            }

            if (found)
                break;
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}
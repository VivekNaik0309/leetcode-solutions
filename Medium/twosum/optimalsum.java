import java.util.*;

public class optimalsum {

    public static String read(int n, int[] book, int target) {

        int left = 0;
        int right = n - 1;

        Arrays.sort(book);

        while (left < right) {

            int sum = book[left] + book[right];

            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return "NO";
    }

    public static void main(String[] args) {

        int[] book = {2, 7, 11, 15};
        int target = 9;

        System.out.println(read(book.length, book, target));
    }
}
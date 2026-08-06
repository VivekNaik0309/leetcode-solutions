import java.util.*;

public class bettersum {

    public static String read(int n, int[] book, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            
            int more = target - book[i];

            if (map.containsKey(more)) {
                return "YES";
                // return map.get(more) + " " + i;
            }

            map.put(book[i], i);
        }

        return "NO";
    }

    public static void main(String[] args) {

        int[] book = {2, 6, 5, 8, 11};
        int target = 14;

        System.out.println(read(book.length, book, target));
    }
}


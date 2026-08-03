import java.util.HashMap;
import java.util.Map;

public class usinghashmap {
    public static void main(String[] args) {

        int arr[] = {2, 1, 2, 3, 1};

        // Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Store frequencies
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }

        // Step 2: Find the element occurring once
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("Number appearing once: " + entry.getKey());
                break;
            }

        }
    }
}
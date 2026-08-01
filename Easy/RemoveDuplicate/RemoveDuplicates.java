import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the HashSet
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Copy unique elements back to array
        int index = 0;
        for (int num : set) {
            arr[index] = num;
            index++;
        }

        // Print unique elements
        System.out.println("Unique elements:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nLength after removing duplicates = " + index);
    }
}